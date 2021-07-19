package com.linkedbear.architecture.a_original.dao.impl;

import com.linkedbear.architecture.a_original.dao.DemoDao;

import java.util.Arrays;
import java.util.List;

public class DemoDaoImpl implements DemoDao {

    @Override
    public List<String> findAll() {
        // 模拟修改SQL的动作
        return Arrays.asList("oracle", "oracle", "oracle");
    }


}
