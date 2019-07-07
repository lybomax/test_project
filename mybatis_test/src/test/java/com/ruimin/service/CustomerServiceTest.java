package com.ruimin.service;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
@Slf4j
public class CustomerServiceTest {

  @Test
  public void save() {
    //spring容器
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    //获取bean
    CustomerService customerService=(CustomerService) applicationContext.getBean("customerService");

    customerService.save();
    log.info("aaaa");
  }

  public static void main(String[] args) {
  }
}