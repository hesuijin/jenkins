package com.example.jenkins.demo;

import org.springframework.beans.factory.annotation.Value;
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

    @Value("${remote.name}")
    private String remoteName;

    @GetMapping("demo")
    public String jenkinsDemo(){
        return "hello jenkins , think ! ";
    }


    /**
     * 测试远程debug
     * @return
     */
    @GetMapping("remoteTest")
    public String remoteTest(){
        String remoteNameTemp = remoteName;
        return remoteNameTemp;
    }

}
