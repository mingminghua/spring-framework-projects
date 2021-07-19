package com.linkedbear.architecture.a_original.dao;

import java.util.Arrays;
import java.util.List;

public class DemoOracleDao implements DemoDao {

    public List<String> findAll() {
        // 模拟修改SQL的动作
        return Arrays.asList("oracle", "oracle", "oracle");
    }
}
