package com.example.ccshop.web;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by litiancui on 18/1/8.
 */
@RestController
public class HelloController {
    @RequestMapping("/index")
    public String index() {
        return "java考核征途中...";
    }

    @RequestMapping("/hello")
    public String hello(ModelMap map) {
        // 加入一个属性，用来在模板中读取
        map.addAttribute("host", "http://blog.didispace.com");
        // return模板文件的名称，对应src/main/resources/templates/index.html
        return "index";
    }
}
