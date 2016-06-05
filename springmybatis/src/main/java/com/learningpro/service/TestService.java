package com.learningpro.service;

import com.learningpro.domain.Test;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author:<H3>Gavin.C</H3>
 * Date: 13-11-14
 * Time: 上午11:07
 * Email:cnopens@163.com
 * Comment:-
 */
public interface TestService {
    public List<Test> findAll();
    public void addTest(Test test);
//    public void insert(Test test);
//    public List<Test> getTests(Map paramMap);
//    public int getTestsCount(Map paramMap);
}
