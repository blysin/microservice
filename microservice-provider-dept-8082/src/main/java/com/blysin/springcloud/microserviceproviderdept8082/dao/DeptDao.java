package com.blysin.springcloud.microserviceproviderdept8082.dao;

import com.blysin.springcloud.domain.BaseMapper;
import com.blysin.springcloud.domain.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface DeptDao extends BaseMapper<Dept> {
}
