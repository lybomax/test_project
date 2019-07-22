package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:订单信息表
 * 创建日期:2019-07-22 09:37:30
 */
@Table("order_voucher")
public class OrderVoucher{

   /**
      *订单编号 
      *数据类型：varchar(64) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String orderId;
   /**
      *订单编号 
      *数据类型：varchar(64) 
      *是否必填:true 
   **/
   private java.lang.String orderNo;
   /**
      *文件资源编号 
      *数据类型：varchar(32) 
      *是否必填:true 
   **/
   private java.lang.String resourceId;
   /**
      *融资合同编号 
      *数据类型：varchar(32) 
      *是否必填:true 
   **/
   private java.lang.String loanContractId;
   /**
      *客户号 
      *数据类型：varchar(32) 
      *是否必填:true 
   **/
   private java.lang.String custId;
   /**
      *客户名称 
      *数据类型：varchar(100) 
      *是否必填:false 
   **/
   private java.lang.String custName;
   /**
      *核心企业编号 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String coreCustId;
   /**
      *核心企业名称 
      *数据类型：varchar(100) 
      *是否必填:false 
   **/
   private java.lang.String coreName;
   /**
      *订单类型
            1-电子订单
            2-合同订单
            3-虚拟订单 
      *数据类型：char(1) 
      *是否必填:true 
   **/
   private java.lang.String orderType;
   /**
      *订单日期 
      *数据类型：date 
      *是否必填:true 
   **/
   private java.util.Date orderDate;
   /**
      *预计交货日期 
      *数据类型：date 
      *是否必填:false 
   **/
   private java.util.Date expectDeliveryDate;
   /**
      *订单币种 
      *数据类型：char(3) 
      *是否必填:true 
   **/
   private java.lang.String currency;
   /**
      *订单金额 
      *数据类型：decimal(18,2) 
      *是否必填:false 
   **/
   private java.math.BigDecimal amt;
   /**
      *订单净额 
      *数据类型：decimal(18,2) 
      *是否必填:true 
   **/
   private java.math.BigDecimal netAmt;
   /**
      *备注 
      *数据类型：varchar(100) 
      *是否必填:false 
   **/
   private java.lang.String memo;
   /**
      *订单信息来源 
      *数据类型：varchar(20) 
      *是否必填:false 
   **/
   private java.lang.String source;
   /**
      *订单状态
            01-已录入
            02-已融资
            03-已录入交货后凭证 
      *数据类型：char(2) 
      *是否必填:false 
   **/
   private java.lang.String orderStatus;
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
    *订单编号
    *@return java.lang.String
    */
   public java.lang.String getOrderId(){
      return orderId;
   }

   /**
    *订单编号
    *@param orderId
    */
   public void setOrderId(java.lang.String orderId){
      this.orderId = orderId;
   }

   /**
    *订单编号
    *@return java.lang.String
    */
   public java.lang.String getOrderNo(){
      return orderNo;
   }

   /**
    *订单编号
    *@param orderNo
    */
   public void setOrderNo(java.lang.String orderNo){
      this.orderNo = orderNo;
   }

   /**
    *文件资源编号
    *@return java.lang.String
    */
   public java.lang.String getResourceId(){
      return resourceId;
   }

   /**
    *文件资源编号
    *@param resourceId
    */
   public void setResourceId(java.lang.String resourceId){
      this.resourceId = resourceId;
   }

   /**
    *融资合同编号
    *@return java.lang.String
    */
   public java.lang.String getLoanContractId(){
      return loanContractId;
   }

   /**
    *融资合同编号
    *@param loanContractId
    */
   public void setLoanContractId(java.lang.String loanContractId){
      this.loanContractId = loanContractId;
   }

   /**
    *客户号
    *@return java.lang.String
    */
   public java.lang.String getCustId(){
      return custId;
   }

   /**
    *客户号
    *@param custId
    */
   public void setCustId(java.lang.String custId){
      this.custId = custId;
   }

   /**
    *客户名称
    *@return java.lang.String
    */
   public java.lang.String getCustName(){
      return custName;
   }

   /**
    *客户名称
    *@param custName
    */
   public void setCustName(java.lang.String custName){
      this.custName = custName;
   }

   /**
    *核心企业编号
    *@return java.lang.String
    */
   public java.lang.String getCoreCustId(){
      return coreCustId;
   }

   /**
    *核心企业编号
    *@param coreCustId
    */
   public void setCoreCustId(java.lang.String coreCustId){
      this.coreCustId = coreCustId;
   }

   /**
    *核心企业名称
    *@return java.lang.String
    */
   public java.lang.String getCoreName(){
      return coreName;
   }

   /**
    *核心企业名称
    *@param coreName
    */
   public void setCoreName(java.lang.String coreName){
      this.coreName = coreName;
   }

   /**
    *订单类型
            1-电子订单
            2-合同订单
            3-虚拟订单
    *@return java.lang.String
    */
   public java.lang.String getOrderType(){
      return orderType;
   }

   /**
    *订单类型
            1-电子订单
            2-合同订单
            3-虚拟订单
    *@param orderType
    */
   public void setOrderType(java.lang.String orderType){
      this.orderType = orderType;
   }

   /**
    *订单日期
    *@return java.util.Date
    */
   public java.util.Date getOrderDate(){
      return orderDate;
   }

   /**
    *订单日期
    *@param orderDate
    */
   public void setOrderDate(java.util.Date orderDate){
      this.orderDate = orderDate;
   }

   /**
    *预计交货日期
    *@return java.util.Date
    */
   public java.util.Date getExpectDeliveryDate(){
      return expectDeliveryDate;
   }

   /**
    *预计交货日期
    *@param expectDeliveryDate
    */
   public void setExpectDeliveryDate(java.util.Date expectDeliveryDate){
      this.expectDeliveryDate = expectDeliveryDate;
   }

   /**
    *订单币种
    *@return java.lang.String
    */
   public java.lang.String getCurrency(){
      return currency;
   }

   /**
    *订单币种
    *@param currency
    */
   public void setCurrency(java.lang.String currency){
      this.currency = currency;
   }

   /**
    *订单金额
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getAmt(){
      return amt;
   }

   /**
    *订单金额
    *@param amt
    */
   public void setAmt(java.math.BigDecimal amt){
      this.amt = amt;
   }

   /**
    *订单净额
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getNetAmt(){
      return netAmt;
   }

   /**
    *订单净额
    *@param netAmt
    */
   public void setNetAmt(java.math.BigDecimal netAmt){
      this.netAmt = netAmt;
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
    *订单信息来源
    *@return java.lang.String
    */
   public java.lang.String getSource(){
      return source;
   }

   /**
    *订单信息来源
    *@param source
    */
   public void setSource(java.lang.String source){
      this.source = source;
   }

   /**
    *订单状态
            01-已录入
            02-已融资
            03-已录入交货后凭证
    *@return java.lang.String
    */
   public java.lang.String getOrderStatus(){
      return orderStatus;
   }

   /**
    *订单状态
            01-已录入
            02-已融资
            03-已录入交货后凭证
    *@param orderStatus
    */
   public void setOrderStatus(java.lang.String orderStatus){
      this.orderStatus = orderStatus;
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