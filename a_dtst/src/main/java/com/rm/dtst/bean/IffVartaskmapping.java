package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:
 * 创建日期:2019-07-22 09:37:05
 */
@Table("iff_vartaskmapping")
public class IffVartaskmapping{

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
      *使用字母+数字的命名规则，与JAVA变量命名一致 
      *数据类型：varchar(64) 
      *是否必填:true 
   **/
   private java.lang.String variablename;
   /**
      *数据类型：varchar(64) 
      *是否必填:false 
   **/
   private java.lang.String userextcolume;

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
    *使用字母+数字的命名规则，与JAVA变量命名一致
    *@return java.lang.String
    */
   public java.lang.String getVariablename(){
      return variablename;
   }

   /**
    *使用字母+数字的命名规则，与JAVA变量命名一致
    *@param variablename
    */
   public void setVariablename(java.lang.String variablename){
      this.variablename = variablename;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getUserextcolume(){
      return userextcolume;
   }

   /**
    *
    *@param userextcolume
    */
   public void setUserextcolume(java.lang.String userextcolume){
      this.userextcolume = userextcolume;
   }

}