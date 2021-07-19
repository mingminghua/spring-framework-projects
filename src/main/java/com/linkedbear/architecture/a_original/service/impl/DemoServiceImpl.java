package com.linkedbear.architecture.a_original.service.impl;

import com.linkedbear.architecture.a_original.dao.BeanFactory;
import com.linkedbear.architecture.a_original.dao.DemoDao;
import com.linkedbear.architecture.a_original.dao.impl.DemoDaoImpl;
import com.linkedbear.architecture.a_original.service.DemoService;

import java.util.List;

public class DemoServiceImpl  implements DemoService {
    private DemoDao demoDao = (DemoDao) BeanFactory.getBean("demoDao");

    @Override
    public List<String> findAll() {
        return demoDao.findAll();
    }

    public DemoServiceImpl() {
        for (int i = 0; i < 10; i++) {
            System.out.println(BeanFactory.getBean("demoDao"));
        }
    }

}
