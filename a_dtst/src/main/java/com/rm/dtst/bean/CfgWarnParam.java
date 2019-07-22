package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:预警参数表
 * 创建日期:2019-07-22 09:36:12
 */
@Table("cfg_warn_param")
public class CfgWarnParam{

   /**
      *预警id 
      *数据类型：varchar(32) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String warnId;
   /**
      *预警代码 
      *数据类型：varchar(20) 
      *是否必填:true 
   **/
   private java.lang.String warnCode;
   /**
      *预警名称 
      *数据类型：varchar(100) 
      *是否必填:true 
   **/
   private java.lang.String warnName;
   /**
      *预警分类编号 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String warnTypeCode;
   /**
      *预警种类
            01-金额类
            02-期限类 
      *数据类型：char(2) 
      *是否必填:false 
   **/
   private java.lang.String warnClass;
   /**
      *金额类预警阀值 
      *数据类型：decimal(18,2) 
      *是否必填:false 
   **/
   private java.math.BigDecimal thresholdAmt;
   /**
      *期限类预警阀值 
      *数据类型：int(11) 
      *是否必填:false 
   **/
   private java.lang.Integer thresholdDays;
   /**
      *期限类型
            1-到期
            2-逾期 
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String deadlineType;
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
    *预警id
    *@return java.lang.String
    */
   public java.lang.String getWarnId(){
      return warnId;
   }

   /**
    *预警id
    *@param warnId
    */
   public void setWarnId(java.lang.String warnId){
      this.warnId = warnId;
   }

   /**
    *预警代码
    *@return java.lang.String
    */
   public java.lang.String getWarnCode(){
      return warnCode;
   }

   /**
    *预警代码
    *@param warnCode
    */
   public void setWarnCode(java.lang.String warnCode){
      this.warnCode = warnCode;
   }

   /**
    *预警名称
    *@return java.lang.String
    */
   public java.lang.String getWarnName(){
      return warnName;
   }

   /**
    *预警名称
    *@param warnName
    */
   public void setWarnName(java.lang.String warnName){
      this.warnName = warnName;
   }

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
    *预警种类
            01-金额类
            02-期限类
    *@return java.lang.String
    */
   public java.lang.String getWarnClass(){
      return warnClass;
   }

   /**
    *预警种类
            01-金额类
            02-期限类
    *@param warnClass
    */
   public void setWarnClass(java.lang.String warnClass){
      this.warnClass = warnClass;
   }

   /**
    *金额类预警阀值
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getThresholdAmt(){
      return thresholdAmt;
   }

   /**
    *金额类预警阀值
    *@param thresholdAmt
    */
   public void setThresholdAmt(java.math.BigDecimal thresholdAmt){
      this.thresholdAmt = thresholdAmt;
   }

   /**
    *期限类预警阀值
    *@return java.lang.Integer
    */
   public java.lang.Integer getThresholdDays(){
      return thresholdDays;
   }

   /**
    *期限类预警阀值
    *@param thresholdDays
    */
   public void setThresholdDays(java.lang.Integer thresholdDays){
      this.thresholdDays = thresholdDays;
   }

   /**
    *期限类型
            1-到期
            2-逾期
    *@return java.lang.String
    */
   public java.lang.String getDeadlineType(){
      return deadlineType;
   }

   /**
    *期限类型
            1-到期
            2-逾期
    *@param deadlineType
    */
   public void setDeadlineType(java.lang.String deadlineType){
      this.deadlineType = deadlineType;
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