package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:
 * 创建日期:2019-07-22 09:36:46
 */
@Table("iff_nodeevent")
public class IffNodeevent{

   /**
      *数据类型：char(32) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String poid;
   /**
      *数据类型：char(32) 
      *是否必填:true 
   **/
   private java.lang.String nodehandle;
   /**
      *1：节点模板
            2：节点 
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String nodekind;
   /**
      *1：节点执行开始时
            2：节点执行结束时 
      *数据类型：int(2) 
      *是否必填:true 
   **/
   private java.lang.Integer type;
   /**
      *1:SPRING BEAN
            2:普通JAVA类 
      *数据类型：char(1) 
      *是否必填:true 
   **/
   private java.lang.String adaptertype;
   /**
      *当适配器类型为“0”时，名称为JAVA完整类名（包+名称）
            当适配器类型为“1”时，名称为SPRING配置的BEAN ID 
      *数据类型：varchar(255) 
      *是否必填:true 
   **/
   private java.lang.String adaptername;

  //get和set方法
   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getPoid(){
      return poid;
   }

   /**
    *
    *@param poid
    */
   public void setPoid(java.lang.String poid){
      this.poid = poid;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getNodehandle(){
      return nodehandle;
   }

   /**
    *
    *@param nodehandle
    */
   public void setNodehandle(java.lang.String nodehandle){
      this.nodehandle = nodehandle;
   }

   /**
    *1：节点模板
            2：节点
    *@return java.lang.String
    */
   public java.lang.String getNodekind(){
      return nodekind;
   }

   /**
    *1：节点模板
            2：节点
    *@param nodekind
    */
   public void setNodekind(java.lang.String nodekind){
      this.nodekind = nodekind;
   }

   /**
    *1：节点执行开始时
            2：节点执行结束时
    *@return java.lang.Integer
    */
   public java.lang.Integer getType(){
      return type;
   }

   /**
    *1：节点执行开始时
            2：节点执行结束时
    *@param type
    */
   public void setType(java.lang.Integer type){
      this.type = type;
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

}