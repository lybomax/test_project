package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:[框架自带]系统菜单表
 * 创建日期:2019-07-22 09:37:14
 */
@Table("ifs_menu_inf")
public class IfsMenuInf{

   /**
      *菜单编号(主键) 
      *数据类型：varchar(20) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String funcid;
   /**
      *功能名称 
      *数据类型：varchar(60) 
      *是否必填:false 
   **/
   private java.lang.String funcname;
   /**
      *访问路径(相对路径) 
      *数据类型：varchar(250) 
      *是否必填:false 
   **/
   private java.lang.String pagepath;
   /**
      *菜单排版（暂不使用） 
      *数据类型：int(11) 
      *是否必填:false 
   **/
   private java.lang.Integer location;
   /**
      *是否为目录(1是；0否) 
      *数据类型：int(11) 
      *是否必填:false 
   **/
   private java.lang.Integer isdirectory;
   /**
      *上级节点编号，为空表示顶级 
      *数据类型：varchar(20) 
      *是否必填:false 
   **/
   private java.lang.String lastdirectory;
   /**
      *显示顺序 
      *数据类型：int(11) 
      *是否必填:false 
   **/
   private java.lang.Integer showseq;
   /**
      *暂不使用 
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String funcClass;
   /**
      *菜单类型(0=菜单，2=功能) 
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String funcType;
   /**
      *工作流标识(暂不使用) 
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String workflowFlag;
   /**
      *上级菜单编号(暂不使用) 
      *数据类型：char(10) 
      *是否必填:false 
   **/
   private java.lang.String upFuncCode;
   /**
      *功能描述 
      *数据类型：varchar(60) 
      *是否必填:false 
   **/
   private java.lang.String funcDesc;
   /**
      *状态(1有效，0无效) 
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String status;
   /**
      *扩展字段 
      *数据类型：char(20) 
      *是否必填:false 
   **/
   private java.lang.String miscflgs;
   /**
      *扩展字段 
      *数据类型：varchar(1024) 
      *是否必填:false 
   **/
   private java.lang.String misc;
   /**
      *图标名称(字体图表) 
      *数据类型：varchar(256) 
      *是否必填:false 
   **/
   private java.lang.String iconCls;

  //get和set方法
   /**
    *菜单编号(主键)
    *@return java.lang.String
    */
   public java.lang.String getFuncid(){
      return funcid;
   }

   /**
    *菜单编号(主键)
    *@param funcid
    */
   public void setFuncid(java.lang.String funcid){
      this.funcid = funcid;
   }

   /**
    *功能名称
    *@return java.lang.String
    */
   public java.lang.String getFuncname(){
      return funcname;
   }

   /**
    *功能名称
    *@param funcname
    */
   public void setFuncname(java.lang.String funcname){
      this.funcname = funcname;
   }

   /**
    *访问路径(相对路径)
    *@return java.lang.String
    */
   public java.lang.String getPagepath(){
      return pagepath;
   }

   /**
    *访问路径(相对路径)
    *@param pagepath
    */
   public void setPagepath(java.lang.String pagepath){
      this.pagepath = pagepath;
   }

   /**
    *菜单排版（暂不使用）
    *@return java.lang.Integer
    */
   public java.lang.Integer getLocation(){
      return location;
   }

   /**
    *菜单排版（暂不使用）
    *@param location
    */
   public void setLocation(java.lang.Integer location){
      this.location = location;
   }

   /**
    *是否为目录(1是；0否)
    *@return java.lang.Integer
    */
   public java.lang.Integer getIsdirectory(){
      return isdirectory;
   }

   /**
    *是否为目录(1是；0否)
    *@param isdirectory
    */
   public void setIsdirectory(java.lang.Integer isdirectory){
      this.isdirectory = isdirectory;
   }

   /**
    *上级节点编号，为空表示顶级
    *@return java.lang.String
    */
   public java.lang.String getLastdirectory(){
      return lastdirectory;
   }

   /**
    *上级节点编号，为空表示顶级
    *@param lastdirectory
    */
   public void setLastdirectory(java.lang.String lastdirectory){
      this.lastdirectory = lastdirectory;
   }

   /**
    *显示顺序
    *@return java.lang.Integer
    */
   public java.lang.Integer getShowseq(){
      return showseq;
   }

   /**
    *显示顺序
    *@param showseq
    */
   public void setShowseq(java.lang.Integer showseq){
      this.showseq = showseq;
   }

   /**
    *暂不使用
    *@return java.lang.String
    */
   public java.lang.String getFuncClass(){
      return funcClass;
   }

   /**
    *暂不使用
    *@param funcClass
    */
   public void setFuncClass(java.lang.String funcClass){
      this.funcClass = funcClass;
   }

   /**
    *菜单类型(0=菜单，2=功能)
    *@return java.lang.String
    */
   public java.lang.String getFuncType(){
      return funcType;
   }

   /**
    *菜单类型(0=菜单，2=功能)
    *@param funcType
    */
   public void setFuncType(java.lang.String funcType){
      this.funcType = funcType;
   }

   /**
    *工作流标识(暂不使用)
    *@return java.lang.String
    */
   public java.lang.String getWorkflowFlag(){
      return workflowFlag;
   }

   /**
    *工作流标识(暂不使用)
    *@param workflowFlag
    */
   public void setWorkflowFlag(java.lang.String workflowFlag){
      this.workflowFlag = workflowFlag;
   }

   /**
    *上级菜单编号(暂不使用)
    *@return java.lang.String
    */
   public java.lang.String getUpFuncCode(){
      return upFuncCode;
   }

   /**
    *上级菜单编号(暂不使用)
    *@param upFuncCode
    */
   public void setUpFuncCode(java.lang.String upFuncCode){
      this.upFuncCode = upFuncCode;
   }

   /**
    *功能描述
    *@return java.lang.String
    */
   public java.lang.String getFuncDesc(){
      return funcDesc;
   }

   /**
    *功能描述
    *@param funcDesc
    */
   public void setFuncDesc(java.lang.String funcDesc){
      this.funcDesc = funcDesc;
   }

   /**
    *状态(1有效，0无效)
    *@return java.lang.String
    */
   public java.lang.String getStatus(){
      return status;
   }

   /**
    *状态(1有效，0无效)
    *@param status
    */
   public void setStatus(java.lang.String status){
      this.status = status;
   }

   /**
    *扩展字段
    *@return java.lang.String
    */
   public java.lang.String getMiscflgs(){
      return miscflgs;
   }

   /**
    *扩展字段
    *@param miscflgs
    */
   public void setMiscflgs(java.lang.String miscflgs){
      this.miscflgs = miscflgs;
   }

   /**
    *扩展字段
    *@return java.lang.String
    */
   public java.lang.String getMisc(){
      return misc;
   }

   /**
    *扩展字段
    *@param misc
    */
   public void setMisc(java.lang.String misc){
      this.misc = misc;
   }

   /**
    *图标名称(字体图表)
    *@return java.lang.String
    */
   public java.lang.String getIconCls(){
      return iconCls;
   }

   /**
    *图标名称(字体图表)
    *@param iconCls
    */
   public void setIconCls(java.lang.String iconCls){
      this.iconCls = iconCls;
   }

}