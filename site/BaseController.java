package com.learningpro.web;

/**
 * Created with IntelliJ IDEA.
 * Author:<H3>Gavin.C</H3>
 * Date: 13-11-12
 * Time: 下午11:10
 * Email:test@163.com
 * Comment:-
 */

import com.learningpro.utils.Pager;
import com.learningpro.utils.TestConstance;
import org.springframework.ui.Model;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class BaseController {

    //初始化分页相关信息
    protected void initPage(Map<String,Object> map, Integer pageNum, Integer pageSize, Integer totalCount){
        if(null==pageSize || pageSize.equals("")){
            pageSize = TestConstance.pageSize;
        }
        if(pageSize>20){
            pageSize = 20;
        }
        Integer totalPage = (totalCount+pageSize-1)/pageSize;
        if(null==pageNum){
            pageNum = 1;
        }else if(pageNum>totalPage){
            pageNum = totalPage;
        }
        map.put("startIndex", Pager.getStartIndex(pageNum, pageSize));
        map.put("pageNum", pageNum);
        map.put("totalPage", totalPage);
        map.put("pageSize", pageSize);
        map.put("totalCount", totalCount);

    }

    //将相关数据放入model
    protected void initResult(Model model, List<Object> list, Map<String,Object> map){
        model.addAttribute("list", list);
        Iterator it = map.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry m = (Map.Entry)it.next();
            model.addAttribute(m.getKey().toString(), m.getValue());
        }
    }

}
