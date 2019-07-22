package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:[框架自带]用户信息扩展表
 * 创建日期:2019-07-22 09:37:20
 */
@Table("ifs_staff_ext")
public class IfsStaffExt{

   /**
      *用户编号(主键) 
      *数据类型：varchar(20) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String tlrno;
   /**
      *联系电话 
      *数据类型：varchar(20) 
      *是否必填:false 
   **/
   private java.lang.String telNo;
   /**
      *邮箱地址 
      *数据类型：varchar(128) 
      *是否必填:false 
   **/
   private java.lang.String email;
   /**
      *QQ号 
      *数据类型：varchar(40) 
      *是否必填:false 
   **/
   private java.lang.String qqNo;
   /**
      *微信号 
      *数据类型：varchar(40) 
      *是否必填:false 
   **/
   private java.lang.String wxNo;
   /**
      *头像 
      *数据类型：mediumtext 
      *是否必填:false 
   **/
   private java.lang.String headImg;

  //get和set方法
   /**
    *用户编号(主键)
    *@return java.lang.String
    */
   public java.lang.String getTlrno(){
      return tlrno;
   }

   /**
    *用户编号(主键)
    *@param tlrno
    */
   public void setTlrno(java.lang.String tlrno){
      this.tlrno = tlrno;
   }

   /**
    *联系电话
    *@return java.lang.String
    */
   public java.lang.String getTelNo(){
      return telNo;
   }

   /**
    *联系电话
    *@param telNo
    */
   public void setTelNo(java.lang.String telNo){
      this.telNo = telNo;
   }

   /**
    *邮箱地址
    *@return java.lang.String
    */
   public java.lang.String getEmail(){
      return email;
   }

   /**
    *邮箱地址
    *@param email
    */
   public void setEmail(java.lang.String email){
      this.email = email;
   }

   /**
    *QQ号
    *@return java.lang.String
    */
   public java.lang.String getQqNo(){
      return qqNo;
   }

   /**
    *QQ号
    *@param qqNo
    */
   public void setQqNo(java.lang.String qqNo){
      this.qqNo = qqNo;
   }

   /**
    *微信号
    *@return java.lang.String
    */
   public java.lang.String getWxNo(){
      return wxNo;
   }

   /**
    *微信号
    *@param wxNo
    */
   public void setWxNo(java.lang.String wxNo){
      this.wxNo = wxNo;
   }

   /**
    *头像
    *@return java.lang.String
    */
   public java.lang.String getHeadImg(){
      return headImg;
   }

   /**
    *头像
    *@param headImg
    */
   public void setHeadImg(java.lang.String headImg){
      this.headImg = headImg;
   }

}