package com.springboot.sprbt01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
//@Controller
//@ResponseBody
@RestController//等同于@Controller+@ResponseBody，直接返回json

//启动方式（环境中启动）1（不常用）：在本类中添加@EnableAutoConfiguration，写一个main方法
//@EnableAutoConfiguration
//启动方式（环境中启动）2，常使用：在项目中单独新建一个类作为启动类，会将该类同层以及子包下的所有类都扫描到，所以需要注意层级关系，详见com.springboot.sprbt01.Sprbt01Application。
//启动方式（命令行）：“mvn spring-boot:run”，可以在dos下启动（注意需要进入项目根路径），也可以在开发工具的终端启动（如idea的terminal，路径直接是根路径、不用切换）
//启动方式（jar方式）：需要先运行mvn命令进行项目打包，然后“java -jar 包名”即可
public class HelloController {
    @RequestMapping("/hello")
    public String hello() {
        System.out.println("Hello spring boot!");
        System.out.println(12345);
        return "Hello spring boot!";
    }

    /*public static void main(String[] args) {
        SpringApplication.run(HelloController.class,args);
    }*/

    //这里演示全局异常捕获，用到了com.springboot.sprbt01.exception.GlobalExceptionAop类
    //等同于以往的手写aop进行异常捕获
    @RequestMapping("/excep")
    public String excep() {
        int a = 2 / 0;
        return "Hello exception!";
    }

}
