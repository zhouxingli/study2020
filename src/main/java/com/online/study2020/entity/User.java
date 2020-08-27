package com.online.study2020.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class User {
    //@TableId(type = IdType.AUTO)
    //@TableId(type = IdType.ID_WORKER) //mp自带策略，默认
    private Long id;
    private Integer age;
    private String name;
    private String email;
}
