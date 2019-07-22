package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:订单融资费用收取计划表
 * 创建日期:2019-07-22 09:37:27
 */
@Table("order_cost_plan")
public class OrderCostPlan{

   /**
      *主键 
      *数据类型：varchar(32) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String id;
   /**
      *融资服务合同编号 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String contId;
   /**
      *借据ID 
      *数据类型：char(32) 
      *是否必填:false 
   **/
   private java.lang.String loanId;
   /**
      *费用基本表ID 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String costInfoId;
   /**
      *期数 
      *数据类型：int(11) 
      *是否必填:false 
   **/
   private java.lang.Integer term;
   /**
      *费用收取方id 
      *数据类型：char(32) 
      *是否必填:false 
   **/
   private java.lang.String chargeId;
   /**
      *费用收取方名称 
      *数据类型：char(120) 
      *是否必填:false 
   **/
   private java.lang.String chargeName;
   /**
      *收费金额 
      *数据类型：decimal(18,2) 
      *是否必填:false 
   **/
   private java.math.BigDecimal costAmt;
   /**
      *收费状态：00 未收取 01已收取 02 部分收取 
      *数据类型：char(2) 
      *是否必填:false 
   **/
   private java.lang.String chargeStatus;
   /**
      *收费开始时间 
      *数据类型：date 
      *是否必填:false 
   **/
   private java.util.Date costStartDate;
   /**
      *收费截止时间 
      *数据类型：date 
      *是否必填:false 
   **/
   private java.util.Date costEndDate;
   /**
      *收费总额 
      *数据类型：decimal(18,2) 
      *是否必填:false 
   **/
   private java.math.BigDecimal totalAmt;
   /**
      *收费期限 
      *数据类型：int(11) 
      *是否必填:false 
   **/
   private java.lang.Integer costDays;
   /**
      *剩余收费金额 
      *数据类型：decimal(18,2) 
      *是否必填:false 
   **/
   private java.math.BigDecimal dueAmt;
   /**
      *已收费金额 
      *数据类型：decimal(18,2) 
      *是否必填:false 
   **/
   private java.math.BigDecimal chargeAmt;
   /**
      *建立时间 
      *数据类型：datetime(6) 
      *是否必填:true 
   **/
   private java.util.Date createTime;
   /**
      *最后更新时间 
      *数据类型：datetime(6) 
      *是否必填:true 
   **/
   private java.util.Date updateTime;
   /**
      *最后更新程序 
      *数据类型：varchar(200) 
      *是否必填:true 
   **/
   private java.lang.String updateProg;

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
    *融资服务合同编号
    *@return java.lang.String
    */
   public java.lang.String getContId(){
      return contId;
   }

   /**
    *融资服务合同编号
    *@param contId
    */
   public void setContId(java.lang.String contId){
      this.contId = contId;
   }

   /**
    *借据ID
    *@return java.lang.String
    */
   public java.lang.String getLoanId(){
      return loanId;
   }

   /**
    *借据ID
    *@param loanId
    */
   public void setLoanId(java.lang.String loanId){
      this.loanId = loanId;
   }

   /**
    *费用基本表ID
    *@return java.lang.String
    */
   public java.lang.String getCostInfoId(){
      return costInfoId;
   }

   /**
    *费用基本表ID
    *@param costInfoId
    */
   public void setCostInfoId(java.lang.String costInfoId){
      this.costInfoId = costInfoId;
   }

   /**
    *期数
    *@return java.lang.Integer
    */
   public java.lang.Integer getTerm(){
      return term;
   }

   /**
    *期数
    *@param term
    */
   public void setTerm(java.lang.Integer term){
      this.term = term;
   }

   /**
    *费用收取方id
    *@return java.lang.String
    */
   public java.lang.String getChargeId(){
      return chargeId;
   }

   /**
    *费用收取方id
    *@param chargeId
    */
   public void setChargeId(java.lang.String chargeId){
      this.chargeId = chargeId;
   }

   /**
    *费用收取方名称
    *@return java.lang.String
    */
   public java.lang.String getChargeName(){
      return chargeName;
   }

   /**
    *费用收取方名称
    *@param chargeName
    */
   public void setChargeName(java.lang.String chargeName){
      this.chargeName = chargeName;
   }

   /**
    *收费金额
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getCostAmt(){
      return costAmt;
   }

   /**
    *收费金额
    *@param costAmt
    */
   public void setCostAmt(java.math.BigDecimal costAmt){
      this.costAmt = costAmt;
   }

   /**
    *收费状态：00 未收取 01已收取 02 部分收取
    *@return java.lang.String
    */
   public java.lang.String getChargeStatus(){
      return chargeStatus;
   }

   /**
    *收费状态：00 未收取 01已收取 02 部分收取
    *@param chargeStatus
    */
   public void setChargeStatus(java.lang.String chargeStatus){
      this.chargeStatus = chargeStatus;
   }

   /**
    *收费开始时间
    *@return java.util.Date
    */
   public java.util.Date getCostStartDate(){
      return costStartDate;
   }

   /**
    *收费开始时间
    *@param costStartDate
    */
   public void setCostStartDate(java.util.Date costStartDate){
      this.costStartDate = costStartDate;
   }

   /**
    *收费截止时间
    *@return java.util.Date
    */
   public java.util.Date getCostEndDate(){
      return costEndDate;
   }

   /**
    *收费截止时间
    *@param costEndDate
    */
   public void setCostEndDate(java.util.Date costEndDate){
      this.costEndDate = costEndDate;
   }

   /**
    *收费总额
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getTotalAmt(){
      return totalAmt;
   }

   /**
    *收费总额
    *@param totalAmt
    */
   public void setTotalAmt(java.math.BigDecimal totalAmt){
      this.totalAmt = totalAmt;
   }

   /**
    *收费期限
    *@return java.lang.Integer
    */
   public java.lang.Integer getCostDays(){
      return costDays;
   }

   /**
    *收费期限
    *@param costDays
    */
   public void setCostDays(java.lang.Integer costDays){
      this.costDays = costDays;
   }

   /**
    *剩余收费金额
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getDueAmt(){
      return dueAmt;
   }

   /**
    *剩余收费金额
    *@param dueAmt
    */
   public void setDueAmt(java.math.BigDecimal dueAmt){
      this.dueAmt = dueAmt;
   }

   /**
    *已收费金额
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getChargeAmt(){
      return chargeAmt;
   }

   /**
    *已收费金额
    *@param chargeAmt
    */
   public void setChargeAmt(java.math.BigDecimal chargeAmt){
      this.chargeAmt = chargeAmt;
   }

   /**
    *建立时间
    *@return java.util.Date
    */
   public java.util.Date getCreateTime(){
      return createTime;
   }

   /**
    *建立时间
    *@param createTime
    */
   public void setCreateTime(java.util.Date createTime){
      this.createTime = createTime;
   }

   /**
    *最后更新时间
    *@return java.util.Date
    */
   public java.util.Date getUpdateTime(){
      return updateTime;
   }

   /**
    *最后更新时间
    *@param updateTime
    */
   public void setUpdateTime(java.util.Date updateTime){
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