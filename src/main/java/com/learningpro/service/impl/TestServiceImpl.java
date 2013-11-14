package com.learningpro.service.impl;

import com.learningpro.dao.TestMapper;
import com.learningpro.domain.Test;
import com.learningpro.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author:<H3>Gavin.C</H3>
 * Date: 13-11-14
 * Time: 上午11:08
 * Email:cnopens@163.com
 * Comment:-
 */
@SuppressWarnings("SpringJavaAutowiringInspection")
@Service
public class TestServiceImpl implements TestService{

   @Autowired
   private TestMapper testMapper;

    @Override
    public List<Test> findAll() {
        return testMapper.findAll();
    }

    @Override
    public void addTest(Test test) {
        testMapper.insert(test);
    }
}
