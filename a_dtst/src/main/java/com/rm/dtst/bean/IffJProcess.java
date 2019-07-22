package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:
 * 创建日期:2019-07-22 09:36:34
 */
@Table("iff_j_process")
public class IffJProcess{

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
   private java.lang.String packageid;
   /**
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String procdefid;
   /**
      *数据类型：varchar(64) 
      *是否必填:true 
   **/
   private java.lang.String templateid;
   /**
      *数据类型：varchar(64) 
      *是否必填:false 
   **/
   private java.lang.String templatename;
   /**
      *数据类型：int(11) 
      *是否必填:true 
   **/
   private java.lang.Integer templateversion;
   /**
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String subject;
   /**
      *数据类型：varchar(64) 
      *是否必填:false 
   **/
   private java.lang.String initiatorid;
   /**
      *数据类型：varchar(64) 
      *是否必填:false 
   **/
   private java.lang.String initiatorname;
   /**
      *数据类型：varchar(64) 
      *是否必填:false 
   **/
   private java.lang.String initiatorrole;
   /**
      *数据类型：varchar(64) 
      *是否必填:false 
   **/
   private java.lang.String ownerunitid;
   /**
      *数据类型：int(11) 
      *是否必填:false 
   **/
   private java.lang.Integer status;
   /**
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String state;
   /**
      *数据类型：datetime 
      *是否必填:false 
   **/
   private java.util.Date start;
   /**
      *数据类型：datetime 
      *是否必填:false 
   **/
   private java.util.Date end;
   /**
      *数据类型：bigint(20) 
      *是否必填:false 
   **/
   private java.lang.String duration;
   /**
      *数据类型：bigint(20) 
      *是否必填:false 
   **/
   private java.lang.String overdue;
   /**
      *数据类型：datetime 
      *是否必填:false 
   **/
   private java.util.Date deadline;
   /**
      *数据类型：int(11) 
      *是否必填:true 
   **/
   private java.lang.Integer dbversion;
   /**
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String id;
   /**
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String key;
   /**
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String endactivity;
   /**
      *数据类型：int(11) 
      *是否必填:false 
   **/
   private java.lang.Integer nextidx;
   /**
      *数据类型：char(32) 
      *是否必填:false 
   **/
   private java.lang.String superexec;
   /**
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String activityName;

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
   public java.lang.String getPackageid(){
      return packageid;
   }

   /**
    *
    *@param packageid
    */
   public void setPackageid(java.lang.String packageid){
      this.packageid = packageid;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getProcdefid(){
      return procdefid;
   }

   /**
    *
    *@param procdefid
    */
   public void setProcdefid(java.lang.String procdefid){
      this.procdefid = procdefid;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getTemplateid(){
      return templateid;
   }

   /**
    *
    *@param templateid
    */
   public void setTemplateid(java.lang.String templateid){
      this.templateid = templateid;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getTemplatename(){
      return templatename;
   }

   /**
    *
    *@param templatename
    */
   public void setTemplatename(java.lang.String templatename){
      this.templatename = templatename;
   }

   /**
    *
    *@return java.lang.Integer
    */
   public java.lang.Integer getTemplateversion(){
      return templateversion;
   }

   /**
    *
    *@param templateversion
    */
   public void setTemplateversion(java.lang.Integer templateversion){
      this.templateversion = templateversion;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getSubject(){
      return subject;
   }

   /**
    *
    *@param subject
    */
   public void setSubject(java.lang.String subject){
      this.subject = subject;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getInitiatorid(){
      return initiatorid;
   }

   /**
    *
    *@param initiatorid
    */
   public void setInitiatorid(java.lang.String initiatorid){
      this.initiatorid = initiatorid;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getInitiatorname(){
      return initiatorname;
   }

   /**
    *
    *@param initiatorname
    */
   public void setInitiatorname(java.lang.String initiatorname){
      this.initiatorname = initiatorname;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getInitiatorrole(){
      return initiatorrole;
   }

   /**
    *
    *@param initiatorrole
    */
   public void setInitiatorrole(java.lang.String initiatorrole){
      this.initiatorrole = initiatorrole;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getOwnerunitid(){
      return ownerunitid;
   }

   /**
    *
    *@param ownerunitid
    */
   public void setOwnerunitid(java.lang.String ownerunitid){
      this.ownerunitid = ownerunitid;
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
    *@return java.util.Date
    */
   public java.util.Date getStart(){
      return start;
   }

   /**
    *
    *@param start
    */
   public void setStart(java.util.Date start){
      this.start = start;
   }

   /**
    *
    *@return java.util.Date
    */
   public java.util.Date getEnd(){
      return end;
   }

   /**
    *
    *@param end
    */
   public void setEnd(java.util.Date end){
      this.end = end;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getDuration(){
      return duration;
   }

   /**
    *
    *@param duration
    */
   public void setDuration(java.lang.String duration){
      this.duration = duration;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getOverdue(){
      return overdue;
   }

   /**
    *
    *@param overdue
    */
   public void setOverdue(java.lang.String overdue){
      this.overdue = overdue;
   }

   /**
    *
    *@return java.util.Date
    */
   public java.util.Date getDeadline(){
      return deadline;
   }

   /**
    *
    *@param deadline
    */
   public void setDeadline(java.util.Date deadline){
      this.deadline = deadline;
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
   public java.lang.String getKey(){
      return key;
   }

   /**
    *
    *@param key
    */
   public void setKey(java.lang.String key){
      this.key = key;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getEndactivity(){
      return endactivity;
   }

   /**
    *
    *@param endactivity
    */
   public void setEndactivity(java.lang.String endactivity){
      this.endactivity = endactivity;
   }

   /**
    *
    *@return java.lang.Integer
    */
   public java.lang.Integer getNextidx(){
      return nextidx;
   }

   /**
    *
    *@param nextidx
    */
   public void setNextidx(java.lang.Integer nextidx){
      this.nextidx = nextidx;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getSuperexec(){
      return superexec;
   }

   /**
    *
    *@param superexec
    */
   public void setSuperexec(java.lang.String superexec){
      this.superexec = superexec;
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