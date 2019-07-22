package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:
 * 创建日期:2019-07-22 09:36:38
 */
@Table("iff_j_processvariable_t")
public class IffJProcessvariableT{

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
   private java.lang.String key;
   /**
      *数据类型：char(32) 
      *是否必填:false 
   **/
   private java.lang.String execution;
   /**
      *数据类型：char(32) 
      *是否必填:false 
   **/
   private java.lang.String task;
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
      *数据类型：char(32) 
      *是否必填:false 
   **/
   private java.lang.String lob;
   /**
      *数据类型：datetime 
      *是否必填:false 
   **/
   private java.util.Date dateValue;
   /**
      *数据类型：double 
      *是否必填:false 
   **/
   private java.lang.String doubleValue;
   /**
      *数据类型：bigint(20) 
      *是否必填:false 
   **/
   private java.lang.String longValue;
   /**
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String stringValue;
   /**
      *数据类型：longtext 
      *是否必填:false 
   **/
   private java.lang.String textValue;
   /**
      *数据类型：bit(1) 
      *是否必填:false 
   **/
   private java.lang.String hist;
   /**
      *数据类型：int(11) 
      *是否必填:true 
   **/
   private java.lang.Integer dbversion;
   /**
      *数据类型：varchar(255) 
      *是否必填:true 
   **/
   private java.lang.String class;
   /**
      *扩展类型类名 
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String classname;
   /**
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String converter;
   /**
      *外键和流程实例临时表的DBID关联，不知道何时有值 
      *数据类型：char(32) 
      *是否必填:false 
   **/
   private java.lang.String exesys;

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
   public java.lang.String getTask(){
      return task;
   }

   /**
    *
    *@param task
    */
   public void setTask(java.lang.String task){
      this.task = task;
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
   public java.lang.String getLob(){
      return lob;
   }

   /**
    *
    *@param lob
    */
   public void setLob(java.lang.String lob){
      this.lob = lob;
   }

   /**
    *
    *@return java.util.Date
    */
   public java.util.Date getDateValue(){
      return dateValue;
   }

   /**
    *
    *@param dateValue
    */
   public void setDateValue(java.util.Date dateValue){
      this.dateValue = dateValue;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getDoubleValue(){
      return doubleValue;
   }

   /**
    *
    *@param doubleValue
    */
   public void setDoubleValue(java.lang.String doubleValue){
      this.doubleValue = doubleValue;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getLongValue(){
      return longValue;
   }

   /**
    *
    *@param longValue
    */
   public void setLongValue(java.lang.String longValue){
      this.longValue = longValue;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getStringValue(){
      return stringValue;
   }

   /**
    *
    *@param stringValue
    */
   public void setStringValue(java.lang.String stringValue){
      this.stringValue = stringValue;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getTextValue(){
      return textValue;
   }

   /**
    *
    *@param textValue
    */
   public void setTextValue(java.lang.String textValue){
      this.textValue = textValue;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getHist(){
      return hist;
   }

   /**
    *
    *@param hist
    */
   public void setHist(java.lang.String hist){
      this.hist = hist;
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
    *扩展类型类名
    *@return java.lang.String
    */
   public java.lang.String getClassname(){
      return classname;
   }

   /**
    *扩展类型类名
    *@param classname
    */
   public void setClassname(java.lang.String classname){
      this.classname = classname;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getConverter(){
      return converter;
   }

   /**
    *
    *@param converter
    */
   public void setConverter(java.lang.String converter){
      this.converter = converter;
   }

   /**
    *外键和流程实例临时表的DBID关联，不知道何时有值
    *@return java.lang.String
    */
   public java.lang.String getExesys(){
      return exesys;
   }

   /**
    *外键和流程实例临时表的DBID关联，不知道何时有值
    *@param exesys
    */
   public void setExesys(java.lang.String exesys){
      this.exesys = exesys;
   }

}