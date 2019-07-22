package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:企业用户信息表
 * 创建日期:2019-07-22 09:37:44
 */
@Table("user_cust_user_basic_inf")
public class UserCustUserBasicInf{

   /**
      *用户编号 
      *数据类型：varchar(32) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String usrId;
   /**
      *用户中文名称（姓名） 
      *数据类型：varchar(100) 
      *是否必填:false 
   **/
   private java.lang.String usrName;
   /**
      *归属企业客户号 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String custId;
   /**
      *证件类型:0-身份证、1-户口簿、2-护照 、5-港澳居民来往内地通行证、6-台湾同胞来往内地通行证、X-其他证件 
      *数据类型：varchar(2) 
      *是否必填:false 
   **/
   private java.lang.String idTyp;
   /**
      *证件号码 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String idNo;
   /**
      *手机号码 
      *数据类型：varchar(12) 
      *是否必填:false 
   **/
   private java.lang.String mobile;
   /**
      *来源渠道:01-直接注册、02-运营维护 
      *数据类型：char(2) 
      *是否必填:false 
   **/
   private java.lang.String regChl;
   /**
      *出生日期 
      *数据类型：date 
      *是否必填:false 
   **/
   private java.util.Date birthday;
   /**
      *性别:0-未知、1-男、2-女、3-未说明 
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String sex;
   /**
      *电话 
      *数据类型：varchar(25) 
      *是否必填:false 
   **/
   private java.lang.String telephone;
   /**
      *邮件:邮件 
      *数据类型：varchar(50) 
      *是否必填:false 
   **/
   private java.lang.String email;
   /**
      *QQ号码 
      *数据类型：varchar(20) 
      *是否必填:false 
   **/
   private java.lang.String qqNum;
   /**
      *邮编 
      *数据类型：char(6) 
      *是否必填:false 
   **/
   private java.lang.String postCode;
   /**
      *联系地址 
      *数据类型：varchar(200) 
      *是否必填:false 
   **/
   private java.lang.String address;
   /**
      *状态:00-无效、10-有效、20-审核中 
      *数据类型：char(2) 
      *是否必填:false 
   **/
   private java.lang.String status;
   /**
      *职务 
      *数据类型：varchar(50) 
      *是否必填:false 
   **/
   private java.lang.String office;
   /**
      *建立时间 
      *数据类型：datetime(6) 
      *是否必填:true 
   **/
   private java.util.Date createTime;
   /**
      *最后更新时间 
      *数据类型：datetime(6) 
      *是否必填:true 
   **/
   private java.util.Date updateTime;
   /**
      *最后更新程序 
      *数据类型：varchar(200) 
      *是否必填:true 
   **/
   private java.lang.String updateProg;

  //get和set方法
   /**
    *用户编号
    *@return java.lang.String
    */
   public java.lang.String getUsrId(){
      return usrId;
   }

   /**
    *用户编号
    *@param usrId
    */
   public void setUsrId(java.lang.String usrId){
      this.usrId = usrId;
   }

   /**
    *用户中文名称（姓名）
    *@return java.lang.String
    */
   public java.lang.String getUsrName(){
      return usrName;
   }

   /**
    *用户中文名称（姓名）
    *@param usrName
    */
   public void setUsrName(java.lang.String usrName){
      this.usrName = usrName;
   }

   /**
    *归属企业客户号
    *@return java.lang.String
    */
   public java.lang.String getCustId(){
      return custId;
   }

   /**
    *归属企业客户号
    *@param custId
    */
   public void setCustId(java.lang.String custId){
      this.custId = custId;
   }

   /**
    *证件类型:0-身份证、1-户口簿、2-护照 、5-港澳居民来往内地通行证、6-台湾同胞来往内地通行证、X-其他证件
    *@return java.lang.String
    */
   public java.lang.String getIdTyp(){
      return idTyp;
   }

   /**
    *证件类型:0-身份证、1-户口簿、2-护照 、5-港澳居民来往内地通行证、6-台湾同胞来往内地通行证、X-其他证件
    *@param idTyp
    */
   public void setIdTyp(java.lang.String idTyp){
      this.idTyp = idTyp;
   }

