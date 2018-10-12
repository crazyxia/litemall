package org.linlinjava.litemall.admin.util;

import lombok.Data;

import java.util.List;

@Data
public class CatVo {
    private Integer value = null;
    private String label = null;
    private List children = null;
}
