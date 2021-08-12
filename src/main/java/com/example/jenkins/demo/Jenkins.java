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
        System.out.println("测试代码逻辑1");
        System.out.println("测试代码逻辑2");
        System.out.println("测试代码逻辑3");
        int a = 10;
        int b = 10;
        int c = a + b;
        return "hello jenkins , think ! ";
    }
}
