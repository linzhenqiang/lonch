package com.demo.service.Impl;

import com.demo.service.BusinessService;
import com.demo.dao.BusinessDao;
import com.demo.domain.Business;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("BusinessService")
public class BusinessServiceImpl implements BusinessService{

    @Resource
    BusinessDao businessDao;

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public void insert(Business business) {
        if(business != null){
            businessDao.insert(business);
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public void update(Business business) {
        if(business != null){
            businessDao.update(business);
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public void delete(String id) {
        businessDao.delete(id);
    }

    @Override
    public Business get(String id) {
        return businessDao.get(id);
    }

    @Override
    public List<Business> getList(Map<String, Object> params) {
        return businessDao.getList(params);
    }
}
