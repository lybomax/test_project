package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:
 * 创建日期:2019-07-22 09:36:24
 */
@Table("iff_assignpolicy")
public class IffAssignpolicy{

   /**
      *数据类型：char(32) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String handle;
   /**
      *1：单一分配
            2：多重分配
            3：抢占分配 
      *数据类型：int(1) 
      *是否必填:true 
   **/
   private java.lang.Integer assignmode;
   /**
      *1：按个数
            2：按百分比 
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String exittype;
   /**
      *数据类型：int(5) 
      *是否必填:false 
   **/
   private java.lang.Integer exitcount;
   /**
      *1：分配到人员
            2：分配到岗位
            3：分配到组织 
      *数据类型：int(2) 
      *是否必填:false 
   **/
   private java.lang.Integer ptkind;
   /**
      *1：通过组织信息选择
            2：通过流程变量赋值
            3：通过分派策略适配器 
      *数据类型：int(2) 
      *是否必填:false 
   **/
   private java.lang.Integer ptassign;
   /**
      *1：当前参与者为流程启动者
            2：当前参与者不能为上一节点参与者 
      *数据类型：int(2) 
      *是否必填:false 
   **/
   private java.lang.Integer pthistory;
   /**
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String result;

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
    *1：单一分配
            2：多重分配
            3：抢占分配
    *@return java.lang.Integer
    */
   public java.lang.Integer getAssignmode(){
      return assignmode;
   }

   /**
    *1：单一分配
            2：多重分配
            3：抢占分配
    *@param assignmode
    */
   public void setAssignmode(java.lang.Integer assignmode){
      this.assignmode = assignmode;
   }

   /**
    *1：按个数
            2：按百分比
    *@return java.lang.String
    */
   public java.lang.String getExittype(){
      return exittype;
   }

   /**
    *1：按个数
            2：按百分比
    *@param exittype
    */
   public void setExittype(java.lang.String exittype){
      this.exittype = exittype;
   }

   /**
    *
    *@return java.lang.Integer
    */
   public java.lang.Integer getExitcount(){
      return exitcount;
   }

   /**
    *
    *@param exitcount
    */
   public void setExitcount(java.lang.Integer exitcount){
      this.exitcount = exitcount;
   }

   /**
    *1：分配到人员
            2：分配到岗位
            3：分配到组织
    *@return java.lang.Integer
    */
   public java.lang.Integer getPtkind(){
      return ptkind;
   }

   /**
    *1：分配到人员
            2：分配到岗位
            3：分配到组织
    *@param ptkind
    */
   public void setPtkind(java.lang.Integer ptkind){
      this.ptkind = ptkind;
   }

   /**
    *1：通过组织信息选择
            2：通过流程变量赋值
            3：通过分派策略适配器
    *@return java.lang.Integer
    */
   public java.lang.Integer getPtassign(){
      return ptassign;
   }

   /**
    *1：通过组织信息选择
            2：通过流程变量赋值
            3：通过分派策略适配器
    *@param ptassign
    */
   public void setPtassign(java.lang.Integer ptassign){
      this.ptassign = ptassign;
   }

   /**
    *1：当前参与者为流程启动者
            2：当前参与者不能为上一节点参与者
    *@return java.lang.Integer
    */
   public java.lang.Integer getPthistory(){
      return pthistory;
   }

   /**
    *1：当前参与者为流程启动者
            2：当前参与者不能为上一节点参与者
    *@param pthistory
    */
   public void setPthistory(java.lang.Integer pthistory){
      this.pthistory = pthistory;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getResult(){
      return result;
   }

   /**
    *
    *@param result
    */
   public void setResult(java.lang.String result){
      this.result = result;
   }

}