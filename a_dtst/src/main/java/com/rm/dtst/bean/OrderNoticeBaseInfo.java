package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:订单通知书基本信息表
 * 创建日期:2019-07-22 09:37:29
 */
@Table("order_notice_base_info")
public class OrderNoticeBaseInfo{

   /**
      *主键uuid 
      *数据类型：varchar(32) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String id;
   /**
      *通知书编号 
      *数据类型：varchar(20) 
      *是否必填:false 
   **/
   private java.lang.String num;
   /**
      *业务申请编号 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String appNo;
   /**
      *主合同号 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String financingContId;
   /**
      *授信客户名称 
      *数据类型：varchar(100) 
      *是否必填:false 
   **/
   private java.lang.String custName;
   /**
      *其他客户号(上游厂商、保理买方等) 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String custId;
   /**
      *通知书类型 
      *数据类型：varchar(10) 
      *是否必填:false 
   **/
   private java.lang.String noticeType;
   /**
      *产品编号 
      *数据类型：varchar(10) 
      *是否必填:false 
   **/
   private java.lang.String productId;
   /**
      *产品名称 
      *数据类型：varchar(100) 
      *是否必填:false 
   **/
   private java.lang.String productName;
   /**
      *申请日期 
      *数据类型：date 
      *是否必填:false 
   **/
   private java.util.Date appliDate;
   /**
      *数据类型：varchar(8192) 
      *是否必填:false 
   **/
   private java.lang.String bussDetail;
   /**
      *通知书状态：00-未阅、02-已阅未确认、01-已阅已确认 
      *数据类型：char(2) 
      *是否必填:false 
   **/
   private java.lang.String status;
   /**
      *签发日期 
      *数据类型：date 
      *是否必填:false 
   **/
   private java.util.Date signDate;
   /**
      *确认日期 
      *数据类型：date 
      *是否必填:false 
   **/
   private java.util.Date commonDate;
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
    *主键uuid
    *@return java.lang.String
    */
   public java.lang.String getId(){
      return id;
   }

   /**
    *主键uuid
    *@param id
    */
   public void setId(java.lang.String id){
      this.id = id;
   }

   /**
    *通知书编号
    *@return java.lang.String
    */
   public java.lang.String getNum(){
      return num;
   }

   /**
    *通知书编号
    *@param num
    */
   public void setNum(java.lang.String num){
      this.num = num;
   }

   /**
    *业务申请编号
    *@return java.lang.String
    */
   public java.lang.String getAppNo(){
      return appNo;
   }

   /**
    *业务申请编号
    *@param appNo
    */
   public void setAppNo(java.lang.String appNo){
      this.appNo = appNo;
   }

   /**
    *主合同号
    *@return java.lang.String
    */
   public java.lang.String getFinancingContId(){
      return financingContId;
   }

   /**
    *主合同号
    *@param financingContId
    */
   public void setFinancingContId(java.lang.String financingContId){
      this.financingContId = financingContId;
   }

   /**
    *授信客户名称
    *@return java.lang.String
    */
   public java.lang.String getCustName(){
      return custName;
   }

   /**
    *授信客户名称
    *@param custName
    */
   public void setCustName(java.lang.String custName){
      this.custName = custName;
   }

   /**
    *其他客户号(上游厂商、保理买方等)
    *@return java.lang.String
    */
   public java.lang.String getCustId(){
      return custId;
   }

   /**
    *其他客户号(上游厂商、保理买方等)
    *@param custId
    */
   public void setCustId(java.lang.String custId){
      this.custId = custId;
   }

   /**
    *通知书类型
    *@return java.lang.String
    */
   public java.lang.String getNoticeType(){
      return noticeType;
   }

   /**
    *通知书类型
    *@param noticeType
    */
   public void setNoticeType(java.lang.String noticeType){
      this.noticeType = noticeType;
   }

   /**
    *产品编号
    *@return java.lang.String
    */
   public java.lang.String getProductId(){
      return productId;
   }

   /**
    *产品编号
    *@param productId
    */
   public void setProductId(java.lang.String productId){
      this.productId = productId;
   }

   /**
    *产品名称
    *@return java.lang.String
    */
   public java.lang.String getProductName(){
      return productName;
   }

   /**
    *产品名称
    *@param productName
    */
   public void setProductName(java.lang.String productName){
      this.productName = productName;
   }

   /**
    *申请日期
    *@return java.util.Date
    */
   public java.util.Date getAppliDate(){
      return appliDate;
   }

   /**
    *申请日期
    *@param appliDate
    */
   public void setAppliDate(java.util.Date appliDate){
      this.appliDate = appliDate;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getBussDetail(){
      return bussDetail;
   }

   /**
    *
    *@param bussDetail
    */
   public void setBussDetail(java.lang.String bussDetail){
      this.bussDetail = bussDetail;
   }

   /**
    *通知书状态：00-未阅、02-已阅未确认、01-已阅已确认
    *@return java.lang.String
    */
   public java.lang.String getStatus(){
      return status;
   }

   /**
    *通知书状态：00-未阅、02-已阅未确认、01-已阅已确认
    *@param status
    */
   public void setStatus(java.lang.String status){
      this.status = status;
   }

   /**
    *签发日期
    *@return java.util.Date
    */
   public java.util.Date getSignDate(){
      return signDate;
   }

   /**
    *签发日期
    *@param signDate
    */
   public void setSignDate(java.util.Date signDate){
      this.signDate = signDate;
   }

   /**
    *确认日期
    *@return java.util.Date
    */
   public java.util.Date getCommonDate(){
      return commonDate;
   }

   /**
    *确认日期
    *@param commonDate
    */
   public void setCommonDate(java.util.Date commonDate){
      this.commonDate = commonDate;
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