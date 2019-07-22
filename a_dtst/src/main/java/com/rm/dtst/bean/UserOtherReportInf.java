package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:其它财务报表信息表
 * 创建日期:2019-07-22 09:37:50
 */
@Table("user_other_report_inf")
public class UserOtherReportInf{

   /**
      *数据类型：varchar(32) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String id;
   /**
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String custId;
   /**
      *数据类型：varchar(100) 
      *是否必填:false 
   **/
   private java.lang.String custName;
   /**
      *数据类型：char(2) 
      *是否必填:false 
   **/
   private java.lang.String financeType;
   /**
      *数据类型：char(2) 
      *是否必填:false 
   **/
   private java.lang.String branchType;
   /**
      *数据类型：decimal(18,2) 
      *是否必填:false 
   **/
   private java.math.BigDecimal amt;
   /**
      *数据类型：date 
      *是否必填:false 
   **/
   private java.util.Date dueDate;
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
    *
    *@return java.lang.String
    */
   public java.lang.String getId(){
      return id;
   }

   /**
    *
    *@param id
    */
   public void setId(java.lang.String id){
      this.id = id;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getCustId(){
      return custId;
   }

   /**
    *
    *@param custId
    */
   public void setCustId(java.lang.String custId){
      this.custId = custId;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getCustName(){
      return custName;
   }

   /**
    *
    *@param custName
    */
   public void setCustName(java.lang.String custName){
      this.custName = custName;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getFinanceType(){
      return financeType;
   }

   /**
    *
    *@param financeType
    */
   public void setFinanceType(java.lang.String financeType){
      this.financeType = financeType;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getBranchType(){
      return branchType;
   }

   /**
    *
    *@param branchType
    */
   public void setBranchType(java.lang.String branchType){
      this.branchType = branchType;
   }

   /**
    *
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getAmt(){
      return amt;
   }

   /**
    *
    *@param amt
    */
   public void setAmt(java.math.BigDecimal amt){
      this.amt = amt;
   }

   /**
    *
    *@return java.util.Date
    */
   public java.util.Date getDueDate(){
      return dueDate;
   }

   /**
    *
    *@param dueDate
    */
   public void setDueDate(java.util.Date dueDate){
      this.dueDate = dueDate;
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