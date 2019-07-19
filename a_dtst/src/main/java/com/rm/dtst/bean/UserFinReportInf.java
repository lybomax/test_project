package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:财务报表信息表
 * 创建日期:2019-07-19 17:33:14
 */
@Table("user_fin_report_inf")
public class UserFinReportInf{

   /**
      *id 
      *数据类型：varchar(32) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String id;
   /**
      *企业编号 
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
      *报表类型:01-资产负债表;02-现金流量表;03-利润表 
      *数据类型：char(2) 
      *是否必填:false 
   **/
   private java.lang.String stateClass;
   /**
      *报表年份 
      *数据类型：char(4) 
      *是否必填:false 
   **/
   private java.lang.String stateYear;
   /**
      *报表种类:FQ-一季报、HY-半年报、TQ-三季报、YR-年报、MO-月报 
      *数据类型：char(2) 
      *是否必填:false 
   **/
   private java.lang.String stateType;
   /**
      *报表月份:种类为05-月报时才需要录入 
      *数据类型：char(2) 
      *是否必填:false 
   **/
   private java.lang.String stateMonth;
   /**
      *财务报表参数表ID 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String extId;
   /**
      *上传日期 
      *数据类型：date 
      *是否必填:false 
   **/
   private java.util.Date uploadDate;
   /**
      *上传人 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String uploadTlrno;
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
    *企业编号
    *@return java.lang.String
    */
   public java.lang.String getCustId(){
      return custId;
   }

   /**
    *企业编号
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
    *报表类型:01-资产负债表;02-现金流量表;03-利润表
    *@return java.lang.String
    */
   public java.lang.String getStateClass(){
      return stateClass;
   }

   /**
    *报表类型:01-资产负债表;02-现金流量表;03-利润表
    *@param stateClass
    */
   public void setStateClass(java.lang.String stateClass){
      this.stateClass = stateClass;
   }

   /**
    *报表年份
    *@return java.lang.String
    */
   public java.lang.String getStateYear(){
      return stateYear;
   }

   /**
    *报表年份
    *@param stateYear
    */
   public void setStateYear(java.lang.String stateYear){
      this.stateYear = stateYear;
   }

   /**
    *报表种类:FQ-一季报、HY-半年报、TQ-三季报、YR-年报、MO-月报
    *@return java.lang.String
    */
   public java.lang.String getStateType(){
      return stateType;
   }

   /**
    *报表种类:FQ-一季报、HY-半年报、TQ-三季报、YR-年报、MO-月报
    *@param stateType
    */
   public void setStateType(java.lang.String stateType){
      this.stateType = stateType;
   }

   /**
    *报表月份:种类为05-月报时才需要录入
    *@return java.lang.String
    */
   public java.lang.String getStateMonth(){
      return stateMonth;
   }

   /**
    *报表月份:种类为05-月报时才需要录入
    *@param stateMonth
    */
   public void setStateMonth(java.lang.String stateMonth){
      this.stateMonth = stateMonth;
   }

   /**
    *财务报表参数表ID
    *@return java.lang.String
    */
   public java.lang.String getExtId(){
      return extId;
   }

   /**
    *财务报表参数表ID
    *@param extId
    */
   public void setExtId(java.lang.String extId){
      this.extId = extId;
   }

   /**
    *上传日期
    *@return java.util.Date
    */
   public java.util.Date getUploadDate(){
      return uploadDate;
   }

   /**
    *上传日期
    *@param uploadDate
    */
   public void setUploadDate(java.util.Date uploadDate){
      this.uploadDate = uploadDate;
   }

   /**
    *上传人
    *@return java.lang.String
    */
   public java.lang.String getUploadTlrno(){
      return uploadTlrno;
   }

   /**
    *上传人
    *@param uploadTlrno
    */
   public void setUploadTlrno(java.lang.String uploadTlrno){
      this.uploadTlrno = uploadTlrno;
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