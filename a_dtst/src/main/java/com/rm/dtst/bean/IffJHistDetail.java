package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:
 * 创建日期:2019-07-22 09:36:31
 */
@Table("iff_j_hist_detail")
public class IffJHistDetail{

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
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String userid;
   /**
      *数据类型：datetime 
      *是否必填:false 
   **/
   private java.util.Date time;
   /**
      *数据类型：char(32) 
      *是否必填:false 
   **/
   private java.lang.String hproci;
   /**
      *数据类型：int(11) 
      *是否必填:false 
   **/
   private java.lang.Integer hprociidx;
   /**
      *数据类型：char(32) 
      *是否必填:false 
   **/
   private java.lang.String hacti;
   /**
      *数据类型：int(11) 
      *是否必填:false 
   **/
   private java.lang.Integer hactiidx;
   /**
      *数据类型：char(32) 
      *是否必填:false 
   **/
   private java.lang.String htask;
   /**
      *数据类型：int(11) 
      *是否必填:false 
   **/
   private java.lang.Integer htaskidx;
   /**
      *数据类型：char(32) 
      *是否必填:false 
   **/
   private java.lang.String hvar;
   /**
      *数据类型：int(11) 
      *是否必填:false 
   **/
   private java.lang.Integer hvaridx;
   /**
      *数据类型：longtext 
      *是否必填:false 
   **/
   private java.lang.String message;
   /**
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String oldStr;
   /**
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String newStr;
   /**
      *数据类型：int(11) 
      *是否必填:false 
   **/
   private java.lang.Integer oldInt;
   /**
      *数据类型：int(11) 
      *是否必填:false 
   **/
   private java.lang.Integer newInt;
   /**
      *数据类型：datetime 
      *是否必填:false 
   **/
   private java.util.Date oldTime;
   /**
      *数据类型：datetime 
      *是否必填:false 
   **/
   private java.util.Date newTime;
   /**
      *数据类型：char(32) 
      *是否必填:false 
   **/
   private java.lang.String parent;
   /**
      *数据类型：int(11) 
      *是否必填:false 
   **/
   private java.lang.Integer parentIdx;

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
    *@return java.lang.String
    */
   public java.lang.String getUserid(){
      return userid;
   }

   /**
    *
    *@param userid
    */
   public void setUserid(java.lang.String userid){
      this.userid = userid;
   }

   /**
    *
    *@return java.util.Date
    */
   public java.util.Date getTime(){
      return time;
   }

   /**
    *
    *@param time
    */
   public void setTime(java.util.Date time){
      this.time = time;
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
    *@return java.lang.Integer
    */
   public java.lang.Integer getHprociidx(){
      return hprociidx;
   }

   /**
    *
    *@param hprociidx
    */
   public void setHprociidx(java.lang.Integer hprociidx){
      this.hprociidx = hprociidx;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getHacti(){
      return hacti;
   }

   /**
    *
    *@param hacti
    */
   public void setHacti(java.lang.String hacti){
      this.hacti = hacti;
   }

   /**
    *
    *@return java.lang.Integer
    */
   public java.lang.Integer getHactiidx(){
      return hactiidx;
   }

   /**
    *
    *@param hactiidx
    */
   public void setHactiidx(java.lang.Integer hactiidx){
      this.hactiidx = hactiidx;
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
    *@return java.lang.Integer
    */
   public java.lang.Integer getHtaskidx(){
      return htaskidx;
   }

   /**
    *
    *@param htaskidx
    */
   public void setHtaskidx(java.lang.Integer htaskidx){
      this.htaskidx = htaskidx;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getHvar(){
      return hvar;
   }

   /**
    *
    *@param hvar
    */
   public void setHvar(java.lang.String hvar){
      this.hvar = hvar;
   }

   /**
    *
    *@return java.lang.Integer
    */
   public java.lang.Integer getHvaridx(){
      return hvaridx;
   }

   /**
    *
    *@param hvaridx
    */
   public void setHvaridx(java.lang.Integer hvaridx){
      this.hvaridx = hvaridx;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getMessage(){
      return message;
   }

   /**
    *
    *@param message
    */
   public void setMessage(java.lang.String message){
      this.message = message;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getOldStr(){
      return oldStr;
   }

   /**
    *
    *@param oldStr
    */
   public void setOldStr(java.lang.String oldStr){
      this.oldStr = oldStr;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getNewStr(){
      return newStr;
   }

   /**
    *
    *@param newStr
    */
   public void setNewStr(java.lang.String newStr){
      this.newStr = newStr;
   }

   /**
    *
    *@return java.lang.Integer
    */
   public java.lang.Integer getOldInt(){
      return oldInt;
   }

   /**
    *
    *@param oldInt
    */
   public void setOldInt(java.lang.Integer oldInt){
      this.oldInt = oldInt;
   }

   /**
    *
    *@return java.lang.Integer
    */
   public java.lang.Integer getNewInt(){
      return newInt;
   }

   /**
    *
    *@param newInt
    */
   public void setNewInt(java.lang.Integer newInt){
      this.newInt = newInt;
   }

   /**
    *
    *@return java.util.Date
    */
   public java.util.Date getOldTime(){
      return oldTime;
   }

   /**
    *
    *@param oldTime
    */
   public void setOldTime(java.util.Date oldTime){
      this.oldTime = oldTime;
   }

   /**
    *
    *@return java.util.Date
    */
   public java.util.Date getNewTime(){
      return newTime;
   }

   /**
    *
    *@param newTime
    */
   public void setNewTime(java.util.Date newTime){
      this.newTime = newTime;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getParent(){
      return parent;
   }

   /**
    *
    *@param parent
    */
   public void setParent(java.lang.String parent){
      this.parent = parent;
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

}