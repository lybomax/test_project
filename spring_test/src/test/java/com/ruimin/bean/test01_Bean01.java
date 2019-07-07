package com.ruimin.bean;

import com.ruimin.xmlBean.Bean01;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @class: test01_Bean01
 * @title: //主题说明
 * @desc: //模块目的、功能描述
 * @author: LiYingYing
 * @date: 2019年07月02日 11:31
 * @since: 1.0.0
 */
public class test01_Bean01 {
  @Test
  public void test01(){
    ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
    Bean01 bean01 = (Bean01) ac.getBean("bean01");
    System.out.println("bean01 = " + bean01);

  }
}
