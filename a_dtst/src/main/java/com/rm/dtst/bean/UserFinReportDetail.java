package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:财务报表明细表
 * 创建日期:2019-07-22 09:37:45
 */
@Table("user_fin_report_detail")
public class UserFinReportDetail{

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
   private java.lang.String infId;
   /**
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String stateCode;
   /**
      *数据类型：varchar(100) 
      *是否必填:false 
   **/
   private java.lang.String stateValue;
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
   public java.lang.String getInfId(){
      return infId;
   }

   /**
    *
    *@param infId
    */
   public void setInfId(java.lang.String infId){
      this.infId = infId;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getStateCode(){
      return stateCode;
   }

   /**
    *
    *@param stateCode
    */
   public void setStateCode(java.lang.String stateCode){
      this.stateCode = stateCode;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getStateValue(){
      return stateValue;
   }

   /**
    *
    *@param stateValue
    */
   public void setStateValue(java.lang.String stateValue){
      this.stateValue = stateValue;
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