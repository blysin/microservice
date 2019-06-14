package com.blysin.springcloud.microserviceproviderdept8082.controller;

import com.blysin.springcloud.domain.Dept;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demo")
public class DemoController {


    @RequestMapping("test")
    public Dept test(){
        Dept dept = new Dept().toBuilder().deptUnid(1).deptName("南威测试部").dbSource("db1").build();
        return dept;
    }

}
