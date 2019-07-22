package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:
 * 创建日期:2019-07-22 09:36:32
 */
@Table("iff_j_job")
public class IffJJob{

   /**
      *数据类型：char(32) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String dbid;
   /**
      *数据类型：varchar(255) 
      *是否必填:true 
   **/
   private java.lang.String class;
   /**
      *数据类型：int(11) 
      *是否必填:true 
   **/
   private java.lang.Integer dbversion;
   /**
      *数据类型：datetime 
      *是否必填:false 
   **/
   private java.util.Date duedate;
   /**
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String state;
   /**
      *数据类型：bit(1) 
      *是否必填:false 
   **/
   private java.lang.String isexclusive;
   /**
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String lockowner;
   /**
      *数据类型：datetime 
      *是否必填:false 
   **/
   private java.util.Date lockexptime;
   /**
      *数据类型：longtext 
      *是否必填:false 
   **/
   private java.lang.String exception;
   /**
      *数据类型：int(11) 
      *是否必填:false 
   **/
   private java.lang.Integer retries;
   /**
      *数据类型：char(32) 
      *是否必填:false 
   **/
   private java.lang.String processinstance;
   /**
      *数据类型：char(32) 
      *是否必填:false 
   **/
   private java.lang.String execution;
   /**
      *数据类型：char(32) 
      *是否必填:false 
   **/
   private java.lang.String cfg;
   /**
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String signal;
   /**
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String event;
   /**
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String repeat;

  //get和set方法
   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getDbid(){
      return dbid;
   }

   /**
    *
    *@param dbid
    */
   public void setDbid(java.lang.String dbid){
      this.dbid = dbid;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getClass(){
      return class;
   }

   /**
    *
    *@param class
    */
   public void setClass(java.lang.String class){
      this.class = class;
   }

   /**
    *
    *@return java.lang.Integer
    */
   public java.lang.Integer getDbversion(){
      return dbversion;
   }

   /**
    *
    *@param dbversion
    */
   public void setDbversion(java.lang.Integer dbversion){
      this.dbversion = dbversion;
   }

   /**
    *
    *@return java.util.Date
    */
   public java.util.Date getDuedate(){
      return duedate;
   }

   /**
    *
    *@param duedate
    */
   public void setDuedate(java.util.Date duedate){
      this.duedate = duedate;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getState(){
      return state;
   }

   /**
    *
    *@param state
    */
   public void setState(java.lang.String state){
      this.state = state;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getIsexclusive(){
      return isexclusive;
   }

   /**
    *
    *@param isexclusive
    */
   public void setIsexclusive(java.lang.String isexclusive){
      this.isexclusive = isexclusive;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getLockowner(){
      return lockowner;
   }

   /**
    *
    *@param lockowner
    */
   public void setLockowner(java.lang.String lockowner){
      this.lockowner = lockowner;
   }

   /**
    *
    *@return java.util.Date
    */
   public java.util.Date getLockexptime(){
      return lockexptime;
   }

   /**
    *
    *@param lockexptime
    */
   public void setLockexptime(java.util.Date lockexptime){
      this.lockexptime = lockexptime;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getException(){
      return exception;
   }

   /**
    *
    *@param exception
    */
   public void setException(java.lang.String exception){
      this.exception = exception;
   }

   /**
    *
    *@return java.lang.Integer
    */
   public java.lang.Integer getRetries(){
      return retries;
   }

   /**
    *
    *@param retries
    */
   public void setRetries(java.lang.Integer retries){
      this.retries = retries;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getProcessinstance(){
      return processinstance;
   }

   /**
    *
    *@param processinstance
    */
   public void setProcessinstance(java.lang.String processinstance){
      this.processinstance = processinstance;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getExecution(){
      return execution;
   }

   /**
    *
    *@param execution
    */
   public void setExecution(java.lang.String execution){
      this.execution = execution;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getCfg(){
      return cfg;
   }

   /**
    *
    *@param cfg
    */
   public void setCfg(java.lang.String cfg){
      this.cfg = cfg;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getSignal(){
      return signal;
   }

   /**
    *
    *@param signal
    */
   public void setSignal(java.lang.String signal){
      this.signal = signal;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getEvent(){
      return event;
   }

   /**
    *
    *@param event
    */
   public void setEvent(java.lang.String event){
      this.event = event;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getRepeat(){
      return repeat;
   }

   /**
    *
    *@param repeat
    */
   public void setRepeat(java.lang.String repeat){
      this.repeat = repeat;
   }

}