package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:
 * 创建日期:2019-07-22 09:36:44
 */
@Table("iff_multi_task_exists")
public class IffMultiTaskExists{

   /**
      *数据类型：char(32) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String taskid;
   /**
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String exittype;
   /**
      *数据类型：int(11) 
      *是否必填:false 
   **/
   private java.lang.Integer exitcount;

  //get和set方法
   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getTaskid(){
      return taskid;
   }

   /**
    *
    *@param taskid
    */
   public void setTaskid(java.lang.String taskid){
      this.taskid = taskid;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getExittype(){
      return exittype;
   }

   /**
    *
    *@param exittype
    */
   public void setExittype(java.lang.String exittype){
      this.exittype = exittype;
   }

   /**
    *
    *@return java.lang.Integer
    */
   public java.lang.Integer getExitcount(){
      return exitcount;
   }

   /**
    *
    *@param exitcount
    */
   public void setExitcount(java.lang.Integer exitcount){
      this.exitcount = exitcount;
   }

}