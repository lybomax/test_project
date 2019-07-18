package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:应收账款付款提示信息表
 * 创建日期:2019-07-18 10:23:36
 */
@Table("factoring_debt_payment_inf")
public class FactoringDebtPaymentInf{

   /**
      *id 
      *数据类型：varchar(32) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String id;
   /**
      *买方客户号 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String customerBuyer;
   /**
      *买方客户名称 
      *数据类型：varchar(100) 
      *是否必填:false 
   **/
   private java.lang.String buyerName;
   /**
      *提醒日期 
      *数据类型：char(8) 
      *是否必填:false 
   **/
   private java.lang.String remindDate;
   /**
      *最迟付款日 
      *数据类型：char(8) 
      *是否必填:false 
   **/
   private java.lang.String latePaymentDate;
   /**
      *申请笔数 
      *数据类型：int(11) 
      *是否必填:false 
   **/
   private java.lang.Integer applyNum;
   /**
      *申请金额 
      *数据类型：decimal(18,2) 
      *是否必填:false 
   **/
   private java.math.BigDecimal applyAmt;
   /**
      *建立时间 
      *数据类型：char(17) 
      *是否必填:true 
   **/
   private java.lang.String createTime;
   /**
      *最后更新时间 
      *数据类型：char(17) 
      *是否必填:true 
   **/
   private java.lang.String updateTime;
   /**
      *最后更新程序 
      *数据类型：varchar(200) 
      *是否必填:true 
   **/
   private java.lang.String updateProg;

  //get和set方法
   /**
    *id
    *@return java.lang.String
    */
   public java.lang.String getId(){
      return id;
   }

   /**
    *id
    *@param id
    */
   public void setId(java.lang.String id){
      this.id = id;
   }

   /**
    *买方客户号
    *@return java.lang.String
    */
   public java.lang.String getCustomerBuyer(){
      return customerBuyer;
   }

   /**
    *买方客户号
    *@param customerBuyer
    */
   public void setCustomerBuyer(java.lang.String customerBuyer){
      this.customerBuyer = customerBuyer;
   }

   /**
    *买方客户名称
    *@return java.lang.String
    */
   public java.lang.String getBuyerName(){
      return buyerName;
   }

   /**
    *买方客户名称
    *@param buyerName
    */
   public void setBuyerName(java.lang.String buyerName){
      this.buyerName = buyerName;
   }

   /**
    *提醒日期
    *@return java.lang.String
    */
   public java.lang.String getRemindDate(){
      return remindDate;
   }

   /**
    *提醒日期
    *@param remindDate
    */
   public void setRemindDate(java.lang.String remindDate){
      this.remindDate = remindDate;
   }

   /**
    *最迟付款日
    *@return java.lang.String
    */
   public java.lang.String getLatePaymentDate(){
      return latePaymentDate;
   }

   /**
    *最迟付款日
    *@param latePaymentDate
    */
   public void setLatePaymentDate(java.lang.String latePaymentDate){
      this.latePaymentDate = latePaymentDate;
   }

   /**
    *申请笔数
    *@return java.lang.Integer
    */
   public java.lang.Integer getApplyNum(){
      return applyNum;
   }

   /**
    *申请笔数
    *@param applyNum
    */
   public void setApplyNum(java.lang.Integer applyNum){
      this.applyNum = applyNum;
   }

   /**
    *申请金额
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getApplyAmt(){
      return applyAmt;
   }

   /**
    *申请金额
    *@param applyAmt
    */
   public void setApplyAmt(java.math.BigDecimal applyAmt){
      this.applyAmt = applyAmt;
   }

   /**
    *建立时间
    *@return java.lang.String
    */
   public java.lang.String getCreateTime(){
      return createTime;
   }

   /**
    *建立时间
    *@param createTime
    */
   public void setCreateTime(java.lang.String createTime){
      this.createTime = createTime;
   }

   /**
    *最后更新时间
    *@return java.lang.String
    */
   public java.lang.String getUpdateTime(){
      return updateTime;
   }

   /**
    *最后更新时间
    *@param updateTime
    */
   public void setUpdateTime(java.lang.String updateTime){
      this.updateTime = updateTime;
   }

   /**
    *最后更新程序
    *@return java.lang.String
    */
   public java.lang.String getUpdateProg(){
      return updateProg;
   }

   /**
    *最后更新程序
    *@param updateProg
    */
   public void setUpdateProg(java.lang.String updateProg){
      this.updateProg = updateProg;
   }

}