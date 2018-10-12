package org.linlinjava.litemall.admin.dao;


import lombok.Data;

import java.time.LocalDateTime;

@Data
public class AdminToken {
    private Integer userId;
    private String token;
    private LocalDateTime expireTime;
    private LocalDateTime updateTime;
}
