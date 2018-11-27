package com.blysin.springcloud.microserviceproviderdept8082.controller;

import com.blysin.springcloud.domain.Dept;
import com.blysin.springcloud.microserviceproviderdept8082.dao.DeptDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dept")
public class DeptController {
    @Autowired
    private DeptDao deptDao;


    @GetMapping("/{deptId}")
    public Dept getById(@PathVariable int deptId){
        return deptDao.selectByPrimaryKey(deptId);
    }

    @GetMapping("/list")
    public List<Dept> getList(){
        return deptDao.select(null);
    }

    @PostMapping("/add")
    public int addDept(@RequestBody Dept dept){
        return deptDao.insertSelective(dept);

    }
}
