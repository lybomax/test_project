package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:系统序号表
 * 创建日期:2019-07-22 09:37:38
 */
@Table("sys_sequence")
public class SysSequence{

   /**
      *序号名称 
      *数据类型：varchar(64) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String name;
   /**
      *当前序号 
      *数据类型：bigint(20) 
      *是否必填:true 
   **/
   private java.lang.String currentValue;
   /**
      *增幅 
      *数据类型：bigint(20) 
      *是否必填:true 
   **/
   private java.lang.String increment;

  //get和set方法
   /**
    *序号名称
    *@return java.lang.String
    */
   public java.lang.String getName(){
      return name;
   }

   /**
    *序号名称
    *@param name
    */
   public void setName(java.lang.String name){
      this.name = name;
   }

   /**
    *当前序号
    *@return java.lang.String
    */
   public java.lang.String getCurrentValue(){
      return currentValue;
   }

   /**
    *当前序号
    *@param currentValue
    */
   public void setCurrentValue(java.lang.String currentValue){
      this.currentValue = currentValue;
   }

   /**
    *增幅
    *@return java.lang.String
    */
   public java.lang.String getIncrement(){
      return increment;
   }

   /**
    *增幅
    *@param increment
    */
   public void setIncrement(java.lang.String increment){
      this.increment = increment;
   }

}