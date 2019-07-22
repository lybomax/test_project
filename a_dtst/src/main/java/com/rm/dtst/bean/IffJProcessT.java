package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:
 * 创建日期:2019-07-22 09:36:35
 */
@Table("iff_j_process_t")
public class IffJProcessT{

   /**
      *数据类型：char(32) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String dbid;
   /**
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String procdefid;
   /**
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String activityname;
   /**
      *当前活动实例对应历史活动节点的DBID，随节点推移而变化 
      *数据类型：char(32) 
      *是否必填:false 
   **/
   private java.lang.String hisactinst;
   /**
      *数据类型：char(32) 
      *是否必填:false 
   **/
   private java.lang.String lasthisactinst;
   /**
      *数据类型：int(11) 
      *是否必填:false 
   **/
   private java.lang.Integer priority;
   /**
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String id;
   /**
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String state;
   /**
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String susphiststate;
   /**
      *数据类型：bit(1) 
      *是否必填:false 
   **/
   private java.lang.String hasvars;
   /**
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String name;
   /**
      *用户自定义标识，同一流程定义下的流程实例自定义标识不能重复 
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String key;
   /**
      *数据类型：varchar(255) 
      *是否必填:true 
   **/
   private java.lang.String class;
   /**
      *父流程实例ID，主流程该字段为NULL 
      *数据类型：char(32) 
      *是否必填:false 
   **/
   private java.lang.String parent;
   /**
      *数据类型：char(32) 
      *是否必填:false 
   **/
   private java.lang.String instance;
   /**
      *子流程时该字段为父活动实例ID 
      *数据类型：char(32) 
      *是否必填:false 
   **/
   private java.lang.String superexec;
   /**
      *子流程时该字段为父流程实例ID 
      *数据类型：char(32) 
      *是否必填:false 
   **/
   private java.lang.String subprocinst;
   /**
      *数据类型：int(11) 
      *是否必填:false 
   **/
   private java.lang.Integer parentIdx;
   /**
      *数据类型：bit(1) 
      *是否必填:false 
   **/
   private java.lang.String firstautotaskhascommit;

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
   public java.lang.String getActivityname(){
      return activityname;
   }

   /**
    *
    *@param activityname
    */
   public void setActivityname(java.lang.String activityname){
      this.activityname = activityname;
   }

   /**
    *当前活动实例对应历史活动节点的DBID，随节点推移而变化
    *@return java.lang.String
    */
   public java.lang.String getHisactinst(){
      return hisactinst;
   }

   /**
    *当前活动实例对应历史活动节点的DBID，随节点推移而变化
    *@param hisactinst
    */
   public void setHisactinst(java.lang.String hisactinst){
      this.hisactinst = hisactinst;
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
    *用户自定义标识，同一流程定义下的流程实例自定义标识不能重复
    *@return java.lang.String
    */
   public java.lang.String getKey(){
      return key;
   }

   /**
    *用户自定义标识，同一流程定义下的流程实例自定义标识不能重复
    *@param key
    */
   public void setKey(java.lang.String key){
      this.key = key;
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
    *父流程实例ID，主流程该字段为NULL
    *@return java.lang.String
    */
   public java.lang.String getParent(){
      return parent;
   }

   /**
    *父流程实例ID，主流程该字段为NULL
    *@param parent
    */
   public void setParent(java.lang.String parent){
      this.parent = parent;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getInstance(){
      return instance;
   }

   /**
    *
    *@param instance
    */
   public void setInstance(java.lang.String instance){
      this.instance = instance;
   }

   /**
    *子流程时该字段为父活动实例ID
    *@return java.lang.String
    */
   public java.lang.String getSuperexec(){
      return superexec;
   }

   /**
    *子流程时该字段为父活动实例ID
    *@param superexec
    */
   public void setSuperexec(java.lang.String superexec){
      this.superexec = superexec;
   }

   /**
    *子流程时该字段为父流程实例ID
    *@return java.lang.String
    */
   public java.lang.String getSubprocinst(){
      return subprocinst;
   }

   /**
    *子流程时该字段为父流程实例ID
    *@param subprocinst
    */
   public void setSubprocinst(java.lang.String subprocinst){
      this.subprocinst = subprocinst;
   }

   /**
    *
    *@return java.lang.Integer
    */
   public java.lang.Integer getParentIdx(){
      return parentIdx;
   }

   /**
    *
    *@param parentIdx
    */
   public void setParentIdx(java.lang.Integer parentIdx){
      this.parentIdx = parentIdx;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getFirstautotaskhascommit(){
      return firstautotaskhascommit;
   }

   /**
    *
    *@param firstautotaskhascommit
    */
   public void setFirstautotaskhascommit(java.lang.String firstautotaskhascommit){
      this.firstautotaskhascommit = firstautotaskhascommit;
   }

}