   /**
    *证件号码
    *@return java.lang.String
    */
   public java.lang.String getIdNo(){
      return idNo;
   }

   /**
    *证件号码
    *@param idNo
    */
   public void setIdNo(java.lang.String idNo){
      this.idNo = idNo;
   }

   /**
    *手机号码
    *@return java.lang.String
    */
   public java.lang.String getMobile(){
      return mobile;
   }

   /**
    *手机号码
    *@param mobile
    */
   public void setMobile(java.lang.String mobile){
      this.mobile = mobile;
   }

   /**
    *来源渠道:01-直接注册、02-运营维护
    *@return java.lang.String
    */
   public java.lang.String getRegChl(){
      return regChl;
   }

   /**
    *来源渠道:01-直接注册、02-运营维护
    *@param regChl
    */
   public void setRegChl(java.lang.String regChl){
      this.regChl = regChl;
   }

   /**
    *出生日期
    *@return java.util.Date
    */
   public java.util.Date getBirthday(){
      return birthday;
   }

   /**
    *出生日期
    *@param birthday
    */
   public void setBirthday(java.util.Date birthday){
      this.birthday = birthday;
   }

   /**
    *性别:0-未知、1-男、2-女、3-未说明
    *@return java.lang.String
    */
   public java.lang.String getSex(){
      return sex;
   }

   /**
    *性别:0-未知、1-男、2-女、3-未说明
    *@param sex
    */
   public void setSex(java.lang.String sex){
      this.sex = sex;
   }

   /**
    *电话
    *@return java.lang.String
    */
   public java.lang.String getTelephone(){
      return telephone;
   }

   /**
    *电话
    *@param telephone
    */
   public void setTelephone(java.lang.String telephone){
      this.telephone = telephone;
   }

   /**
    *邮件:邮件
    *@return java.lang.String
    */
   public java.lang.String getEmail(){
      return email;
   }

   /**
    *邮件:邮件
    *@param email
    */
   public void setEmail(java.lang.String email){
      this.email = email;
   }

   /**
    *QQ号码
    *@return java.lang.String
    */
   public java.lang.String getQqNum(){
      return qqNum;
   }

   /**
    *QQ号码
    *@param qqNum
    */
   public void setQqNum(java.lang.String qqNum){
      this.qqNum = qqNum;
   }

   /**
    *邮编
    *@return java.lang.String
    */
   public java.lang.String getPostCode(){
      return postCode;
   }

   /**
    *邮编
    *@param postCode
    */
   public void setPostCode(java.lang.String postCode){
      this.postCode = postCode;
   }

   /**
    *联系地址
    *@return java.lang.String
    */
   public java.lang.String getAddress(){
      return address;
   }

   /**
    *联系地址
    *@param address
    */
   public void setAddress(java.lang.String address){
      this.address = address;
   }

   /**
    *状态:00-无效、10-有效、20-审核中
    *@return java.lang.String
    */
   public java.lang.String getStatus(){
      return status;
   }

   /**
    *状态:00-无效、10-有效、20-审核中
    *@param status
    */
   public void setStatus(java.lang.String status){
      this.status = status;
   }

   /**
    *职务
    *@return java.lang.String
    */
   public java.lang.String getOffice(){
      return office;
   }

   /**
    *职务
    *@param office
    */
   public void setOffice(java.lang.String office){
      this.office = office;
   }

   /**
    *建立时间
    *@return java.util.Date
    */
   public java.util.Date getCreateTime(){
      return createTime;
   }

   /**
    *建立时间
    *@param createTime
    */
   public void setCreateTime(java.util.Date createTime){
      this.createTime = createTime;
   }

   /**
    *最后更新时间
    *@return java.util.Date
    */
   public java.util.Date getUpdateTime(){
      return updateTime;
   }

   /**
    *最后更新时间
    *@param updateTime
    */
   public void setUpdateTime(java.util.Date updateTime){
      this.updateTime = updateTime;
   }

   /**
    *最后更新程序
    *@return java.lang.String
    */
   public java.lang.String getUpdateProg(){
      return updateProg;
   }

   /**
    *最后更新程序
    *@param updateProg
    */
   public void setUpdateProg(java.lang.String updateProg){
      this.updateProg = updateProg;
   }

}