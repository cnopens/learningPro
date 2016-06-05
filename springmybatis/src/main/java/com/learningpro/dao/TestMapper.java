package com.learningpro.dao;

import com.learningpro.domain.Test;

import java.util.List;
import java.util.Map;

public interface TestMapper{
   public List<Test> findAll();
   public void insert(Test test);
   public List<Test> getTests(Map paramMap);
   public int getTestsCount(Map paramMap);
}