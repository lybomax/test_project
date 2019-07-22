package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:
 * 创建日期:2019-07-22 09:36:43
 */
@Table("iff_log")
public class IffLog{

   /**
      *数据类型：char(32) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String poid;
   /**
      *数据类型：char(32) 
      *是否必填:true 
   **/
   private java.lang.String categorypoid;
   /**
      *数据类型：datetime 
      *是否必填:true 
   **/
   private java.util.Date logtime;
   /**
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String logtitle;
   /**
      *数据类型：longtext 
      *是否必填:false 
   **/
   private java.lang.String logcontent;
   /**
      *数据类型：char(32) 
      *是否必填:false 
   **/
   private java.lang.String mpid;
   /**
      *数据类型：char(32) 
      *是否必填:false 
   **/
   private java.lang.String processpoid;
   /**
      *数据类型：varchar(64) 
      *是否必填:false 
   **/
   private java.lang.String actionname;
   /**
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String actiontype;
   /**
      *数据类型：varchar(64) 
      *是否必填:false 
   **/
   private java.lang.String operatorid;
   /**
      *数据类型：varchar(64) 
      *是否必填:false 
   **/
   private java.lang.String operatorname;
   /**
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String remark;

  //get和set方法
   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getPoid(){
      return poid;
   }

   /**
    *
    *@param poid
    */
   public void setPoid(java.lang.String poid){
      this.poid = poid;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getCategorypoid(){
      return categorypoid;
   }

   /**
    *
    *@param categorypoid
    */
   public void setCategorypoid(java.lang.String categorypoid){
      this.categorypoid = categorypoid;
   }

   /**
    *
    *@return java.util.Date
    */
   public java.util.Date getLogtime(){
      return logtime;
   }

   /**
    *
    *@param logtime
    */
   public void setLogtime(java.util.Date logtime){
      this.logtime = logtime;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getLogtitle(){
      return logtitle;
   }

   /**
    *
    *@param logtitle
    */
   public void setLogtitle(java.lang.String logtitle){
      this.logtitle = logtitle;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getLogcontent(){
      return logcontent;
   }

   /**
    *
    *@param logcontent
    */
   public void setLogcontent(java.lang.String logcontent){
      this.logcontent = logcontent;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getMpid(){
      return mpid;
   }

   /**
    *
    *@param mpid
    */
   public void setMpid(java.lang.String mpid){
      this.mpid = mpid;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getProcesspoid(){
      return processpoid;
   }

   /**
    *
    *@param processpoid
    */
   public void setProcesspoid(java.lang.String processpoid){
      this.processpoid = processpoid;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getActionname(){
      return actionname;
   }

   /**
    *
    *@param actionname
    */
   public void setActionname(java.lang.String actionname){
      this.actionname = actionname;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getActiontype(){
      return actiontype;
   }

   /**
    *
    *@param actiontype
    */
   public void setActiontype(java.lang.String actiontype){
      this.actiontype = actiontype;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getOperatorid(){
      return operatorid;
   }

   /**
    *
    *@param operatorid
    */
   public void setOperatorid(java.lang.String operatorid){
      this.operatorid = operatorid;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getOperatorname(){
      return operatorname;
   }

   /**
    *
    *@param operatorname
    */
   public void setOperatorname(java.lang.String operatorname){
      this.operatorname = operatorname;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getRemark(){
      return remark;
   }

   /**
    *
    *@param remark
    */
   public void setRemark(java.lang.String remark){
      this.remark = remark;
   }

}