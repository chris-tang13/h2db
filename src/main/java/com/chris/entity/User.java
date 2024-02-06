package com.chris.entity;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("tb_user")
public class User {
    private Integer id;
    private String username;
    private String pwd;
    private Integer salary;//以分为单位,避免浮点运算精度丢失问题

    // 封装数据
    public void setSalary(Integer salary) {
        this.salary = salary * 100;
    }
}

