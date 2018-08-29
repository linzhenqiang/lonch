package com.demo.controller;

import com.demo.domain.SysUserExtend;
import com.demo.service.BusinessService;
import com.demo.domain.Business;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/business")
public class BusinessController {

    private static final Logger log = LoggerFactory.getLogger(BusinessController.class);

    @Resource
    private BusinessService businessService;
    @Resource
    private StringRedisTemplate stringRedisTemplate;
    @Resource
    private RedisTemplate<Object,Object> redisTemplate;

    @RequestMapping("/setValue")
    @Cacheable(value = "yi",key = "'one'")
    public String setValue(String key,String val){
        if(!stringRedisTemplate.hasKey(key)){
            stringRedisTemplate.opsForValue().append(key, val);
            return "使用redis缓存保存数据成功";
        }else{
            stringRedisTemplate.delete(key);
            return key+"已存在";
        }
    }
    @RequestMapping("/getValue")
    public String getValue(String key){
        if(!stringRedisTemplate.hasKey(key)){
            return key+"不存在，请先保存数据";
        }else{
            String value = stringRedisTemplate.opsForValue().get(key);//根据key获取缓存中的val
            return "获取到缓存中的数据："+key+":"+value;
        }
    }
    @RequestMapping("/setObject")
    public String setObject(String key){
        if(!redisTemplate.hasKey(key)){
            redisTemplate.opsForValue().set(key, new SysUserExtend("12","11",1,"我是中文",null));
            return "使用redis缓存保存数据成功";
        }else{
            redisTemplate.delete(key);
            return key+"已存在";
        }
    }

    @RequestMapping("/getObject")
    public String getObject(String key){
        if(!redisTemplate.hasKey(key)){
            return key+"不存在，请先保存数据";
        }else{
            SysUserExtend sysUserExtend = (SysUserExtend)redisTemplate.opsForValue().get(key);//根据key获取缓存中的val
            return "获取到缓存中的数据："+key+":"+sysUserExtend.getValue();
        }
    }

    @RequestMapping("/list")
    public Map list(HttpServletRequest request) {
        try {
            String haha = request.getParameter("canshu");
            Map<String, Object> params = new HashMap<String, Object>();
            List<Business> businessList = businessService.getList(params);
            Map<String, Object> modelMap = new HashMap<String, Object>();
            modelMap.put("haha", haha);
            modelMap.put("businessList", businessList);
            return modelMap;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    @RequestMapping("/getBusinessById")
    public Map getBusinessById(HttpServletRequest request) {
        try {
            String ceshi = request.getParameter("ceshi");
            String id = request.getParameter("id");
            Business business = businessService.get(id);
            Map<String, Object> modelMap = new HashMap<String, Object>();
            modelMap.put("ceshi", ceshi);
            modelMap.put("business", business);
            log.info("getBusinessById出参:"+modelMap);
            return modelMap;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    @RequestMapping("/addBusiness")
    public Map addBusiness(HttpServletRequest request) throws Throwable {
        try {
            Business business =new Business();
            business.setCompanyName("Spring测试333");
            business.setPhone("15900002222");
            businessService.insert(business);
           // System.err.println("businessName:"+business.getCompanyName());
            Map<String, Object> modelMap = new HashMap<String, Object>();
            modelMap.put("code", "0000");
            modelMap.put("businessId", business.getId());
            return modelMap;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
}
