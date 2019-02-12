package com.blysin.springcloud.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.Id;
import java.io.Serializable;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)//chain为true才能实现set链式操作dept.setDb_name("db1").setDeptId(1).setDeptName("测试部门");
public class Dept implements Serializable {
    @Id
    private Integer deptId;
    private String deptName;
    private String db_name;//因为微服务可能有独立的数据库，因此需要有个字段标注使用的是哪个数据库

}
