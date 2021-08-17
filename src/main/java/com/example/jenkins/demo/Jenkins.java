package com.example.jenkins.demo;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
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
        SXSSFWorkbook workbook = new SXSSFWorkbook(1000);
        Sheet sheet = workbook.createSheet("我是sheet名称");
        Row row;
        row = sheet.createRow(0);
        row.createCell(0).setCellValue("hesuijin");

        String tmpDir = System.getProperty("java.io.tmpdir");
        return tmpDir;
//        return "hello jenkins , think ! ";
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

    public static void main(String[] args) {
        String tmpDir = System.getProperty("java.io.tmpdir");
        System.out.println(tmpDir);


        System.getProperty( "java.io.tmpdir");
    }

}
