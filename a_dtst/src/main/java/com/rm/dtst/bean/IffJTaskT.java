package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:
 * 创建日期:2019-07-22 09:36:42
 */
@Table("iff_j_task_t")
public class IffJTaskT{

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
      *数据类型：varchar(64) 
      *是否必填:false 
   **/
   private java.lang.String templateid;
   /**
      *数据类型：int(11) 
      *是否必填:false 
   **/
   private java.lang.Integer templateversion;
   /**
      *数据类型：char(32) 
      *是否必填:false 
   **/
   private java.lang.String supertask;
   /**
      *数据类型：char(32) 
      *是否必填:false 
   **/
   private java.lang.String procinst;
   /**
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String name;
   /**
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String activityName;
   /**
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String taskdefname;
   /**
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String assignee;
   /**
      *数据类型：bit(1) 
      *是否必填:false 
   **/
   private java.lang.String signalling;
   /**
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String state;
   /**
      *数据类型：int(11) 
      *是否必填:false 
   **/
   private java.lang.Integer priority;
   /**
      *数据类型：int(11) 
      *是否必填:false 
   **/
   private java.lang.Integer status;
   /**
      *数据类型：varchar(1024) 
      *是否必填:false 
   **/
   private java.lang.String ownerid;
   /**
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String ownerunitid;
   /**
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String ownerroleid;
   /**
      *数据类型：varchar(64) 
      *是否必填:false 
   **/
   private java.lang.String ownergroupid;
   /**
      *1：单一分配
            2：多重分配
            3：抢占分配 
      *数据类型：int(11) 
      *是否必填:true 
   **/
   private java.lang.Integer assignmode;
   /**
      *数据类型：int(11) 
      *是否必填:false 
   **/
   private java.lang.Integer participantmode;
   /**
      *数据类型：datetime 
      *是否必填:false 
   **/
   private java.util.Date takedate;
   /**
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String susphiststate;
   /**
      *数据类型：datetime 
      *是否必填:false 
   **/
   private java.util.Date create;
   /**
      *数据类型：datetime 
      *是否必填:false 
   **/
   private java.util.Date duedate;
   /**
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String form;
   /**
      *数据类型：longtext 
      *是否必填:false 
   **/
   private java.lang.String descr;
   /**
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String executionId;
   /**
      *数据类型：char(32) 
      *是否必填:false 
   **/
   private java.lang.String execution;
   /**
      *数据类型：bit(1) 
      *是否必填:false 
   **/
   private java.lang.String hasvars;
   /**
      *数据类型：char(32) 
      *是否必填:false 
   **/
   private java.lang.String swimlane;
   /**
      *数据类型：int(11) 
      *是否必填:false 
   **/
   private java.lang.Integer progress;
   /**
      *数据类型：char(1) 
      *是否必填:true 
   **/
   private java.lang.String class;
   /**
      *数据类型：int(11) 
      *是否必填:true 
   **/
   private java.lang.Integer dbversion;
   /**
      *数据类型：varchar(100) 
      *是否必填:false 
   **/
   private java.lang.String userextstring1;
   /**
      *数据类型：varchar(100) 
      *是否必填:false 
   **/
   private java.lang.String userextstring2;
   /**
      *数据类型：varchar(100) 
      *是否必填:false 
   **/
   private java.lang.String userextstring3;
   /**
      *数据类型：varchar(100) 
      *是否必填:false 
   **/
   private java.lang.String userextstring4;
   /**
      *数据类型：varchar(100) 
      *是否必填:false 
   **/
   private java.lang.String userextstring5;
   /**
      *数据类型：varchar(100) 
      *是否必填:false 
   **/
   private java.lang.String userextstring6;
   /**
      *数据类型：varchar(100) 
      *是否必填:false 
   **/
   private java.lang.String userextstring7;
   /**
      *数据类型：varchar(100) 
      *是否必填:false 
   **/
   private java.lang.String userextstring8;

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
   public java.lang.String getSupertask(){
      return supertask;
   }

