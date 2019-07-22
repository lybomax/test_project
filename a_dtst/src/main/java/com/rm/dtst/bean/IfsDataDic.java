package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:[框架自带]数据字典表
 * 创建日期:2019-07-22 09:37:11
 */
@Table("ifs_data_dic")
public class IfsDataDic{

   /**
      *主键 
      *数据类型：varchar(32) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String id;
   /**
      *数据类型编号 
      *数据类型：varchar(20) 
      *是否必填:true 
   **/
   private java.lang.String dataTypeNo;
   /**
      *数据编号 
      *数据类型：varchar(20) 
      *是否必填:true 
   **/
   private java.lang.String dataNo;
   /**
      *数据类型名称 
      *数据类型：varchar(60) 
      *是否必填:false 
   **/
   private java.lang.String dataTypeName;
   /**
      *数据编号长度 
      *数据类型：int(11) 
      *是否必填:false 
   **/
   private java.lang.Integer dataNoLen;
   /**
      *数据名称 
      *数据类型：varchar(150) 
      *是否必填:false 
   **/
   private java.lang.String dataName;
   /**
      *是否有上下限标志 
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String limitFlag;
   /**
      *上限 
      *数据类型：varchar(20) 
      *是否必填:false 
   **/
   private java.lang.String highLimit;
   /**
      *下限 
      *数据类型：varchar(40) 
      *是否必填:false 
   **/
   private java.lang.String lowLimit;
   /**
      *扩展字段 
      *数据类型：varchar(20) 
      *是否必填:false 
   **/
   private java.lang.String miscflgs;

  //get和set方法
   /**
    *主键
    *@return java.lang.String
    */
   public java.lang.String getId(){
      return id;
   }

   /**
    *主键
    *@param id
    */
   public void setId(java.lang.String id){
      this.id = id;
   }

   /**
    *数据类型编号
    *@return java.lang.String
    */
   public java.lang.String getDataTypeNo(){
      return dataTypeNo;
   }

   /**
    *数据类型编号
    *@param dataTypeNo
    */
   public void setDataTypeNo(java.lang.String dataTypeNo){
      this.dataTypeNo = dataTypeNo;
   }

   /**
    *数据编号
    *@return java.lang.String
    */
   public java.lang.String getDataNo(){
      return dataNo;
   }

   /**
    *数据编号
    *@param dataNo
    */
   public void setDataNo(java.lang.String dataNo){
      this.dataNo = dataNo;
   }

   /**
    *数据类型名称
    *@return java.lang.String
    */
   public java.lang.String getDataTypeName(){
      return dataTypeName;
   }

   /**
    *数据类型名称
    *@param dataTypeName
    */
   public void setDataTypeName(java.lang.String dataTypeName){
      this.dataTypeName = dataTypeName;
   }

   /**
    *数据编号长度
    *@return java.lang.Integer
    */
   public java.lang.Integer getDataNoLen(){
      return dataNoLen;
   }

   /**
    *数据编号长度
    *@param dataNoLen
    */
   public void setDataNoLen(java.lang.Integer dataNoLen){
      this.dataNoLen = dataNoLen;
   }

   /**
    *数据名称
    *@return java.lang.String
    */
   public java.lang.String getDataName(){
      return dataName;
   }

   /**
    *数据名称
    *@param dataName
    */
   public void setDataName(java.lang.String dataName){
      this.dataName = dataName;
   }

   /**
    *是否有上下限标志
    *@return java.lang.String
    */
   public java.lang.String getLimitFlag(){
      return limitFlag;
   }

   /**
    *是否有上下限标志
    *@param limitFlag
    */
   public void setLimitFlag(java.lang.String limitFlag){
      this.limitFlag = limitFlag;
   }

   /**
    *上限
    *@return java.lang.String
    */
   public java.lang.String getHighLimit(){
      return highLimit;
   }

   /**
    *上限
    *@param highLimit
    */
   public void setHighLimit(java.lang.String highLimit){
      this.highLimit = highLimit;
   }

   /**
    *下限
    *@return java.lang.String
    */
   public java.lang.String getLowLimit(){
      return lowLimit;
   }

   /**
    *下限
    *@param lowLimit
    */
   public void setLowLimit(java.lang.String lowLimit){
      this.lowLimit = lowLimit;
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