package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:
 * 创建日期:2019-07-22 09:36:51
 */
@Table("iff_res_function")
public class IffResFunction{

   /**
      *数据类型：char(32) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String functionid;
   /**
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String functioncode;
   /**
      *数据类型：varchar(64) 
      *是否必填:false 
   **/
   private java.lang.String functionname;

  //get和set方法
   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getFunctionid(){
      return functionid;
   }

   /**
    *
    *@param functionid
    */
   public void setFunctionid(java.lang.String functionid){
      this.functionid = functionid;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getFunctioncode(){
      return functioncode;
   }

   /**
    *
    *@param functioncode
    */
   public void setFunctioncode(java.lang.String functioncode){
      this.functioncode = functioncode;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getFunctionname(){
      return functionname;
   }

   /**
    *
    *@param functionname
    */
   public void setFunctionname(java.lang.String functionname){
      this.functionname = functionname;
   }

}