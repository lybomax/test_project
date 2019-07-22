package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:应收账款融资费用流水表
 * 创建日期:2019-07-22 09:36:15
 */
@Table("factoring_cost_out")
public class FactoringCostOut{

   /**
      *主键 
      *数据类型：varchar(32) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String id;
   /**
      *业务编号 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String appNo;
   /**
      *申请类型 
      *数据类型：varchar(4) 
      *是否必填:false 
   **/
   private java.lang.String applyType;
   /**
      *费用基本表ID 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String costInfoId;
   /**
      *收取状态：1-已收、2-未收 
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String status;
   /**
      *固定费用 
      *数据类型：decimal(18,2) 
      *是否必填:false 
   **/
   private java.math.BigDecimal costAmt;
   /**
      *减免金额 
      *数据类型：decimal(18,2) 
      *是否必填:false 
   **/
   private java.math.BigDecimal reduceAmt;
   /**
      *实收费用金额 
      *数据类型：decimal(18,2) 
      *是否必填:false 
   **/
   private java.math.BigDecimal receiveAmt;
   /**
      *收费客户号 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String custId;
   /**
      *扣费账号 
      *数据类型：varchar(50) 
      *是否必填:false 
   **/
   private java.lang.String costAcct;
   /**
      *扣款账户名称 
      *数据类型：varchar(200) 
      *是否必填:false 
   **/
   private java.lang.String costAcctName;
   /**
      *业务品种 
      *数据类型：varchar(10) 
      *是否必填:false 
   **/
   private java.lang.String bussType;
   /**
      *币别 
      *数据类型：char(3) 
      *是否必填:false 
   **/
   private java.lang.String curcd;
   /**
      *备注 
      *数据类型：varchar(50) 
      *是否必填:false 
   **/
   private java.lang.String memo;
   /**
      *通用日期(扣收日期) 
      *数据类型：char(14) 
      *是否必填:false 
   **/
   private java.lang.String commonDate;
   /**
      *插入日期 
      *数据类型：char(8) 
      *是否必填:false 
   **/
   private java.lang.String insertDate;
   /**
      *业务合同号 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String financingContId;
   /**
      *交易流水号 
      *数据类型：varchar(50) 
      *是否必填:false 
   **/
   private java.lang.String txFlowNo;
   /**
      *收费类型：1-系统收取、2-线下收取 
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String chargeClass;
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
    *业务编号
    *@return java.lang.String
    */
   public java.lang.String getAppNo(){
      return appNo;
   }

   /**
    *业务编号
    *@param appNo
    */
   public void setAppNo(java.lang.String appNo){
      this.appNo = appNo;
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
    *收取状态：1-已收、2-未收
    *@return java.lang.String
    */
   public java.lang.String getStatus(){
      return status;
   }

   /**
    *收取状态：1-已收、2-未收
    *@param status
    */
   public void setStatus(java.lang.String status){
      this.status = status;
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
    *减免金额
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getReduceAmt(){
      return reduceAmt;
   }

   /**
    *减免金额
    *@param reduceAmt
    */
   public void setReduceAmt(java.math.BigDecimal reduceAmt){
      this.reduceAmt = reduceAmt;
   }

   /**
    *实收费用金额
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getReceiveAmt(){
      return receiveAmt;
   }

   /**
    *实收费用金额
    *@param receiveAmt
    */
   public void setReceiveAmt(java.math.BigDecimal receiveAmt){
      this.receiveAmt = receiveAmt;
   }

   /**
    *收费客户号
    *@return java.lang.String
    */
   public java.lang.String getCustId(){
      return custId;
   }

   /**
    *收费客户号
    *@param custId
    */
   public void setCustId(java.lang.String custId){
      this.custId = custId;
   }

   /**
    *扣费账号
    *@return java.lang.String
    */
   public java.lang.String getCostAcct(){
      return costAcct;
   }

   /**
    *扣费账号
    *@param costAcct
    */
   public void setCostAcct(java.lang.String costAcct){
      this.costAcct = costAcct;
   }

   /**
    *扣款账户名称
    *@return java.lang.String
    */
   public java.lang.String getCostAcctName(){
      return costAcctName;
   }

   /**
    *扣款账户名称
    *@param costAcctName
    */
   public void setCostAcctName(java.lang.String costAcctName){
      this.costAcctName = costAcctName;
   }

   /**
    *业务品种
    *@return java.lang.String
    */
   public java.lang.String getBussType(){
      return bussType;
   }

   /**
    *业务品种
    *@param bussType
    */
   public void setBussType(java.lang.String bussType){
      this.bussType = bussType;
   }

   /**
    *币别
    *@return java.lang.String
    */
   public java.lang.String getCurcd(){
      return curcd;
   }

   /**
    *币别
    *@param curcd
    */
   public void setCurcd(java.lang.String curcd){
      this.curcd = curcd;
   }

   /**
    *备注
    *@return java.lang.String
    */
   public java.lang.String getMemo(){
      return memo;
   }

   /**
    *备注
    *@param memo
    */
   public void setMemo(java.lang.String memo){
      this.memo = memo;
   }

   /**
    *通用日期(扣收日期)
    *@return java.lang.String
    */
   public java.lang.String getCommonDate(){
      return commonDate;
   }

   /**
    *通用日期(扣收日期)
    *@param commonDate
    */
   public void setCommonDate(java.lang.String commonDate){
      this.commonDate = commonDate;
   }

   /**
    *插入日期
    *@return java.lang.String
    */
   public java.lang.String getInsertDate(){
      return insertDate;
   }

   /**
    *插入日期
    *@param insertDate
    */
   public void setInsertDate(java.lang.String insertDate){
      this.insertDate = insertDate;
   }

   /**
    *业务合同号
    *@return java.lang.String
    */
   public java.lang.String getFinancingContId(){
      return financingContId;
   }

   /**
    *业务合同号
    *@param financingContId
    */
   public void setFinancingContId(java.lang.String financingContId){
      this.financingContId = financingContId;
   }

   /**
    *交易流水号
    *@return java.lang.String
    */
   public java.lang.String getTxFlowNo(){
      return txFlowNo;
   }

   /**
    *交易流水号
    *@param txFlowNo
    */
   public void setTxFlowNo(java.lang.String txFlowNo){
      this.txFlowNo = txFlowNo;
   }

   /**
    *收费类型：1-系统收取、2-线下收取
    *@return java.lang.String
    */
   public java.lang.String getChargeClass(){
      return chargeClass;
   }

   /**
    *收费类型：1-系统收取、2-线下收取
    *@param chargeClass
    */
   public void setChargeClass(java.lang.String chargeClass){
      this.chargeClass = chargeClass;
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