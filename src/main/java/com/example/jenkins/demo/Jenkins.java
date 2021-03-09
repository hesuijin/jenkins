package com.example.jenkins.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author HeSuiJin
 * @Date 2021/3/8 20:08
 * @Description:
 */
@RestController
@RequestMapping("/jenkins")
public class Jenkins {

    @GetMapping("demo")
    public String jenkinsDemo(){
        return "hello jenkins , think !!!";
    }
}
