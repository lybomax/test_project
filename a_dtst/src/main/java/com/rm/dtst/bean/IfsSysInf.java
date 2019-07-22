package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:[框架自带]系统全局信息表
 * 创建日期:2019-07-22 09:37:22
 */
@Table("ifs_sys_inf")
public class IfsSysInf{

   /**
      *主键 
      *数据类型：int(11) 
      *是否必填:true 
   **/
   @Id
   private java.lang.Integer id;
   /**
      *系统简称 
      *数据类型：varchar(20) 
      *是否必填:false 
   **/
   private java.lang.String systemName;
   /**
      *交易日期 
      *数据类型：char(8) 
      *是否必填:false 
   **/
   private java.lang.String tbsdy;
   /**
      *批量日期 
      *数据类型：char(8) 
      *是否必填:false 
   **/
   private java.lang.String bhdate;
   /**
      *上一批量日期 
      *数据类型：char(8) 
      *是否必填:false 
   **/
   private java.lang.String lbhdate;
   /**
      *状态 0=联机，1=批量 
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String status;
   /**
      *系统类型 默认1 
      *数据类型：char(2) 
      *是否必填:false 
   **/
   private java.lang.String systemType;
   /**
      *扩展字段 
      *数据类型：varchar(20) 
      *是否必填:false 
   **/
   private java.lang.String miscflgs;

  //get和set方法
   /**
    *主键
    *@return java.lang.Integer
    */
   public java.lang.Integer getId(){
      return id;
   }

   /**
    *主键
    *@param id
    */
   public void setId(java.lang.Integer id){
      this.id = id;
   }

   /**
    *系统简称
    *@return java.lang.String
    */
   public java.lang.String getSystemName(){
      return systemName;
   }

   /**
    *系统简称
    *@param systemName
    */
   public void setSystemName(java.lang.String systemName){
      this.systemName = systemName;
   }

   /**
    *交易日期
    *@return java.lang.String
    */
   public java.lang.String getTbsdy(){
      return tbsdy;
   }

   /**
    *交易日期
    *@param tbsdy
    */
   public void setTbsdy(java.lang.String tbsdy){
      this.tbsdy = tbsdy;
   }

   /**
    *批量日期
    *@return java.lang.String
    */
   public java.lang.String getBhdate(){
      return bhdate;
   }

   /**
    *批量日期
    *@param bhdate
    */
   public void setBhdate(java.lang.String bhdate){
      this.bhdate = bhdate;
   }

   /**
    *上一批量日期
    *@return java.lang.String
    */
   public java.lang.String getLbhdate(){
      return lbhdate;
   }

   /**
    *上一批量日期
    *@param lbhdate
    */
   public void setLbhdate(java.lang.String lbhdate){
      this.lbhdate = lbhdate;
   }

   /**
    *状态 0=联机，1=批量
    *@return java.lang.String
    */
   public java.lang.String getStatus(){
      return status;
   }

   /**
    *状态 0=联机，1=批量
    *@param status
    */
   public void setStatus(java.lang.String status){
      this.status = status;
   }

   /**
    *系统类型 默认1
    *@return java.lang.String
    */
   public java.lang.String getSystemType(){
      return systemType;
   }

   /**
    *系统类型 默认1
    *@param systemType
    */
   public void setSystemType(java.lang.String systemType){
      this.systemType = systemType;
   }

   /**
    *扩展字段
    *@return java.lang.String
    */
   public java.lang.String getMiscflgs(){
      return miscflgs;
   }

   /**
    *扩展字段
    *@param miscflgs
    */
   public void setMiscflgs(java.lang.String miscflgs){
      this.miscflgs = miscflgs;
   }

}