package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:应收账款融资费用信息表
 * 创建日期:2019-07-22 09:36:15
 */
@Table("factoring_cost_info")
public class FactoringCostInfo{

   /**
      *主键UUID 
      *数据类型：varchar(32) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String id;
   /**
      *关联类型 
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String relaType;
   /**
      *关联业务合同号/协议号 
      *数据类型：varchar(20) 
      *是否必填:false 
   **/
   private java.lang.String relaNo;
   /**
      *费用代码 
      *数据类型：char(4) 
      *是否必填:false 
   **/
   private java.lang.String costCode;
   /**
      *费用名称 
      *数据类型：varchar(100) 
      *是否必填:false 
   **/
   private java.lang.String costName;
   /**
      *费用收取种类 
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String costClass;
   /**
      *收取方式 
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String costType;
   /**
      *扣取方式 
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String chargeType;
   /**
      *计算方式 
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String costCalcType;
   /**
      *固定费用 
      *数据类型：decimal(18,2) 
      *是否必填:false 
   **/
   private java.math.BigDecimal costAmt;
   /**
      *固定费用 
      *数据类型：decimal(18,2) 
      *是否必填:false 
   **/
   private java.math.BigDecimal lowCostAmt;
   /**
      *固定费用 
      *数据类型：decimal(18,2) 
      *是否必填:false 
   **/
   private java.math.BigDecimal upCostAmt;
   /**
      *费用比率(%) 
      *数据类型：decimal(12,6) 
      *是否必填:false 
   **/
   private java.math.BigDecimal costRate;
   /**
      *费用比率(%) 
      *数据类型：decimal(12,6) 
      *是否必填:false 
   **/
   private java.math.BigDecimal lowCostRate;
   /**
      *费用比率(%) 
      *数据类型：decimal(12,6) 
      *是否必填:false 
   **/
   private java.math.BigDecimal upCostRate;
   /**
      *费用收取阶段 
      *数据类型：varchar(2) 
      *是否必填:false 
   **/
   private java.lang.String costPhase;
   /**
      *费用收取类型 
      *数据类型：varchar(2) 
      *是否必填:false 
   **/
   private java.lang.String feeType;
   /**
      *收费账户 
      *数据类型：varchar(30) 
      *是否必填:false 
   **/
   private java.lang.String costAcct;
   /**
      *收费开始日 
      *数据类型：char(8) 
      *是否必填:false 
   **/
   private java.lang.String costStart;
   /**
      *收费结束日 
      *数据类型：char(8) 
      *是否必填:false 
   **/
   private java.lang.String costEnd;
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
    *主键UUID
    *@return java.lang.String
    */
   public java.lang.String getId(){
      return id;
   }

   /**
    *主键UUID
    *@param id
    */
   public void setId(java.lang.String id){
      this.id = id;
   }

   /**
    *关联类型
    *@return java.lang.String
    */
   public java.lang.String getRelaType(){
      return relaType;
   }

   /**
    *关联类型
    *@param relaType
    */
   public void setRelaType(java.lang.String relaType){
      this.relaType = relaType;
   }

   /**
    *关联业务合同号/协议号
    *@return java.lang.String
    */
   public java.lang.String getRelaNo(){
      return relaNo;
   }

   /**
    *关联业务合同号/协议号
    *@param relaNo
    */
   public void setRelaNo(java.lang.String relaNo){
      this.relaNo = relaNo;
   }

   /**
    *费用代码
    *@return java.lang.String
    */
   public java.lang.String getCostCode(){
      return costCode;
   }

   /**
    *费用代码
    *@param costCode
    */
   public void setCostCode(java.lang.String costCode){
      this.costCode = costCode;
   }

   /**
    *费用名称
    *@return java.lang.String
    */
   public java.lang.String getCostName(){
      return costName;
   }

   /**
    *费用名称
    *@param costName
    */
   public void setCostName(java.lang.String costName){
      this.costName = costName;
   }

   /**
    *费用收取种类
    *@return java.lang.String
    */
   public java.lang.String getCostClass(){
      return costClass;
   }

