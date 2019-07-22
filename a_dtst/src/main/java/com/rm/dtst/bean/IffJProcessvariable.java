package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:
 * 创建日期:2019-07-22 09:36:37
 */
@Table("iff_j_processvariable")
public class IffJProcessvariable{

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
      *值参照流程实例表ID字段 
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String procinstid;
   /**
      *值参照流程实例表DBID 
      *数据类型：char(32) 
      *是否必填:false 
   **/
   private java.lang.String hproci;
   /**
      *值参照任务实例表ID字段 
      *数据类型：char(32) 
      *是否必填:false 
   **/
   private java.lang.String htask;
   /**
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String executionid;
   /**
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String varname;
   /**
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String bizname;
   /**
      *数据类型：int(11) 
      *是否必填:false 
   **/
   private java.lang.Integer kind;
   /**
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String value;
   /**
      *数据类型：int(11) 
      *是否必填:true 
   **/
   private java.lang.Integer dbversion;

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
    *值参照流程实例表ID字段
    *@return java.lang.String
    */
   public java.lang.String getProcinstid(){
      return procinstid;
   }

   /**
    *值参照流程实例表ID字段
    *@param procinstid
    */
   public void setProcinstid(java.lang.String procinstid){
      this.procinstid = procinstid;
   }

   /**
    *值参照流程实例表DBID
    *@return java.lang.String
    */
   public java.lang.String getHproci(){
      return hproci;
   }

   /**
    *值参照流程实例表DBID
    *@param hproci
    */
   public void setHproci(java.lang.String hproci){
      this.hproci = hproci;
   }

   /**
    *值参照任务实例表ID字段
    *@return java.lang.String
    */
   public java.lang.String getHtask(){
      return htask;
   }

   /**
    *值参照任务实例表ID字段
    *@param htask
    */
   public void setHtask(java.lang.String htask){
      this.htask = htask;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getExecutionid(){
      return executionid;
   }

   /**
    *
    *@param executionid
    */
   public void setExecutionid(java.lang.String executionid){
      this.executionid = executionid;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getVarname(){
      return varname;
   }

   /**
    *
    *@param varname
    */
   public void setVarname(java.lang.String varname){
      this.varname = varname;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getBizname(){
      return bizname;
   }

   /**
    *
    *@param bizname
    */
   public void setBizname(java.lang.String bizname){
      this.bizname = bizname;
   }

   /**
    *
    *@return java.lang.Integer
    */
   public java.lang.Integer getKind(){
      return kind;
   }

   /**
    *
    *@param kind
    */
   public void setKind(java.lang.Integer kind){
      this.kind = kind;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getValue(){
      return value;
   }

   /**
    *
    *@param value
    */
   public void setValue(java.lang.String value){
      this.value = value;
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

}