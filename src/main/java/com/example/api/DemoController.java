package com.example.api;

import act.controller.Controller;
import act.controller.annotation.UrlContext;
import act.db.beetlsql.BeetlSqlTransactional;
import com.example.entity.Demo;
import org.osgl.mvc.annotation.GetAction;
import org.osgl.mvc.annotation.With;

import javax.inject.Inject;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Administrator
 * @date 2019/10/15 14:38
 */
@UrlContext("/demo")
@With(BeetlSqlTransactional.class)
public class DemoController {
    @Inject
    private Demo.Mapper mapper;

    @GetAction("list")
    public Map<String,Object> list(){
        Map<String,Object> map = new HashMap<>();
        map.put("results",mapper.all());
        return map;
    }
}
