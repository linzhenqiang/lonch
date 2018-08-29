package com.demo.service.Impl;

import com.demo.service.MedicinalBasicService;
import com.demo.dao.MedicinalBasicDao;
import com.demo.domain.MedicinalBasic;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("MedicinalBasicService")
public class MedicinalBasicServiceImpl implements MedicinalBasicService {

    @Resource
    MedicinalBasicDao medicinalBasicDao;

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public void insert(MedicinalBasic medicinalBasic) {
        if(medicinalBasic != null){
            medicinalBasicDao.insert(medicinalBasic);
        }
    }

    @Override
    public void update(MedicinalBasic entity) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public MedicinalBasic get(String id) {
        return null;
    }

    @Override
    public List<MedicinalBasic> getList(Map<String, Object> params) {
        return null;
    }

}
