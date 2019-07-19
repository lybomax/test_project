package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:财务报表参数主表
 * 创建日期:2019-07-19 17:33:15
 */
@Table("user_finrep_param_base")
public class UserFinrepParamBase{

   /**
      *数据类型：varchar(32) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String id;
   /**
      *数据类型：char(2) 
      *是否必填:false 
   **/
   private java.lang.String industry;
   /**
      *数据类型：char(2) 
      *是否必填:false 
   **/
   private java.lang.String stateClass;
   /**
      *数据类型：varchar(200) 
      *是否必填:false 
   **/
   private java.lang.String stateSheet;
   /**
      *数据类型：varchar(200) 
      *是否必填:false 
   **/
   private java.lang.String stateUrl;
   /**
      *数据类型：char(2) 
      *是否必填:false 
   **/
   private java.lang.String status;
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
   public java.lang.String getIndustry(){
      return industry;
   }

   /**
    *
    *@param industry
    */
   public void setIndustry(java.lang.String industry){
      this.industry = industry;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getStateClass(){
      return stateClass;
   }

   /**
    *
    *@param stateClass
    */
   public void setStateClass(java.lang.String stateClass){
      this.stateClass = stateClass;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getStateSheet(){
      return stateSheet;
   }

   /**
    *
    *@param stateSheet
    */
   public void setStateSheet(java.lang.String stateSheet){
      this.stateSheet = stateSheet;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getStateUrl(){
      return stateUrl;
   }

   /**
    *
    *@param stateUrl
    */
   public void setStateUrl(java.lang.String stateUrl){
      this.stateUrl = stateUrl;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getStatus(){
      return status;
   }

   /**
    *
    *@param status
    */
   public void setStatus(java.lang.String status){
      this.status = status;
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