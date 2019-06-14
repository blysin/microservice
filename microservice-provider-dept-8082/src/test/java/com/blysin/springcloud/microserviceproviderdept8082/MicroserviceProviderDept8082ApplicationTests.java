package com.blysin.springcloud.microserviceproviderdept8082;

import com.alibaba.fastjson.JSON;
import com.blysin.springcloud.domain.Dept;
import com.blysin.springcloud.microserviceproviderdept8082.dao.DeptDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MicroserviceProviderDept8082ApplicationTests {
    @Autowired
    private DeptDao deptDao;
    @Test
    public void contextLoads() {
        System.out.println(JSON.toJSON(get(1)));;
    }
    public Dept get(int deptId){
        return deptDao.selectByPrimaryKey(deptId);
    }


}
