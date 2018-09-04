package com.demo.controller;

import com.demo.domain.ClinicBase;

import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/clinic")
public class ClinicController {

    @Resource
    private SolrClient client;

    @ResponseBody
    @RequestMapping("/queryClinic")
    public String queryClinic() throws IOException, SolrServerException {

        SolrDocument document = client.getById("my_core", "001");
        if (document != null) {
            System.out.println("solr搜索结果:" + document);
            return document.toString();
        } else {
            System.out.println("没找到!");
            return "";
        }
    }
}
