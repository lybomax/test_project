package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:系统参数表
 * 创建日期:2019-07-22 09:37:37
 */
@Table("sys_param")
public class SysParam{

   /**
      *主键编号 
      *数据类型：varchar(32) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String paramId;
   /**
      *参数编码 
      *数据类型：varchar(64) 
      *是否必填:true 
   **/
   private java.lang.String paramCode;
   /**
      *参数描述 
      *数据类型：varchar(100) 
      *是否必填:true 
   **/
   private java.lang.String paramDesc;
   /**
      *参数值 
      *数据类型：varchar(512) 
      *是否必填:true 
   **/
   private java.lang.String paramValue;
   /**
      *参数类型编码 
      *数据类型：varchar(64) 
      *是否必填:true 
   **/
   private java.lang.String typeCode;
   /**
      *参数类型名称 
      *数据类型：varchar(60) 
      *是否必填:true 
   **/
   private java.lang.String typeName;
   /**
      *有效标识
            0-无效
            1-有效 
      *数据类型：char(1) 
      *是否必填:true 
   **/
   private java.lang.String validFlag;
   /**
      *排序优先级 
      *数据类型：int(11) 
      *是否必填:false 
   **/
   private java.lang.Integer sortOrder;
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
    *主键编号
    *@return java.lang.String
    */
   public java.lang.String getParamId(){
      return paramId;
   }

   /**
    *主键编号
    *@param paramId
    */
   public void setParamId(java.lang.String paramId){
      this.paramId = paramId;
   }

   /**
    *参数编码
    *@return java.lang.String
    */
   public java.lang.String getParamCode(){
      return paramCode;
   }

   /**
    *参数编码
    *@param paramCode
    */
   public void setParamCode(java.lang.String paramCode){
      this.paramCode = paramCode;
   }

   /**
    *参数描述
    *@return java.lang.String
    */
   public java.lang.String getParamDesc(){
      return paramDesc;
   }

   /**
    *参数描述
    *@param paramDesc
    */
   public void setParamDesc(java.lang.String paramDesc){
      this.paramDesc = paramDesc;
   }

   /**
    *参数值
    *@return java.lang.String
    */
   public java.lang.String getParamValue(){
      return paramValue;
   }

   /**
    *参数值
    *@param paramValue
    */
   public void setParamValue(java.lang.String paramValue){
      this.paramValue = paramValue;
   }

   /**
    *参数类型编码
    *@return java.lang.String
    */
   public java.lang.String getTypeCode(){
      return typeCode;
   }

   /**
    *参数类型编码
    *@param typeCode
    */
   public void setTypeCode(java.lang.String typeCode){
      this.typeCode = typeCode;
   }

   /**
    *参数类型名称
    *@return java.lang.String
    */
   public java.lang.String getTypeName(){
      return typeName;
   }

   /**
    *参数类型名称
    *@param typeName
    */
   public void setTypeName(java.lang.String typeName){
      this.typeName = typeName;
   }

   /**
    *有效标识
            0-无效
            1-有效
    *@return java.lang.String
    */
   public java.lang.String getValidFlag(){
      return validFlag;
   }

   /**
    *有效标识
            0-无效
            1-有效
    *@param validFlag
    */
   public void setValidFlag(java.lang.String validFlag){
      this.validFlag = validFlag;
   }

   /**
    *排序优先级
    *@return java.lang.Integer
    */
   public java.lang.Integer getSortOrder(){
      return sortOrder;
   }

   /**
    *排序优先级
    *@param sortOrder
    */
   public void setSortOrder(java.lang.Integer sortOrder){
      this.sortOrder = sortOrder;
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