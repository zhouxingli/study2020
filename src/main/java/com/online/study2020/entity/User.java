package com.online.study2020.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.lang.reflect.Field;
import java.util.Date;

@Data
public class User {
    //@TableId(type = IdType.AUTO)
    //@TableId(type = IdType.ID_WORKER) //mp自带策略，默认
    private Long id;
    private Integer age;
    private String name;
    private String email;



    @TableField(fill = FieldFill.INSERT)//添加时自动填充
    private Date createTime;
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    @Version  //乐观锁用到的版本号
    @TableField(fill = FieldFill.INSERT)//添加时自动填充
    private Integer version;

}
