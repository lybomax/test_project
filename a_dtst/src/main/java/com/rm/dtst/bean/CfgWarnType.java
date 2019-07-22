package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:预警分类表
 * 创建日期:2019-07-22 09:36:13
 */
@Table("cfg_warn_type")
public class CfgWarnType{

   /**
      *预警分类编号 
      *数据类型：varchar(32) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String warnTypeCode;
   /**
      *预警分类名称 
      *数据类型：varchar(60) 
      *是否必填:true 
   **/
   private java.lang.String warnTypeName;
   /**
      *上级预警分类编号 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String parentWarnTypeCode;
   /**
      *备注 
      *数据类型：varchar(100) 
      *是否必填:false 
   **/
   private java.lang.String remark;
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
    *预警分类编号
    *@return java.lang.String
    */
   public java.lang.String getWarnTypeCode(){
      return warnTypeCode;
   }

   /**
    *预警分类编号
    *@param warnTypeCode
    */
   public void setWarnTypeCode(java.lang.String warnTypeCode){
      this.warnTypeCode = warnTypeCode;
   }

   /**
    *预警分类名称
    *@return java.lang.String
    */
   public java.lang.String getWarnTypeName(){
      return warnTypeName;
   }

   /**
    *预警分类名称
    *@param warnTypeName
    */
   public void setWarnTypeName(java.lang.String warnTypeName){
      this.warnTypeName = warnTypeName;
   }

   /**
    *上级预警分类编号
    *@return java.lang.String
    */
   public java.lang.String getParentWarnTypeCode(){
      return parentWarnTypeCode;
   }

   /**
    *上级预警分类编号
    *@param parentWarnTypeCode
    */
   public void setParentWarnTypeCode(java.lang.String parentWarnTypeCode){
      this.parentWarnTypeCode = parentWarnTypeCode;
   }

   /**
    *备注
    *@return java.lang.String
    */
   public java.lang.String getRemark(){
      return remark;
   }

   /**
    *备注
    *@param remark
    */
   public void setRemark(java.lang.String remark){
      this.remark = remark;
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