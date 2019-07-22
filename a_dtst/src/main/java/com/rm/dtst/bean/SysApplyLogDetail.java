package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:申请流水详情表
 * 创建日期:2019-07-22 09:37:33
 */
@Table("sys_apply_log_detail")
public class SysApplyLogDetail{

   /**
      *主键编号 
      *数据类型：varchar(32) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String id;
   /**
      *申请流水号 
      *数据类型：varchar(32) 
      *是否必填:true 
   **/
   private java.lang.String applyLogId;
   /**
      *申请类型 
      *数据类型：varchar(4) 
      *是否必填:true 
   **/
   private java.lang.String applyType;
   /**
      *业务大类 
      *数据类型：varchar(6) 
      *是否必填:false 
   **/
   private java.lang.String bizCat;
   /**
      *业务子类 
      *数据类型：varchar(4) 
      *是否必填:false 
   **/
   private java.lang.String bizSubCat;
   /**
      *金额 
      *数据类型：decimal(18,2) 
      *是否必填:false 
   **/
   private java.math.BigDecimal amt;
   /**
      *业务编号 
      *数据类型：varchar(100) 
      *是否必填:false 
   **/
   private java.lang.String bussNo;
   /**
      *关联编号 
      *数据类型：varchar(100) 
      *是否必填:false 
   **/
   private java.lang.String realNo;
   /**
      *申请详情 
      *数据类型：varchar(8192) 
      *是否必填:true 
   **/
   private java.lang.String applyDetail;
   /**
      *法人机构 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String legalPersonBrcode;
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
   public java.lang.String getId(){
      return id;
   }

   /**
    *主键编号
    *@param id
    */
   public void setId(java.lang.String id){
      this.id = id;
   }

   /**
    *申请流水号
    *@return java.lang.String
    */
   public java.lang.String getApplyLogId(){
      return applyLogId;
   }

   /**
    *申请流水号
    *@param applyLogId
    */
   public void setApplyLogId(java.lang.String applyLogId){
      this.applyLogId = applyLogId;
   }

   /**
    *申请类型
    *@return java.lang.String
    */
   public java.lang.String getApplyType(){
      return applyType;
   }

   /**
    *申请类型
    *@param applyType
    */
   public void setApplyType(java.lang.String applyType){
      this.applyType = applyType;
   }

   /**
    *业务大类
    *@return java.lang.String
    */
   public java.lang.String getBizCat(){
      return bizCat;
   }

   /**
    *业务大类
    *@param bizCat
    */
   public void setBizCat(java.lang.String bizCat){
      this.bizCat = bizCat;
   }

   /**
    *业务子类
    *@return java.lang.String
    */
   public java.lang.String getBizSubCat(){
      return bizSubCat;
   }

   /**
    *业务子类
    *@param bizSubCat
    */
   public void setBizSubCat(java.lang.String bizSubCat){
      this.bizSubCat = bizSubCat;
   }

   /**
    *金额
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getAmt(){
      return amt;
   }

   /**
    *金额
    *@param amt
    */
   public void setAmt(java.math.BigDecimal amt){
      this.amt = amt;
   }

   /**
    *业务编号
    *@return java.lang.String
    */
   public java.lang.String getBussNo(){
      return bussNo;
   }

   /**
    *业务编号
    *@param bussNo
    */
   public void setBussNo(java.lang.String bussNo){
      this.bussNo = bussNo;
   }

   /**
    *关联编号
    *@return java.lang.String
    */
   public java.lang.String getRealNo(){
      return realNo;
   }

   /**
    *关联编号
    *@param realNo
    */
   public void setRealNo(java.lang.String realNo){
      this.realNo = realNo;
   }

   /**
    *申请详情
    *@return java.lang.String
    */
   public java.lang.String getApplyDetail(){
      return applyDetail;
   }

   /**
    *申请详情
    *@param applyDetail
    */
   public void setApplyDetail(java.lang.String applyDetail){
      this.applyDetail = applyDetail;
   }

   /**
    *法人机构
    *@return java.lang.String
    */
   public java.lang.String getLegalPersonBrcode(){
      return legalPersonBrcode;
   }

   /**
    *法人机构
    *@param legalPersonBrcode
    */
   public void setLegalPersonBrcode(java.lang.String legalPersonBrcode){
      this.legalPersonBrcode = legalPersonBrcode;
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