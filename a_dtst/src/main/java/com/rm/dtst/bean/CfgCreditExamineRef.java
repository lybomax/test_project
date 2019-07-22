package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:授信尽调报告关联关系
 * 创建日期:2019-07-22 09:36:04
 */
@Table("cfg_credit_examine_ref")
public class CfgCreditExamineRef{

   /**
      *id 
      *数据类型：varchar(32) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String id;
   /**
      *额度编号 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String creditId;
   /**
      *申请Appno 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String applyLogId;
   /**
      *尽调报告id 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String examineId;
   /**
      *企业ID 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String custId;
   /**
      *企业名称 
      *数据类型：varchar(100) 
      *是否必填:false 
   **/
   private java.lang.String custName;
   /**
      *尽调报告日期 
      *数据类型：date 
      *是否必填:false 
   **/
   private java.util.Date reportDate;
   /**
      *尽调员 
      *数据类型：varchar(100) 
      *是否必填:false 
   **/
   private java.lang.String reportTlrno;
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
    *额度编号
    *@return java.lang.String
    */
   public java.lang.String getCreditId(){
      return creditId;
   }

   /**
    *额度编号
    *@param creditId
    */
   public void setCreditId(java.lang.String creditId){
      this.creditId = creditId;
   }

   /**
    *申请Appno
    *@return java.lang.String
    */
   public java.lang.String getApplyLogId(){
      return applyLogId;
   }

   /**
    *申请Appno
    *@param applyLogId
    */
   public void setApplyLogId(java.lang.String applyLogId){
      this.applyLogId = applyLogId;
   }

   /**
    *尽调报告id
    *@return java.lang.String
    */
   public java.lang.String getExamineId(){
      return examineId;
   }

   /**
    *尽调报告id
    *@param examineId
    */
   public void setExamineId(java.lang.String examineId){
      this.examineId = examineId;
   }

   /**
    *企业ID
    *@return java.lang.String
    */
   public java.lang.String getCustId(){
      return custId;
   }

   /**
    *企业ID
    *@param custId
    */
   public void setCustId(java.lang.String custId){
      this.custId = custId;
   }

   /**
    *企业名称
    *@return java.lang.String
    */
   public java.lang.String getCustName(){
      return custName;
   }

   /**
    *企业名称
    *@param custName
    */
   public void setCustName(java.lang.String custName){
      this.custName = custName;
   }

   /**
    *尽调报告日期
    *@return java.util.Date
    */
   public java.util.Date getReportDate(){
      return reportDate;
   }

   /**
    *尽调报告日期
    *@param reportDate
    */
   public void setReportDate(java.util.Date reportDate){
      this.reportDate = reportDate;
   }

   /**
    *尽调员
    *@return java.lang.String
    */
   public java.lang.String getReportTlrno(){
      return reportTlrno;
   }

   /**
    *尽调员
    *@param reportTlrno
    */
   public void setReportTlrno(java.lang.String reportTlrno){
      this.reportTlrno = reportTlrno;
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