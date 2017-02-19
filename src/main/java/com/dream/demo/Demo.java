package com.dream.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

/**
 * Created by szqsu on 2017/1/22.
 */
@RestController
public class Demo {


    @Resource
    private ModuleMapper moduleMapper;

    @RequestMapping("/demo")
    public String demo(){
        return moduleMapper.getFirstModule().toString();
    }
}
