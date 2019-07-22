package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:商机信息表
 * 创建日期:2019-07-22 09:37:40
 */
@Table("user_cust_business")
public class UserCustBusiness{

   /**
      *主键 
      *数据类型：varchar(32) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String id;
   /**
      *企业编号 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String custId;
   /**
      *企业名称 
      *数据类型：varchar(100) 
      *是否必填:false 
   **/
   private java.lang.String custName;
   /**
      *状态：01-未处理，02-已处理 
      *数据类型：char(2) 
      *是否必填:false 
   **/
   private java.lang.String state;
   /**
      *联系人 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String contacts;
   /**
      *职务 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String position;
   /**
      *手机号码 
      *数据类型：varchar(12) 
      *是否必填:false 
   **/
   private java.lang.String mobile;
   /**
      *跟进结果 
      *数据类型：varchar(500) 
      *是否必填:false 
   **/
   private java.lang.String follwoTxt;
   /**
      *意向融资金额 
      *数据类型：decimal(18,2) 
      *是否必填:false 
   **/
   private java.math.BigDecimal intentFinancingAmt;
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
    *主键
    *@return java.lang.String
    */
   public java.lang.String getId(){
      return id;
   }

   /**
    *主键
    *@param id
    */
   public void setId(java.lang.String id){
      this.id = id;
   }

   /**
    *企业编号
    *@return java.lang.String
    */
   public java.lang.String getCustId(){
      return custId;
   }

   /**
    *企业编号
    *@param custId
    */
   public void setCustId(java.lang.String custId){
      this.custId = custId;
   }

   /**
    *企业名称
    *@return java.lang.String
    */
   public java.lang.String getCustName(){
      return custName;
   }

   /**
    *企业名称
    *@param custName
    */
   public void setCustName(java.lang.String custName){
      this.custName = custName;
   }

   /**
    *状态：01-未处理，02-已处理
    *@return java.lang.String
    */
   public java.lang.String getState(){
      return state;
   }

   /**
    *状态：01-未处理，02-已处理
    *@param state
    */
   public void setState(java.lang.String state){
      this.state = state;
   }

   /**
    *联系人
    *@return java.lang.String
    */
   public java.lang.String getContacts(){
      return contacts;
   }

   /**
    *联系人
    *@param contacts
    */
   public void setContacts(java.lang.String contacts){
      this.contacts = contacts;
   }

   /**
    *职务
    *@return java.lang.String
    */
   public java.lang.String getPosition(){
      return position;
   }

   /**
    *职务
    *@param position
    */
   public void setPosition(java.lang.String position){
      this.position = position;
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
    *跟进结果
    *@return java.lang.String
    */
   public java.lang.String getFollwoTxt(){
      return follwoTxt;
   }

   /**
    *跟进结果
    *@param follwoTxt
    */
   public void setFollwoTxt(java.lang.String follwoTxt){
      this.follwoTxt = follwoTxt;
   }

   /**
    *意向融资金额
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getIntentFinancingAmt(){
      return intentFinancingAmt;
   }

   /**
    *意向融资金额
    *@param intentFinancingAmt
    */
   public void setIntentFinancingAmt(java.math.BigDecimal intentFinancingAmt){
      this.intentFinancingAmt = intentFinancingAmt;
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