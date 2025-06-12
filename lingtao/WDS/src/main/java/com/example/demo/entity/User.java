package com.example.demo.entity;

import lombok.Data;
import java.util.Date;

@Data
public class User {
    private Long id;
    private String username;
    private String email;
    private String password;
    private Date createdAt;      // 对应数据库字段 created_at
    private Date updatedAt;      // 对应数据库字段 updated_at
    private Integer status;
}
