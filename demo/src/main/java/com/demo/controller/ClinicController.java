package com.demo.controller;

import com.demo.domain.ClinicBase;

import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.apache.solr.common.SolrInputDocument;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/clinic")
public class ClinicController {

    @Resource
    private SolrClient solrClient;

    @RequestMapping("/queryClinic")
    public String queryClinic() throws IOException, SolrServerException {

        SolrDocument document = solrClient.getById("clinic_core","66666");
        if (document != null) {
            System.out.println("clinicName:"+document.get("clinicName"));
            System.out.println("solr搜索结果:" + document);
            return document.toString();
        } else {
            System.out.println("没找到!");
            return "";
        }
    }

    @RequestMapping("/query")
    public Map query(String q,String pageStart,String rowNum) throws IOException, SolrServerException {
        SolrQuery params = new SolrQuery();
        params.set("q", "clinicName:"+q);
        params.addSort("id", SolrQuery.ORDER.desc);
        params.setStart(Integer.parseInt(pageStart));
        params.setRows(Integer.parseInt(rowNum));
        // 默认域
        params.set("df", "clinicName");
        // 只查询指定域
        params.set("fl", "id,clinicName,isFrom");
        params.setHighlight(true);
       // params.addHighlightField("clinicName");
        params.setHighlightSimplePre("<span style='color:red'>");
        params.setHighlightSimplePost("</span>");
        QueryResponse queryResponse = solrClient.query("clinic_core", params);
        SolrDocumentList results = queryResponse.getResults();
        if (results.getNumFound()==0) {
            System.out.println(" SolrDocumentList: "+results);
            return null;
        }
        System.out.println("redult:"+results.get(0));
        // 数量，分页用
        long total = results.getNumFound();
        // 获取高亮显示的结果, 高亮显示的结果和查询结果是分开放的
        Map<String, Map<String, List<String>>> highlight = queryResponse.getHighlighting();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("total", total);
        map.put("data", highlight);
        System.out.println("map:"+map);
        return map;
    }

    @RequestMapping("/insertClinic")
    public void insertClinic(String id,String clinicName) {
        SolrInputDocument solr=new SolrInputDocument();
        solr.addField("id", id);
        solr.addField("clinicName", clinicName);
//        solr.addField("isFrom", "123京津冀第一家");
        try {
            solrClient.add("clinic_core",solr);
            solrClient.commit("clinic_core");
            System.out.println("solr添加"+clinicName+"成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
