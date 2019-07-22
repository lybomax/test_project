package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:
 * 创建日期:2019-07-22 09:36:41
 */
@Table("iff_j_task")
public class IffJTask{

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
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String subject;
   /**
      *数据类型：char(32) 
      *是否必填:false 
   **/
   private java.lang.String hproci;
   /**
      *数据类型：varchar(64) 
      *是否必填:false 
   **/
   private java.lang.String nodeid;
   /**
      *数据类型：varchar(64) 
      *是否必填:false 
   **/
   private java.lang.String nodename;
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
      *数据类型：int(11) 
      *是否必填:false 
   **/
   private java.lang.Integer priority;
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
      *两位码表示，分别表示为：允许跳转到其他节点、允许其他节点跳转到本节点
            允许为1，不允许为0 
      *数据类型：char(2) 
      *是否必填:false 
   **/
   private java.lang.String skipauth;
   /**
      *两位码表示，分别表示为：允许驳回到其他节点、允许其他节点驳回到本节点 
      *数据类型：char(2) 
      *是否必填:false 
   **/
   private java.lang.String rejectauth;
   /**
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String assignee;
   /**
      *数据类型：varchar(1024) 
      *是否必填:false 
   **/
   private java.lang.String ownerid;
   /**
      *数据类型：varchar(64) 
      *是否必填:false 
   **/
   private java.lang.String ownername;
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
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String executorid;
   /**
      *数据类型：varchar(64) 
      *是否必填:false 
   **/
   private java.lang.String executorname;
   /**
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String executorrole;
   /**
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String executorunit;
   /**
      *数据类型：datetime 
      *是否必填:false 
   **/
   private java.util.Date create;
   /**
      *数据类型：datetime 
      *是否必填:false 
   **/
   private java.util.Date end;
   /**
      *数据类型：datetime 
      *是否必填:false 
   **/
   private java.util.Date takedate;
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
      *表单URL 
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String form;
   /**
      *数据类型：int(11) 
      *是否必填:true 
   **/
   private java.lang.Integer dbversion;
   /**
      *值参照流程实例表ID_字段。主要用来区分各个分支 
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String execution;
   /**
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String outcome;
   /**
      *数据类型：int(11) 
      *是否必填:false 
   **/
   private java.lang.Integer nextidx;
   /**
      *值参照本表DBID字段 
      *数据类型：char(32) 
      *是否必填:false 
   **/
   private java.lang.String supertask;
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
   public java.lang.String getHproci(){
      return hproci;
   }

   /**
    *
    *@param hproci
    */
   public void setHproci(java.lang.String hproci){
      this.hproci = hproci;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getNodeid(){
      return nodeid;
   }

   /**
    *
    *@param nodeid
    */
   public void setNodeid(java.lang.String nodeid){
      this.nodeid = nodeid;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getNodename(){
      return nodename;
   }

   /**
    *
    *@param nodename
    */
   public void setNodename(java.lang.String nodename){
      this.nodename = nodename;
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
    *两位码表示，分别表示为：允许跳转到其他节点、允许其他节点跳转到本节点
            允许为1，不允许为0
    *@return java.lang.String
    */
   public java.lang.String getSkipauth(){
      return skipauth;
   }

   /**
    *两位码表示，分别表示为：允许跳转到其他节点、允许其他节点跳转到本节点
            允许为1，不允许为0
    *@param skipauth
    */
   public void setSkipauth(java.lang.String skipauth){
      this.skipauth = skipauth;
   }

   /**
    *两位码表示，分别表示为：允许驳回到其他节点、允许其他节点驳回到本节点
    *@return java.lang.String
    */
   public java.lang.String getRejectauth(){
      return rejectauth;
   }

   /**
    *两位码表示，分别表示为：允许驳回到其他节点、允许其他节点驳回到本节点
    *@param rejectauth
    */
   public void setRejectauth(java.lang.String rejectauth){
      this.rejectauth = rejectauth;
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
   public java.lang.String getOwnername(){
      return ownername;
   }

   /**
    *
    *@param ownername
    */
   public void setOwnername(java.lang.String ownername){
      this.ownername = ownername;
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
    *
    *@return java.lang.String
    */
   public java.lang.String getExecutorid(){
      return executorid;
   }

   /**
    *
    *@param executorid
    */
   public void setExecutorid(java.lang.String executorid){
      this.executorid = executorid;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getExecutorname(){
      return executorname;
   }

   /**
    *
    *@param executorname
    */
   public void setExecutorname(java.lang.String executorname){
      this.executorname = executorname;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getExecutorrole(){
      return executorrole;
   }

   /**
    *
    *@param executorrole
    */
   public void setExecutorrole(java.lang.String executorrole){
      this.executorrole = executorrole;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getExecutorunit(){
      return executorunit;
   }

   /**
    *
    *@param executorunit
    */
   public void setExecutorunit(java.lang.String executorunit){
      this.executorunit = executorunit;
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
    *表单URL
    *@return java.lang.String
    */
   public java.lang.String getForm(){
      return form;
   }

   /**
    *表单URL
    *@param form
    */
   public void setForm(java.lang.String form){
      this.form = form;
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
    *值参照流程实例表ID_字段。主要用来区分各个分支
    *@return java.lang.String
    */
   public java.lang.String getExecution(){
      return execution;
   }

   /**
    *值参照流程实例表ID_字段。主要用来区分各个分支
    *@param execution
    */
   public void setExecution(java.lang.String execution){
      this.execution = execution;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getOutcome(){
      return outcome;
   }

   /**
    *
    *@param outcome
    */
   public void setOutcome(java.lang.String outcome){
      this.outcome = outcome;
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
    *值参照本表DBID字段
    *@return java.lang.String
    */
   public java.lang.String getSupertask(){
      return supertask;
   }

   /**
    *值参照本表DBID字段
    *@param supertask
    */
   public void setSupertask(java.lang.String supertask){
      this.supertask = supertask;
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