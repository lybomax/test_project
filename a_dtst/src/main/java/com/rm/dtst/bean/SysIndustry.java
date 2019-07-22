package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:行业表
 * 创建日期:2019-07-22 09:37:36
 */
@Table("sys_industry")
public class SysIndustry{

   /**
      *行业代码 
      *数据类型：varchar(10) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String industryCode;
   /**
      *行业名称 
      *数据类型：varchar(100) 
      *是否必填:true 
   **/
   private java.lang.String industryName;
   /**
      *行业层级
            1-门类
            2-大类
            3-中类
            4-小类 
      *数据类型：char(1) 
      *是否必填:true 
   **/
   private java.lang.String industryLevel;
   /**
      *上级行业代码 
      *数据类型：varchar(10) 
      *是否必填:false 
   **/
   private java.lang.String parentIndustryCode;

  //get和set方法
   /**
    *行业代码
    *@return java.lang.String
    */
   public java.lang.String getIndustryCode(){
      return industryCode;
   }

   /**
    *行业代码
    *@param industryCode
    */
   public void setIndustryCode(java.lang.String industryCode){
      this.industryCode = industryCode;
   }

   /**
    *行业名称
    *@return java.lang.String
    */
   public java.lang.String getIndustryName(){
      return industryName;
   }

   /**
    *行业名称
    *@param industryName
    */
   public void setIndustryName(java.lang.String industryName){
      this.industryName = industryName;
   }

   /**
    *行业层级
            1-门类
            2-大类
            3-中类
            4-小类
    *@return java.lang.String
    */
   public java.lang.String getIndustryLevel(){
      return industryLevel;
   }

   /**
    *行业层级
            1-门类
            2-大类
            3-中类
            4-小类
    *@param industryLevel
    */
   public void setIndustryLevel(java.lang.String industryLevel){
      this.industryLevel = industryLevel;
   }

   /**
    *上级行业代码
    *@return java.lang.String
    */
   public java.lang.String getParentIndustryCode(){
      return parentIndustryCode;
   }

   /**
    *上级行业代码
    *@param parentIndustryCode
    */
   public void setParentIndustryCode(java.lang.String parentIndustryCode){
      this.parentIndustryCode = parentIndustryCode;
   }

}