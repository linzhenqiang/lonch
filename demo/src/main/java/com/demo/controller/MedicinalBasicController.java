package com.demo.controller;

import com.demo.service.MedicinalBasicService;
import com.demo.domain.MedicinalBasic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/medicinalBasic")
public class MedicinalBasicController {

    private static final Logger log = LoggerFactory.getLogger(MedicinalBasicController.class);

    @Resource
    private MedicinalBasicService medicinalBasicService;


    @ResponseBody
    @RequestMapping("/addMedicinalBasic")
    public Map addBusiness(HttpServletRequest request) {
        try {
            MedicinalBasic medicinalBasic =new MedicinalBasic();
            medicinalBasic.setCommodityName("药品测试333");
            medicinalBasicService.insert(medicinalBasic);
            Map<String, Object> modelMap = new HashMap<String, Object>();
            modelMap.put("code", "0000");
            modelMap.put("medicinalBasicId", medicinalBasic.getId());
            return modelMap;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
}
