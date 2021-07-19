package com.linkedbear.architecture.a_original.service.impl;

import com.linkedbear.architecture.a_original.dao.BeanFactory;
import com.linkedbear.architecture.a_original.dao.DemoDao;
import com.linkedbear.architecture.a_original.dao.impl.DemoDaoImpl;
import com.linkedbear.architecture.a_original.service.DemoService;

import java.util.List;

public class DemoServiceImpl  implements DemoService {
    private DemoDao demoDao = BeanFactory.getDemoDao();

    @Override
    public List<String> findAll() {
        return demoDao.findAll();
    }

}
