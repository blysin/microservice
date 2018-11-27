package com.blysin.springcloud.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class Dept implements Serializable {
    private Integer deptId;
    private String deptName;
    private String db_source;//因为微服务可能有独立的数据库，因此需要有个字段标注使用的是哪个数据库

}
