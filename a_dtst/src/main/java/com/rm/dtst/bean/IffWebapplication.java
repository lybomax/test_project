package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:
 * 创建日期:2019-07-22 09:37:06
 */
@Table("iff_webapplication")
public class IffWebapplication{

   /**
      *数据类型：char(32) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String dbid;
   /**
      *数据类型：timestamp 
      *是否必填:true 
   **/
   private java.lang.String lastupdatetime;
   /**
      *数据类型：int(11) 
      *是否必填:false 
   **/
   private java.lang.Integer engineIndex;
   /**
      *数据类型：char(15) 
      *是否必填:false 
   **/
   private java.lang.String ip;
   /**
      *数据类型：varchar(50) 
      *是否必填:false 
   **/
   private java.lang.String hostName;

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
   public java.lang.String getLastupdatetime(){
      return lastupdatetime;
   }

   /**
    *
    *@param lastupdatetime
    */
   public void setLastupdatetime(java.lang.String lastupdatetime){
      this.lastupdatetime = lastupdatetime;
   }

   /**
    *
    *@return java.lang.Integer
    */
   public java.lang.Integer getEngineIndex(){
      return engineIndex;
   }

   /**
    *
    *@param engineIndex
    */
   public void setEngineIndex(java.lang.Integer engineIndex){
      this.engineIndex = engineIndex;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getIp(){
      return ip;
   }

   /**
    *
    *@param ip
    */
   public void setIp(java.lang.String ip){
      this.ip = ip;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getHostName(){
      return hostName;
   }

   /**
    *
    *@param hostName
    */
   public void setHostName(java.lang.String hostName){
      this.hostName = hostName;
   }

}