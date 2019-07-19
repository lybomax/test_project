package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:企业客户经理表
 * 创建日期:2019-07-19 17:33:12
 */
@Table("user_ent_manager_inf")
public class UserEntManagerInf{

   /**
      *数据类型：varchar(32) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String id;
   /**
      *客户经理编号 
      *数据类型：varchar(20) 
      *是否必填:false 
   **/
   private java.lang.String managerId;
   /**
      *客户经理名称 
      *数据类型：varchar(100) 
      *是否必填:false 
   **/
   private java.lang.String managerName;
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
    *
    *@return java.lang.String
    */
   public java.lang.String getId(){
      return id;
   }

   /**
    *
    *@param id
    */
   public void setId(java.lang.String id){
      this.id = id;
   }

   /**
    *客户经理编号
    *@return java.lang.String
    */
   public java.lang.String getManagerId(){
      return managerId;
   }

   /**
    *客户经理编号
    *@param managerId
    */
   public void setManagerId(java.lang.String managerId){
      this.managerId = managerId;
   }

   /**
    *客户经理名称
    *@return java.lang.String
    */
   public java.lang.String getManagerName(){
      return managerName;
   }

   /**
    *客户经理名称
    *@param managerName
    */
   public void setManagerName(java.lang.String managerName){
      this.managerName = managerName;
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