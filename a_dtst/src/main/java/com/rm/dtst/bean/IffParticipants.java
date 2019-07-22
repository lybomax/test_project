package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:
 * 创建日期:2019-07-22 09:36:50
 */
@Table("iff_participants")
public class IffParticipants{

   /**
      *数据类型：char(32) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String handle;
   /**
      *数据类型：varchar(20) 
      *是否必填:true 
   **/
   private java.lang.String oprNo;
   /**
      *数据类型：varchar(128) 
      *是否必填:true 
   **/
   private java.lang.String orpNm;
   /**
      *数据类型：varchar(20) 
      *是否必填:true 
   **/
   private java.lang.String brhNo;
   /**
      *数据类型：varchar(128) 
      *是否必填:true 
   **/
   private java.lang.String brhNm;
   /**
      *数据类型：varchar(20) 
      *是否必填:true 
   **/
   private java.lang.String dptNo;
   /**
      *数据类型：varchar(128) 
      *是否必填:true 
   **/
   private java.lang.String dptNm;

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
    *@return java.lang.String
    */
   public java.lang.String getOprNo(){
      return oprNo;
   }

   /**
    *
    *@param oprNo
    */
   public void setOprNo(java.lang.String oprNo){
      this.oprNo = oprNo;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getOrpNm(){
      return orpNm;
   }

   /**
    *
    *@param orpNm
    */
   public void setOrpNm(java.lang.String orpNm){
      this.orpNm = orpNm;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getBrhNo(){
      return brhNo;
   }

   /**
    *
    *@param brhNo
    */
   public void setBrhNo(java.lang.String brhNo){
      this.brhNo = brhNo;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getBrhNm(){
      return brhNm;
   }

   /**
    *
    *@param brhNm
    */
   public void setBrhNm(java.lang.String brhNm){
      this.brhNm = brhNm;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getDptNo(){
      return dptNo;
   }

   /**
    *
    *@param dptNo
    */
   public void setDptNo(java.lang.String dptNo){
      this.dptNo = dptNo;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getDptNm(){
      return dptNm;
   }

   /**
    *
    *@param dptNm
    */
   public void setDptNm(java.lang.String dptNm){
      this.dptNm = dptNm;
   }

}