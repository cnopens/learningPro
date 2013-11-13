package com.test.controller;

import com.test.model.Test;
import com.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Author:<H3>Gavin.C</H3>
 * Date: 13-11-12
 * Time: 下午11:11
 * Email:test@163.com
 * Comment:-
 */
@Controller
public class TestController extends BaseController{

    @Autowired
    private TestService testService;

    public TestService getTestService() {
        return testService;
    }

    @RequestMapping("/test")
    public String test(Model model, @RequestParam(required=false) String type, @RequestParam(required=false) Integer pageNum,
                       @RequestParam(required=false) Integer pageSize) {

        Map<String,Object> map = new HashMap<String,Object>();
        map.put("type", type);
        Integer totalCount = this.testService.getTestsCount(map);

        this.initPage(map, pageNum, pageSize, totalCount);

        List list = this.testService.getTests(map);
        this.initResult(model, list, map);

        return "test";
    }

    @RequestMapping("/test/add")
    public String testAdd(@RequestParam String type,Model model) {
        Test test = new Test();
        test.setType(type);
        this.testService.addTest(test);
        return this.test(model,null,null,null);
    }

    @RequestMapping("/test/del")
    public String testDel(@RequestParam(required=true) Integer id, @RequestParam(required=false) Integer pageNum,
                          @RequestParam(required=false) Integer pageSize, Model model) {
        this.testService.delTest(id);
        return this.test(model, null, pageNum, pageSize);
    }

    @RequestMapping("/test/toEdit")
    public String testToEdit(@RequestParam(required=true) Integer id, Model model) {
        Test test = this.testService.getTestById(id);
        model.addAttribute("test", test);
        return "testEdit";
    }

    @RequestMapping("/test/edit")
    public String testedit(@RequestParam(required=true) Integer id,
                           @RequestParam String type,
                           @RequestParam(required=false) Integer pageNum,
                           @RequestParam(required=false) Integer pageSize,
                           Model model) {
        Test test = new Test();
        test.setType(type);
        this.testService.editTest(test);
        return this.test(model, null, pageNum, pageNum);
    }

}
