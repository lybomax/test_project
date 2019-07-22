package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:
 * 创建日期:2019-07-22 09:37:01
 */
@Table("iff_tmp_execution")
public class IffTmpExecution{

   /**
      *数据类型：varchar(255) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String executionId;
   /**
      *数据类型：char(32) 
      *是否必填:false 
   **/
   private java.lang.String webApplicationId;
   /**
      *数据类型：int(11) 
      *是否必填:false 
   **/
   private java.lang.Integer status;
   /**
      *数据类型：varchar(200) 
      *是否必填:false 
   **/
   private java.lang.String activityName;

  //get和set方法
   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getExecutionId(){
      return executionId;
   }

   /**
    *
    *@param executionId
    */
   public void setExecutionId(java.lang.String executionId){
      this.executionId = executionId;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getWebApplicationId(){
      return webApplicationId;
   }

   /**
    *
    *@param webApplicationId
    */
   public void setWebApplicationId(java.lang.String webApplicationId){
      this.webApplicationId = webApplicationId;
   }

   /**
    *
    *@return java.lang.Integer
    */
   public java.lang.Integer getStatus(){
      return status;
   }

   /**
    *
    *@param status
    */
   public void setStatus(java.lang.Integer status){
      this.status = status;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getActivityName(){
      return activityName;
   }

   /**
    *
    *@param activityName
    */
   public void setActivityName(java.lang.String activityName){
      this.activityName = activityName;
   }

}