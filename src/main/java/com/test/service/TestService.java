package com.test.service;

import com.test.mapper.TestMapper;
import com.test.model.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Author:<H3>Gavin.C</H3>
 * Date: 13-11-13
 * Time: 上午9:52
 * Email:cnopens@163.com
 * Comment:-
 */
@Service
public class TestService {

    @Autowired
    private TestMapper testMapper;


    public List<Test> getTests(Map paramMap) {
        return testMapper.getTests(paramMap);
    }

    public int getTestsCount(Map paramMap) {
        return testMapper.getTestsCount(paramMap);
    }


    public void addTest(Test test) {
        testMapper.addTest(test);
    }

    public void delTest(Integer id) {
        testMapper.deleteByPrimaryKey(id);
    }

    public void editTest(Test test) {
        testMapper.editTest(test);
    }

    public Test getTestById(Integer id) {
        return testMapper.getTestById(id);
    }
}