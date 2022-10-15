package com.atguigu.boot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 宠物
 * 无参构造器 @NoArgsConstructor
 * 全参构造器 @AllArgsConstructor
 */
@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pet {
    private String name;
}