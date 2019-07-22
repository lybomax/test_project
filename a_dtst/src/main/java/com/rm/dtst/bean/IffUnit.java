package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:
 * 创建日期:2019-07-22 09:37:02
 */
@Table("iff_unit")
public class IffUnit{

   /**
      *数据类型：varchar(32) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String unitid;
   /**
      *数据类型：varchar(64) 
      *是否必填:false 
   **/
   private java.lang.String unitname;
   /**
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String brno;
   /**
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String unitlevel;
   /**
      *数据类型：varchar(10) 
      *是否必填:false 
   **/
   private java.lang.String unitkind;
   /**
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String parentunitid;

  //get和set方法
   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getUnitid(){
      return unitid;
   }

   /**
    *
    *@param unitid
    */
   public void setUnitid(java.lang.String unitid){
      this.unitid = unitid;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getUnitname(){
      return unitname;
   }

   /**
    *
    *@param unitname
    */
   public void setUnitname(java.lang.String unitname){
      this.unitname = unitname;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getBrno(){
      return brno;
   }

   /**
    *
    *@param brno
    */
   public void setBrno(java.lang.String brno){
      this.brno = brno;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getUnitlevel(){
      return unitlevel;
   }

   /**
    *
    *@param unitlevel
    */
   public void setUnitlevel(java.lang.String unitlevel){
      this.unitlevel = unitlevel;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getUnitkind(){
      return unitkind;
   }

   /**
    *
    *@param unitkind
    */
   public void setUnitkind(java.lang.String unitkind){
      this.unitkind = unitkind;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getParentunitid(){
      return parentunitid;
   }

   /**
    *
    *@param parentunitid
    */
   public void setParentunitid(java.lang.String parentunitid){
      this.parentunitid = parentunitid;
   }

}