   /**
    *
    *@param supertask
    */
   public void setSupertask(java.lang.String supertask){
      this.supertask = supertask;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getProcinst(){
      return procinst;
   }

   /**
    *
    *@param procinst
    */
   public void setProcinst(java.lang.String procinst){
      this.procinst = procinst;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getName(){
      return name;
   }

   /**
    *
    *@param name
    */
   public void setName(java.lang.String name){
      this.name = name;
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

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getTaskdefname(){
      return taskdefname;
   }

   /**
    *
    *@param taskdefname
    */
   public void setTaskdefname(java.lang.String taskdefname){
      this.taskdefname = taskdefname;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getAssignee(){
      return assignee;
   }

   /**
    *
    *@param assignee
    */
   public void setAssignee(java.lang.String assignee){
      this.assignee = assignee;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getSignalling(){
      return signalling;
   }

   /**
    *
    *@param signalling
    */
   public void setSignalling(java.lang.String signalling){
      this.signalling = signalling;
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
    *@return java.lang.Integer
    */
   public java.lang.Integer getPriority(){
      return priority;
   }

   /**
    *
    *@param priority
    */
   public void setPriority(java.lang.Integer priority){
      this.priority = priority;
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
   public java.lang.String getOwnerid(){
      return ownerid;
   }

   /**
    *
    *@param ownerid
    */
   public void setOwnerid(java.lang.String ownerid){
      this.ownerid = ownerid;
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
    *@return java.lang.String
    */
   public java.lang.String getOwnerroleid(){
      return ownerroleid;
   }

   /**
    *
    *@param ownerroleid
    */
   public void setOwnerroleid(java.lang.String ownerroleid){
      this.ownerroleid = ownerroleid;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getOwnergroupid(){
      return ownergroupid;
   }

   /**
    *
    *@param ownergroupid
    */
   public void setOwnergroupid(java.lang.String ownergroupid){
      this.ownergroupid = ownergroupid;
   }

   /**
    *1：单一分配
            2：多重分配
            3：抢占分配
    *@return java.lang.Integer
    */
   public java.lang.Integer getAssignmode(){
      return assignmode;
   }

   /**
    *1：单一分配
            2：多重分配
            3：抢占分配
    *@param assignmode
    */
   public void setAssignmode(java.lang.Integer assignmode){
      this.assignmode = assignmode;
   }

   /**
    *
    *@return java.lang.Integer
    */
   public java.lang.Integer getParticipantmode(){
      return participantmode;
   }

   /**
    *
    *@param participantmode
    */
   public void setParticipantmode(java.lang.Integer participantmode){
      this.participantmode = participantmode;
   }

   /**
    *
    *@return java.util.Date
    */
   public java.util.Date getTakedate(){
      return takedate;
   }

   /**
    *
    *@param takedate
    */
   public void setTakedate(java.util.Date takedate){
      this.takedate = takedate;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getSusphiststate(){
      return susphiststate;
   }

   /**
    *
    *@param susphiststate
    */
   public void setSusphiststate(java.lang.String susphiststate){
      this.susphiststate = susphiststate;
   }

   /**
    *
    *@return java.util.Date
    */
   public java.util.Date getCreate(){
      return create;
   }

   /**
    *
    *@param create
    */
   public void setCreate(java.util.Date create){
      this.create = create;
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
   public java.lang.String getForm(){
      return form;
   }

   /**
    *
    *@param form
    */
   public void setForm(java.lang.String form){
      this.form = form;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getDescr(){
      return descr;
   }

   /**
    *
    *@param descr
    */
   public void setDescr(java.lang.String descr){
      this.descr = descr;
   }

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
   public java.lang.String getHasvars(){
      return hasvars;
   }

   /**
    *
    *@param hasvars
    */
   public void setHasvars(java.lang.String hasvars){
      this.hasvars = hasvars;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getSwimlane(){
      return swimlane;
   }

   /**
    *
    *@param swimlane
    */
   public void setSwimlane(java.lang.String swimlane){
      this.swimlane = swimlane;
   }

   /**
    *
    *@return java.lang.Integer
    */
   public java.lang.Integer getProgress(){
      return progress;
   }

   /**
    *
    *@param progress
    */
   public void setProgress(java.lang.Integer progress){
      this.progress = progress;
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
    *@return java.lang.String
    */
   public java.lang.String getUserextstring1(){
      return userextstring1;
   }

   /**
    *
    *@param userextstring1
    */
   public void setUserextstring1(java.lang.String userextstring1){
      this.userextstring1 = userextstring1;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getUserextstring2(){
      return userextstring2;
   }

   /**
    *
    *@param userextstring2
    */
   public void setUserextstring2(java.lang.String userextstring2){
      this.userextstring2 = userextstring2;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getUserextstring3(){
      return userextstring3;
   }

   /**
    *
    *@param userextstring3
    */
   public void setUserextstring3(java.lang.String userextstring3){
      this.userextstring3 = userextstring3;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getUserextstring4(){
      return userextstring4;
   }

   /**
    *
    *@param userextstring4
    */
   public void setUserextstring4(java.lang.String userextstring4){
      this.userextstring4 = userextstring4;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getUserextstring5(){
      return userextstring5;
   }

   /**
    *
    *@param userextstring5
    */
   public void setUserextstring5(java.lang.String userextstring5){
      this.userextstring5 = userextstring5;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getUserextstring6(){
      return userextstring6;
   }

   /**
    *
    *@param userextstring6
    */
   public void setUserextstring6(java.lang.String userextstring6){
      this.userextstring6 = userextstring6;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getUserextstring7(){
      return userextstring7;
   }

   /**
    *
    *@param userextstring7
    */
   public void setUserextstring7(java.lang.String userextstring7){
      this.userextstring7 = userextstring7;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getUserextstring8(){
      return userextstring8;
   }

   /**
    *
    *@param userextstring8
    */
   public void setUserextstring8(java.lang.String userextstring8){
      this.userextstring8 = userextstring8;
   }

}