package com.demo.controller;

import com.demo.domain.ClinicBase;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocumentList;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clinic")
public class ClinicController {

    private final static String URL = "http://192.168.29.166:8983/solr/my_core";
    @ResponseBody
    @RequestMapping("/queryClinic")
    public String queryClinic(){

        HttpSolrClient solrClient = new HttpSolrClient(URL);
        SolrQuery query = new SolrQuery();
        query.setSort("createtime",SolrQuery.ORDER.asc); //设置排序参数及排序规则
        String pageNo = "1";  //第几页
        String pageSize = "10"; //每页多少数据
        int startPage = Integer.valueOf(pageNo);
        int pageNum = Integer.valueOf(pageSize);
        query.setStart((startPage-1)*pageNum);//不能直接把pageNo赋值给start,start表示从第一个数据开始，第一条从0开始。
        query.setRows(pageNum);//每页显示数量
        StringBuffer buffer = new StringBuffer();
        String fbfmc = "lin"; //查询条件
        if(!StringUtils.isEmpty(fbfmc)){
            buffer.append("fbfmc:*"+fbfmc+"*"); //如果你的fbfmc字段在solrHome/fbf/conf/manage-schema文件中定义的类型是text_ik，即已经分词了，那么这里可以这么写,如果你定义的是string类型，即没有分词，那这句话的append中的内容需要写成这样buffer.append("fbfmc:*"+fbfmc+"*"),这是solr的查询规则，没有分词最好是加上模糊查询符号"*"
            query.set("q",buffer.toString());
        }else{
            query.set("q","*:*"); //没有传入参数则全部查询
        }
        QueryResponse rsp = null;
        try {
            rsp = solrClient.query(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
        SolrDocumentList results = rsp.getResults();
        System.out.println(results.getNumFound());//查询总条数，该总条数是符合该条件下的总条数，并不是pageSize的数量。
        List<ClinicBase> fbfList = rsp.getBeans(ClinicBase.class);//该方法将返回结果转换为对象
        System.out.println(fbfList.get(0));
        return "";
    }
}
