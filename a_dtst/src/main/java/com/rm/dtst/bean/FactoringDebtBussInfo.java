package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:应收账款信息流水主表
 * 创建日期:2019-07-18 10:23:34
 */
@Table("factoring_debt_buss_info")
public class FactoringDebtBussInfo{

   /**
      *id 
      *数据类型：varchar(32) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String id;
   /**
      *申请类型:00:录入;01:转让;02:入池;03:出池;04:减值;05:回购;6:核销;07:单据修改;08:催收;09:商纠设定;10:逾期;11:发票融资;12:池融资;13:单据删除;14:商纠解除 
      *数据类型：char(2) 
      *是否必填:false 
   **/
   private java.lang.String applyType;
   /**
      *申请日期 
      *数据类型：char(8) 
      *是否必填:false 
   **/
   private java.lang.String applyDate;
   /**
      *申请编号 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String appNo;
   /**
      *卖方客户号 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String customerSeller;
   /**
      *卖方客户名称 
      *数据类型：varchar(100) 
      *是否必填:false 
   **/
   private java.lang.String sellerName;
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
      *融资合同号 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String financingContId;
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
      *交易日期 
      *数据类型：char(8) 
      *是否必填:false 
   **/
   private java.lang.String businessDate;
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
    *申请类型:00:录入;01:转让;02:入池;03:出池;04:减值;05:回购;6:核销;07:单据修改;08:催收;09:商纠设定;10:逾期;11:发票融资;12:池融资;13:单据删除;14:商纠解除
    *@return java.lang.String
    */
   public java.lang.String getApplyType(){
      return applyType;
   }

   /**
    *申请类型:00:录入;01:转让;02:入池;03:出池;04:减值;05:回购;6:核销;07:单据修改;08:催收;09:商纠设定;10:逾期;11:发票融资;12:池融资;13:单据删除;14:商纠解除
    *@param applyType
    */
   public void setApplyType(java.lang.String applyType){
      this.applyType = applyType;
   }

   /**
    *申请日期
    *@return java.lang.String
    */
   public java.lang.String getApplyDate(){
      return applyDate;
   }

   /**
    *申请日期
    *@param applyDate
    */
   public void setApplyDate(java.lang.String applyDate){
      this.applyDate = applyDate;
   }

   /**
    *申请编号
    *@return java.lang.String
    */
   public java.lang.String getAppNo(){
      return appNo;
   }

   /**
    *申请编号
    *@param appNo
    */
   public void setAppNo(java.lang.String appNo){
      this.appNo = appNo;
   }

   /**
    *卖方客户号
    *@return java.lang.String
    */
   public java.lang.String getCustomerSeller(){
      return customerSeller;
   }

   /**
    *卖方客户号
    *@param customerSeller
    */
   public void setCustomerSeller(java.lang.String customerSeller){
      this.customerSeller = customerSeller;
   }

   /**
    *卖方客户名称
    *@return java.lang.String
    */
   public java.lang.String getSellerName(){
      return sellerName;
   }

   /**
    *卖方客户名称
    *@param sellerName
    */
   public void setSellerName(java.lang.String sellerName){
      this.sellerName = sellerName;
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
    *融资合同号
    *@return java.lang.String
    */
   public java.lang.String getFinancingContId(){
      return financingContId;
   }

   /**
    *融资合同号
    *@param financingContId
    */
   public void setFinancingContId(java.lang.String financingContId){
      this.financingContId = financingContId;
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
    *交易日期
    *@return java.lang.String
    */
   public java.lang.String getBusinessDate(){
      return businessDate;
   }

   /**
    *交易日期
    *@param businessDate
    */
   public void setBusinessDate(java.lang.String businessDate){
      this.businessDate = businessDate;
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