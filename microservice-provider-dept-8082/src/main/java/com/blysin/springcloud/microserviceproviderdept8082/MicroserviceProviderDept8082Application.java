package com.blysin.springcloud.microserviceproviderdept8082;

import com.blysin.springcloud.domain.BaseMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan(markerInterface = BaseMapper.class)
public class MicroserviceProviderDept8082Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceProviderDept8082Application.class, args);
    }
}
