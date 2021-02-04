package com.by.bsm.system.service.impl;

import com.by.bsm.system.mapper.TestMapper;
import com.by.bsm.system.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author:Lijw
 * @createTime: 2021-02-04 16:23
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    TestMapper testMapper;

    @Override
    public List<Map<Object, Object>> testMeth() {
        return testMapper.testMeth();
    }
}
