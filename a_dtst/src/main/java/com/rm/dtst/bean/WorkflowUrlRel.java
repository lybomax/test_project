package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:流程节点资源路径映射关系表
 * 创建日期:2019-07-22 09:37:54
 */
@Table("workflow_url_rel")
public class WorkflowUrlRel{

   /**
      *主键 
      *数据类型：int(11) 
      *是否必填:true 
   **/
   @Id
   private java.lang.Integer id;
   /**
      *流程名 
      *数据类型：varchar(255) 
      *是否必填:true 
   **/
   private java.lang.String flowName;
   /**
      *节点名 
      *数据类型：varchar(255) 
      *是否必填:true 
   **/
   private java.lang.String serviceNode;
   /**
      *资源路径 
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String url;
   /**
      *业务品种 
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String bussType;

  //get和set方法
   /**
    *主键
    *@return java.lang.Integer
    */
   public java.lang.Integer getId(){
      return id;
   }

   /**
    *主键
    *@param id
    */
   public void setId(java.lang.Integer id){
      this.id = id;
   }

   /**
    *流程名
    *@return java.lang.String
    */
   public java.lang.String getFlowName(){
      return flowName;
   }

   /**
    *流程名
    *@param flowName
    */
   public void setFlowName(java.lang.String flowName){
      this.flowName = flowName;
   }

   /**
    *节点名
    *@return java.lang.String
    */
   public java.lang.String getServiceNode(){
      return serviceNode;
   }

   /**
    *节点名
    *@param serviceNode
    */
   public void setServiceNode(java.lang.String serviceNode){
      this.serviceNode = serviceNode;
   }

   /**
    *资源路径
    *@return java.lang.String
    */
   public java.lang.String getUrl(){
      return url;
   }

   /**
    *资源路径
    *@param url
    */
   public void setUrl(java.lang.String url){
      this.url = url;
   }

   /**
    *业务品种
    *@return java.lang.String
    */
   public java.lang.String getBussType(){
      return bussType;
   }

   /**
    *业务品种
    *@param bussType
    */
   public void setBussType(java.lang.String bussType){
      this.bussType = bussType;
   }

}