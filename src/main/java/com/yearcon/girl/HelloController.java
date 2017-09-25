package com.yearcon.girl;


import org.springframework.web.bind.annotation.*;

/**
 *
 */
@RestController
public class HelloController {



    @RequestMapping(value = "/say", method = RequestMethod.GET)
    public String say() {
        return "Hello Spring Boot!";
    }


    @RequestMapping(value = "/hello/{id}", method = RequestMethod.GET)
    public String hello(@PathVariable("id") String id) {
        int number = 123;
        return "id=" + number;

    }

    //URL后面追加参数  如:  ?id=123
    @RequestMapping(value = "/hello2", method = RequestMethod.GET)
    public String hello2(@RequestParam("id") String id) {
        return "id=" + id;
    }

    //URL后面追加参数  如:  ?id=123 -----设置默认值
    @RequestMapping(value = "/hello3", method = RequestMethod.GET)
    public String hello3(@RequestParam(value = "id", required = false, defaultValue = "0") String id) {
        String myid = id;
        return "id=" + myid;
    }

    //组合注解
    @GetMapping(value = "/hello4")
    public String hello5(@RequestParam(value = "id", required = false, defaultValue = "0") String id) {

        return "id="+id;
    }

}
