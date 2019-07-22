package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:
 * 创建日期:2019-07-22 09:36:47
 */
@Table("iff_nodetemplate")
public class IffNodetemplate{

   /**
      *数据类型：char(32) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String handle;
   /**
      *数据类型：char(32) 
      *是否必填:true 
   **/
   private java.lang.String templatehandle;
   /**
      *数据类型：varchar(64) 
      *是否必填:true 
   **/
   private java.lang.String nodetemplateid;
   /**
      *数据类型：varchar(64) 
      *是否必填:true 
   **/
   private java.lang.String name;
   /**
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String remark;
   /**
      *1:开始节点
            2:结束节点
            3:人工节点
            4:自动节点
            5:并行分支节点
            6:并行汇聚节点
            7:决策分支节点
            8:决策汇聚节点
            9:等待节点
            10:定时节点
            11:抄送节点
            12:子流程节点
            13:虚拟节点 
      *数据类型：int(2) 
      *是否必填:true 
   **/
   private java.lang.Integer kind;
   /**
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String url;
   /**
      *1:允许跳转到其他节点
            2:允许其他节点跳转到本节点 
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String skipauth;
   /**
      *1:允许驳回到其他节点
            2:允许其他节点驳回到本节点 
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String rejectauth;
   /**
      *1:驳回到首节点
            2:驳回到上一节点 
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String rejectdefault;
   /**
      *1:直接返回本节点
            2:按照历史路径重新流转 
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String rejectdesflow;
   /**
      *1:SPRING BEAN
            2:普通JAVA类 
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String adaptertype;
   /**
      *当适配器类型为“0”时，名称为JAVA完整类名（包+名称）
            当适配器类型为“1”时，名称为SPRING配置的BEAN ID 
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String adaptername;
   /**
      *三位码表示，分别表示为：可读、可改、可删除
            允许为0，不允许为1
            
             
      *数据类型：char(3) 
      *是否必填:false 
   **/
   private java.lang.String oprateauth;
   /**
      *数据类型：int(2) 
      *是否必填:false 
   **/
   private java.lang.Integer priority;

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
   public java.lang.String getTemplatehandle(){
      return templatehandle;
   }

   /**
    *
    *@param templatehandle
    */
   public void setTemplatehandle(java.lang.String templatehandle){
      this.templatehandle = templatehandle;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getNodetemplateid(){
      return nodetemplateid;
   }

   /**
    *
    *@param nodetemplateid
    */
   public void setNodetemplateid(java.lang.String nodetemplateid){
      this.nodetemplateid = nodetemplateid;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getName(){
      return name;
   }

   /**
    *
    *@param name
    */
   public void setName(java.lang.String name){
      this.name = name;
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

   /**
    *1:开始节点
            2:结束节点
            3:人工节点
            4:自动节点
            5:并行分支节点
            6:并行汇聚节点
            7:决策分支节点
            8:决策汇聚节点
            9:等待节点
            10:定时节点
            11:抄送节点
            12:子流程节点
            13:虚拟节点
    *@return java.lang.Integer
    */
   public java.lang.Integer getKind(){
      return kind;
   }

   /**
    *1:开始节点
            2:结束节点
            3:人工节点
            4:自动节点
            5:并行分支节点
            6:并行汇聚节点
            7:决策分支节点
            8:决策汇聚节点
            9:等待节点
            10:定时节点
            11:抄送节点
            12:子流程节点
            13:虚拟节点
    *@param kind
    */
   public void setKind(java.lang.Integer kind){
      this.kind = kind;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getUrl(){
      return url;
   }

   /**
    *
    *@param url
    */
   public void setUrl(java.lang.String url){
      this.url = url;
   }

   /**
    *1:允许跳转到其他节点
            2:允许其他节点跳转到本节点
    *@return java.lang.String
    */
   public java.lang.String getSkipauth(){
      return skipauth;
   }

   /**
    *1:允许跳转到其他节点
            2:允许其他节点跳转到本节点
    *@param skipauth
    */
   public void setSkipauth(java.lang.String skipauth){
      this.skipauth = skipauth;
   }

   /**
    *1:允许驳回到其他节点
            2:允许其他节点驳回到本节点
    *@return java.lang.String
    */
   public java.lang.String getRejectauth(){
      return rejectauth;
   }

   /**
    *1:允许驳回到其他节点
            2:允许其他节点驳回到本节点
    *@param rejectauth
    */
   public void setRejectauth(java.lang.String rejectauth){
      this.rejectauth = rejectauth;
   }

   /**
    *1:驳回到首节点
            2:驳回到上一节点
    *@return java.lang.String
    */
   public java.lang.String getRejectdefault(){
      return rejectdefault;
   }

   /**
    *1:驳回到首节点
            2:驳回到上一节点
    *@param rejectdefault
    */
   public void setRejectdefault(java.lang.String rejectdefault){
      this.rejectdefault = rejectdefault;
   }

   /**
    *1:直接返回本节点
            2:按照历史路径重新流转
    *@return java.lang.String
    */
   public java.lang.String getRejectdesflow(){
      return rejectdesflow;
   }

   /**
    *1:直接返回本节点
            2:按照历史路径重新流转
    *@param rejectdesflow
    */
   public void setRejectdesflow(java.lang.String rejectdesflow){
      this.rejectdesflow = rejectdesflow;
   }

   /**
    *1:SPRING BEAN
            2:普通JAVA类
    *@return java.lang.String
    */
   public java.lang.String getAdaptertype(){
      return adaptertype;
   }

   /**
    *1:SPRING BEAN
            2:普通JAVA类
    *@param adaptertype
    */
   public void setAdaptertype(java.lang.String adaptertype){
      this.adaptertype = adaptertype;
   }

   /**
    *当适配器类型为“0”时，名称为JAVA完整类名（包+名称）
            当适配器类型为“1”时，名称为SPRING配置的BEAN ID
    *@return java.lang.String
    */
   public java.lang.String getAdaptername(){
      return adaptername;
   }

   /**
    *当适配器类型为“0”时，名称为JAVA完整类名（包+名称）
            当适配器类型为“1”时，名称为SPRING配置的BEAN ID
    *@param adaptername
    */
   public void setAdaptername(java.lang.String adaptername){
      this.adaptername = adaptername;
   }

   /**
    *三位码表示，分别表示为：可读、可改、可删除
            允许为0，不允许为1
            
            
    *@return java.lang.String
    */
   public java.lang.String getOprateauth(){
      return oprateauth;
   }

   /**
    *三位码表示，分别表示为：可读、可改、可删除
            允许为0，不允许为1
            
            
    *@param oprateauth
    */
   public void setOprateauth(java.lang.String oprateauth){
      this.oprateauth = oprateauth;
   }

   /**
    *
    *@return java.lang.Integer
    */
   public java.lang.Integer getPriority(){
      return priority;
   }

   /**
    *
    *@param priority
    */
   public void setPriority(java.lang.Integer priority){
      this.priority = priority;
   }

}