   /**
    *费用收取种类
    *@param costClass
    */
   public void setCostClass(java.lang.String costClass){
      this.costClass = costClass;
   }

   /**
    *收取方式
    *@return java.lang.String
    */
   public java.lang.String getCostType(){
      return costType;
   }

   /**
    *收取方式
    *@param costType
    */
   public void setCostType(java.lang.String costType){
      this.costType = costType;
   }

   /**
    *扣取方式
    *@return java.lang.String
    */
   public java.lang.String getChargeType(){
      return chargeType;
   }

   /**
    *扣取方式
    *@param chargeType
    */
   public void setChargeType(java.lang.String chargeType){
      this.chargeType = chargeType;
   }

   /**
    *计算方式
    *@return java.lang.String
    */
   public java.lang.String getCostCalcType(){
      return costCalcType;
   }

   /**
    *计算方式
    *@param costCalcType
    */
   public void setCostCalcType(java.lang.String costCalcType){
      this.costCalcType = costCalcType;
   }

   /**
    *固定费用
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getCostAmt(){
      return costAmt;
   }

   /**
    *固定费用
    *@param costAmt
    */
   public void setCostAmt(java.math.BigDecimal costAmt){
      this.costAmt = costAmt;
   }

   /**
    *固定费用
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getLowCostAmt(){
      return lowCostAmt;
   }

   /**
    *固定费用
    *@param lowCostAmt
    */
   public void setLowCostAmt(java.math.BigDecimal lowCostAmt){
      this.lowCostAmt = lowCostAmt;
   }

   /**
    *固定费用
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getUpCostAmt(){
      return upCostAmt;
   }

   /**
    *固定费用
    *@param upCostAmt
    */
   public void setUpCostAmt(java.math.BigDecimal upCostAmt){
      this.upCostAmt = upCostAmt;
   }

   /**
    *费用比率(%)
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getCostRate(){
      return costRate;
   }

   /**
    *费用比率(%)
    *@param costRate
    */
   public void setCostRate(java.math.BigDecimal costRate){
      this.costRate = costRate;
   }

   /**
    *费用比率(%)
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getLowCostRate(){
      return lowCostRate;
   }

   /**
    *费用比率(%)
    *@param lowCostRate
    */
   public void setLowCostRate(java.math.BigDecimal lowCostRate){
      this.lowCostRate = lowCostRate;
   }

   /**
    *费用比率(%)
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getUpCostRate(){
      return upCostRate;
   }

   /**
    *费用比率(%)
    *@param upCostRate
    */
   public void setUpCostRate(java.math.BigDecimal upCostRate){
      this.upCostRate = upCostRate;
   }

   /**
    *费用收取阶段
    *@return java.lang.String
    */
   public java.lang.String getCostPhase(){
      return costPhase;
   }

   /**
    *费用收取阶段
    *@param costPhase
    */
   public void setCostPhase(java.lang.String costPhase){
      this.costPhase = costPhase;
   }

   /**
    *费用收取类型
    *@return java.lang.String
    */
   public java.lang.String getFeeType(){
      return feeType;
   }

   /**
    *费用收取类型
    *@param feeType
    */
   public void setFeeType(java.lang.String feeType){
      this.feeType = feeType;
   }

   /**
    *收费账户
    *@return java.lang.String
    */
   public java.lang.String getCostAcct(){
      return costAcct;
   }

   /**
    *收费账户
    *@param costAcct
    */
   public void setCostAcct(java.lang.String costAcct){
      this.costAcct = costAcct;
   }

   /**
    *收费开始日
    *@return java.lang.String
    */
   public java.lang.String getCostStart(){
      return costStart;
   }

   /**
    *收费开始日
    *@param costStart
    */
   public void setCostStart(java.lang.String costStart){
      this.costStart = costStart;
   }

   /**
    *收费结束日
    *@return java.lang.String
    */
   public java.lang.String getCostEnd(){
      return costEnd;
   }

   /**
    *收费结束日
    *@param costEnd
    */
   public void setCostEnd(java.lang.String costEnd){
      this.costEnd = costEnd;
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