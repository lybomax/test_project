package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:
 * 创建日期:2019-07-22 09:36:28
 */
@Table("iff_j_activity")
public class IffJActivity{

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
      *主流程实例ID，并行分支要通过EXECUTION字段区分 
      *数据类型：char(32) 
      *是否必填:false 
   **/
   private java.lang.String hproci;
   /**
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String type;
   /**
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String activityName;
   /**
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String nodeName;
   /**
      *数据类型：int(11) 
      *是否必填:false 
   **/
   private java.lang.Integer status;
   /**
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String transition;
   /**
      *数据类型：char(32) 
      *是否必填:false 
   **/
   private java.lang.String htask;
   /**
      *数据类型：char(32) 
      *是否必填:false 
   **/
   private java.lang.String lasthisactinst;
   /**
      *数据类型：char(32) 
      *是否必填:false 
   **/
   private java.lang.String nexthisactinst;
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
   private java.lang.String sourejectname;
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
      *参照流程实例表ID值 
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String execution;
   /**
      *数据类型：int(11) 
      *是否必填:false 
   **/
   private java.lang.Integer nextidx;
   /**
      *数据类型：int(11) 
      *是否必填:false 
   **/
   private java.lang.Integer actindex;

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
    *主流程实例ID，并行分支要通过EXECUTION字段区分
    *@return java.lang.String
    */
   public java.lang.String getHproci(){
      return hproci;
   }

   /**
    *主流程实例ID，并行分支要通过EXECUTION字段区分
    *@param hproci
    */
   public void setHproci(java.lang.String hproci){
      this.hproci = hproci;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getType(){
      return type;
   }

   /**
    *
    *@param type
    */
   public void setType(java.lang.String type){
      this.type = type;
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
   public java.lang.String getNodeName(){
      return nodeName;
   }

   /**
    *
    *@param nodeName
    */
   public void setNodeName(java.lang.String nodeName){
      this.nodeName = nodeName;
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
   public java.lang.String getTransition(){
      return transition;
   }

   /**
    *
    *@param transition
    */
   public void setTransition(java.lang.String transition){
      this.transition = transition;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getHtask(){
      return htask;
   }

   /**
    *
    *@param htask
    */
   public void setHtask(java.lang.String htask){
      this.htask = htask;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getLasthisactinst(){
      return lasthisactinst;
   }

   /**
    *
    *@param lasthisactinst
    */
   public void setLasthisactinst(java.lang.String lasthisactinst){
      this.lasthisactinst = lasthisactinst;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getNexthisactinst(){
      return nexthisactinst;
   }

   /**
    *
    *@param nexthisactinst
    */
   public void setNexthisactinst(java.lang.String nexthisactinst){
      this.nexthisactinst = nexthisactinst;
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
   public java.lang.String getSourejectname(){
      return sourejectname;
   }

   /**
    *
    *@param sourejectname
    */
   public void setSourejectname(java.lang.String sourejectname){
      this.sourejectname = sourejectname;
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
    *参照流程实例表ID值
    *@return java.lang.String
    */
   public java.lang.String getExecution(){
      return execution;
   }

   /**
    *参照流程实例表ID值
    *@param execution
    */
   public void setExecution(java.lang.String execution){
      this.execution = execution;
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
    *@return java.lang.Integer
    */
   public java.lang.Integer getActindex(){
      return actindex;
   }

   /**
    *
    *@param actindex
    */
   public void setActindex(java.lang.Integer actindex){
      this.actindex = actindex;
   }

}