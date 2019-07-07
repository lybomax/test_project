package com.ruimin.service;

import org.springframework.stereotype.Component;

/**
 * @class: CustomerService
 * @title: //主题说明
 * @desc: //模块目的、功能描述
 * @author: LYY
 * @date: 2019年07月01日 13:52
 * @since: 1.0.0
 */
@Component(value="customerService")
public class CustomerService {

  //保存业务方法
  public void save(){
    System.out.println("CustomerService业务层被调用了。。。");
  }


}
