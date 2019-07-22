package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:费用参数表
 * 创建日期:2019-07-22 09:36:09
 */
@Table("cfg_fee")
public class CfgFee{

   /**
      *费用代码 
      *数据类型：varchar(32) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String feeCode;
   /**
      *费用名称 
      *数据类型：varchar(100) 
      *是否必填:false 
   **/
   private java.lang.String feeName;
   /**
      *创建时间 
      *数据类型：datetime(6) 
      *是否必填:true 
   **/
   private java.util.Date createTime;
   /**
      *更新时间 
      *数据类型：datetime(6) 
      *是否必填:true 
   **/
   private java.util.Date updateTime;
   /**
      *更新程序 
      *数据类型：varchar(128) 
      *是否必填:true 
   **/
   private java.lang.String updateProgram;

  //get和set方法
   /**
    *费用代码
    *@return java.lang.String
    */
   public java.lang.String getFeeCode(){
      return feeCode;
   }

   /**
    *费用代码
    *@param feeCode
    */
   public void setFeeCode(java.lang.String feeCode){
      this.feeCode = feeCode;
   }

   /**
    *费用名称
    *@return java.lang.String
    */
   public java.lang.String getFeeName(){
      return feeName;
   }

   /**
    *费用名称
    *@param feeName
    */
   public void setFeeName(java.lang.String feeName){
      this.feeName = feeName;
   }

   /**
    *创建时间
    *@return java.util.Date
    */
   public java.util.Date getCreateTime(){
      return createTime;
   }

   /**
    *创建时间
    *@param createTime
    */
   public void setCreateTime(java.util.Date createTime){
      this.createTime = createTime;
   }

   /**
    *更新时间
    *@return java.util.Date
    */
   public java.util.Date getUpdateTime(){
      return updateTime;
   }

   /**
    *更新时间
    *@param updateTime
    */
   public void setUpdateTime(java.util.Date updateTime){
      this.updateTime = updateTime;
   }

   /**
    *更新程序
    *@return java.lang.String
    */
   public java.lang.String getUpdateProgram(){
      return updateProgram;
   }

   /**
    *更新程序
    *@param updateProgram
    */
   public void setUpdateProgram(java.lang.String updateProgram){
      this.updateProgram = updateProgram;
   }

}