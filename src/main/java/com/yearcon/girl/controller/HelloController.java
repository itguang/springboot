package com.yearcon.girl.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 *Springboot 第一次启动
 */
@RestController  //rest结构的控制器,  相当于@controller  + @ResponBody
public class HelloController {



    @RequestMapping(value = "/say", method = RequestMethod.GET)
    public String say() {
        return "Hello Spring Boot2!";
    }

    //
    @RequestMapping(value = "/hello/{id}", method = RequestMethod.GET)
    public String hello(@PathVariable("id") String id) {
        return "id=" + id;

    }

    //URL后面追加参数  如:  ?id=123
    @RequestMapping(value = "/hello2", method = RequestMethod.GET)
    public String hello2(@RequestParam("id") String id) {
        return "id=" + id;
    }

    //URL后面追加参数 如:  ?id=123 -----设置默认值
    @RequestMapping(value = "/hello3", method = RequestMethod.GET)
    public String hello3(@RequestParam(value = "id", required = false, defaultValue = "0") String id) {
        String myid = id;
        int n = 213;
        System.out.println(n);
        
        return "id=" + myid;
    }

    //组合注解
    @GetMapping(value = "/hello4")
    public String hello5(@RequestParam(value = "id", required = false, defaultValue = "0") String id) {

        return "id="+id;

    }

    //获取jsp内置对象
    @RequestMapping(value = "/jspobj")
    public String jspobj(HttpServletRequest request){
        String ip = request.getRemoteAddr();

        return ip;
    }

}
