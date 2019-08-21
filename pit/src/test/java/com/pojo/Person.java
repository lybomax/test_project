package com.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @class: Person
 * @title: //主题说明
 * @desc: //模块目的、功能描述
 * @author: Lyy
 * @date: 2019年08月08日 15:45
 * @since: 1.0.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    private Integer id;
    private String name;

}
