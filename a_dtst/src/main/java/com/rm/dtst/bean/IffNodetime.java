package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:
 * 创建日期:2019-07-22 09:36:47
 */
@Table("iff_nodetime")
public class IffNodetime{

   /**
      *数据类型：char(32) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String handle;
   /**
      *数据类型：int(2) 
      *是否必填:true 
   **/
   private java.lang.Integer delayday;
   /**
      *数据类型：int(2) 
      *是否必填:true 
   **/
   private java.lang.Integer delayhour;
   /**
      *数据类型：int(2) 
      *是否必填:true 
   **/
   private java.lang.Integer delayminute;
   /**
      *数据类型：int(2) 
      *是否必填:true 
   **/
   private java.lang.Integer delaysecond;
   /**
      *1：无循环
            2：有次数限制的循环
            3：有时间限制的循环 
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String cycletype;
   /**
      *数据类型：int(5) 
      *是否必填:false 
   **/
   private java.lang.Integer cyclecount;
   /**
      *数据类型：int(2) 
      *是否必填:false 
   **/
   private java.lang.Integer intervalday;
   /**
      *数据类型：int(2) 
      *是否必填:false 
   **/
   private java.lang.Integer intervalhour;
   /**
      *数据类型：int(2) 
      *是否必填:false 
   **/
   private java.lang.Integer intervalminute;
   /**
      *数据类型：int(2) 
      *是否必填:false 
   **/
   private java.lang.Integer intervalsecond;
   /**
      *数据类型：int(2) 
      *是否必填:false 
   **/
   private java.lang.Integer continueday;
   /**
      *数据类型：int(2) 
      *是否必填:false 
   **/
   private java.lang.Integer continuehour;
   /**
      *数据类型：int(2) 
      *是否必填:false 
   **/
   private java.lang.Integer continueminute;
   /**
      *数据类型：int(2) 
      *是否必填:false 
   **/
   private java.lang.Integer continuesecond;

  //get和set方法
   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getHandle(){
      return handle;
   }

   /**
    *
    *@param handle
    */
   public void setHandle(java.lang.String handle){
      this.handle = handle;
   }

   /**
    *
    *@return java.lang.Integer
    */
   public java.lang.Integer getDelayday(){
      return delayday;
   }

   /**
    *
    *@param delayday
    */
   public void setDelayday(java.lang.Integer delayday){
      this.delayday = delayday;
   }

   /**
    *
    *@return java.lang.Integer
    */
   public java.lang.Integer getDelayhour(){
      return delayhour;
   }

   /**
    *
    *@param delayhour
    */
   public void setDelayhour(java.lang.Integer delayhour){
      this.delayhour = delayhour;
   }

   /**
    *
    *@return java.lang.Integer
    */
   public java.lang.Integer getDelayminute(){
      return delayminute;
   }

   /**
    *
    *@param delayminute
    */
   public void setDelayminute(java.lang.Integer delayminute){
      this.delayminute = delayminute;
   }

   /**
    *
    *@return java.lang.Integer
    */
   public java.lang.Integer getDelaysecond(){
      return delaysecond;
   }

   /**
    *
    *@param delaysecond
    */
   public void setDelaysecond(java.lang.Integer delaysecond){
      this.delaysecond = delaysecond;
   }

   /**
    *1：无循环
            2：有次数限制的循环
            3：有时间限制的循环
    *@return java.lang.String
    */
   public java.lang.String getCycletype(){
      return cycletype;
   }

   /**
    *1：无循环
            2：有次数限制的循环
            3：有时间限制的循环
    *@param cycletype
    */
   public void setCycletype(java.lang.String cycletype){
      this.cycletype = cycletype;
   }

   /**
    *
    *@return java.lang.Integer
    */
   public java.lang.Integer getCyclecount(){
      return cyclecount;
   }

   /**
    *
    *@param cyclecount
    */
   public void setCyclecount(java.lang.Integer cyclecount){
      this.cyclecount = cyclecount;
   }

   /**
    *
    *@return java.lang.Integer
    */
   public java.lang.Integer getIntervalday(){
      return intervalday;
   }

   /**
    *
    *@param intervalday
    */
   public void setIntervalday(java.lang.Integer intervalday){
      this.intervalday = intervalday;
   }

   /**
    *
    *@return java.lang.Integer
    */
   public java.lang.Integer getIntervalhour(){
      return intervalhour;
   }

   /**
    *
    *@param intervalhour
    */
   public void setIntervalhour(java.lang.Integer intervalhour){
      this.intervalhour = intervalhour;
   }

   /**
    *
    *@return java.lang.Integer
    */
   public java.lang.Integer getIntervalminute(){
      return intervalminute;
   }

   /**
    *
    *@param intervalminute
    */
   public void setIntervalminute(java.lang.Integer intervalminute){
      this.intervalminute = intervalminute;
   }

   /**
    *
    *@return java.lang.Integer
    */
   public java.lang.Integer getIntervalsecond(){
      return intervalsecond;
   }

   /**
    *
    *@param intervalsecond
    */
   public void setIntervalsecond(java.lang.Integer intervalsecond){
      this.intervalsecond = intervalsecond;
   }

   /**
    *
    *@return java.lang.Integer
    */
   public java.lang.Integer getContinueday(){
      return continueday;
   }

   /**
    *
    *@param continueday
    */
   public void setContinueday(java.lang.Integer continueday){
      this.continueday = continueday;
   }

   /**
    *
    *@return java.lang.Integer
    */
   public java.lang.Integer getContinuehour(){
      return continuehour;
   }

   /**
    *
    *@param continuehour
    */
   public void setContinuehour(java.lang.Integer continuehour){
      this.continuehour = continuehour;
   }

   /**
    *
    *@return java.lang.Integer
    */
   public java.lang.Integer getContinueminute(){
      return continueminute;
   }

   /**
    *
    *@param continueminute
    */
   public void setContinueminute(java.lang.Integer continueminute){
      this.continueminute = continueminute;
   }

   /**
    *
    *@return java.lang.Integer
    */
   public java.lang.Integer getContinuesecond(){
      return continuesecond;
   }

   /**
    *
    *@param continuesecond
    */
   public void setContinuesecond(java.lang.Integer continuesecond){
      this.continuesecond = continuesecond;
   }

}