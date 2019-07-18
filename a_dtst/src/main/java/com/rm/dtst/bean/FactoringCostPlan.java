package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:
 * 创建日期:2019-07-18 10:23:31
 */
@Table("factoring_cost_plan")
public class FactoringCostPlan{

   /**
      *主键 
      *数据类型：varchar(32) 
      *是否必填:true 
   **/
   private java.lang.String id;
   /**
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String contId;
   /**
      *数据类型：varchar(32) 
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
      *数据类型：int(11) 
      *是否必填:false 
   **/
   private java.lang.Integer term;
   /**
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String chargeId;
   /**
      *数据类型：varchar(120) 
      *是否必填:false 
   **/
   private java.lang.String chargeName;
   /**
      *数据类型：decimal(18,2) 
      *是否必填:false 
   **/
   private java.math.BigDecimal costAmt;
   /**
      *数据类型：char(2) 
      *是否必填:false 
   **/
   private java.lang.String chargeStatus;
   /**
      *数据类型：char(8) 
      *是否必填:false 
   **/
   private java.lang.String costStartDate;
   /**
      *数据类型：char(8) 
      *是否必填:false 
   **/
   private java.lang.String costEndDate;
   /**
      *数据类型：decimal(18,2) 
      *是否必填:false 
   **/
   private java.math.BigDecimal totalAmt;
   /**
      *数据类型：int(11) 
      *是否必填:false 
   **/
   private java.lang.Integer costDays;
   /**
      *数据类型：decimal(18,2) 
      *是否必填:false 
   **/
   private java.math.BigDecimal dueAmt;
   /**
      *数据类型：decimal(18,2) 
      *是否必填:false 
   **/
   private java.math.BigDecimal chargeAmt;
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
    *
    *@return java.lang.String
    */
   public java.lang.String getContId(){
      return contId;
   }

   /**
    *
    *@param contId
    */
   public void setContId(java.lang.String contId){
      this.contId = contId;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getLoanId(){
      return loanId;
   }

   /**
    *
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
    *
    *@return java.lang.Integer
    */
   public java.lang.Integer getTerm(){
      return term;
   }

   /**
    *
    *@param term
    */
   public void setTerm(java.lang.Integer term){
      this.term = term;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getChargeId(){
      return chargeId;
   }

   /**
    *
    *@param chargeId
    */
   public void setChargeId(java.lang.String chargeId){
      this.chargeId = chargeId;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getChargeName(){
      return chargeName;
   }

   /**
    *
    *@param chargeName
    */
   public void setChargeName(java.lang.String chargeName){
      this.chargeName = chargeName;
   }

   /**
    *
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getCostAmt(){
      return costAmt;
   }

   /**
    *
    *@param costAmt
    */
   public void setCostAmt(java.math.BigDecimal costAmt){
      this.costAmt = costAmt;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getChargeStatus(){
      return chargeStatus;
   }

   /**
    *
    *@param chargeStatus
    */
   public void setChargeStatus(java.lang.String chargeStatus){
      this.chargeStatus = chargeStatus;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getCostStartDate(){
      return costStartDate;
   }

   /**
    *
    *@param costStartDate
    */
   public void setCostStartDate(java.lang.String costStartDate){
      this.costStartDate = costStartDate;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getCostEndDate(){
      return costEndDate;
   }

   /**
    *
    *@param costEndDate
    */
   public void setCostEndDate(java.lang.String costEndDate){
      this.costEndDate = costEndDate;
   }

   /**
    *
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getTotalAmt(){
      return totalAmt;
   }

   /**
    *
    *@param totalAmt
    */
   public void setTotalAmt(java.math.BigDecimal totalAmt){
      this.totalAmt = totalAmt;
   }

   /**
    *
    *@return java.lang.Integer
    */
   public java.lang.Integer getCostDays(){
      return costDays;
   }

   /**
    *
    *@param costDays
    */
   public void setCostDays(java.lang.Integer costDays){
      this.costDays = costDays;
   }

   /**
    *
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getDueAmt(){
      return dueAmt;
   }

   /**
    *
    *@param dueAmt
    */
   public void setDueAmt(java.math.BigDecimal dueAmt){
      this.dueAmt = dueAmt;
   }

   /**
    *
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getChargeAmt(){
      return chargeAmt;
   }

   /**
    *
    *@param chargeAmt
    */
   public void setChargeAmt(java.math.BigDecimal chargeAmt){
      this.chargeAmt = chargeAmt;
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