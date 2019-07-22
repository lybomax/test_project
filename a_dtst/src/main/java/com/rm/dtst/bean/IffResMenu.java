package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:
 * 创建日期:2019-07-22 09:36:52
 */
@Table("iff_res_menu")
public class IffResMenu{

   /**
      *数据类型：char(32) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String menuid;
   /**
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String menucode;
   /**
      *数据类型：varchar(64) 
      *是否必填:false 
   **/
   private java.lang.String menuname;
   /**
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String parentcode;
   /**
      *数据类型：varchar(255) 
      *是否必填:false 
   **/
   private java.lang.String url;
   /**
      *数据类型：int(11) 
      *是否必填:false 
   **/
   private java.lang.Integer level;
   /**
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String visible;
   /**
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String enabled;
   /**
      *数据类型：varchar(128) 
      *是否必填:false 
   **/
   private java.lang.String tooltip;
   /**
      *数据类型：int(11) 
      *是否必填:false 
   **/
   private java.lang.Integer seqNo;

  //get和set方法
   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getMenuid(){
      return menuid;
   }

   /**
    *
    *@param menuid
    */
   public void setMenuid(java.lang.String menuid){
      this.menuid = menuid;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getMenucode(){
      return menucode;
   }

   /**
    *
    *@param menucode
    */
   public void setMenucode(java.lang.String menucode){
      this.menucode = menucode;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getMenuname(){
      return menuname;
   }

   /**
    *
    *@param menuname
    */
   public void setMenuname(java.lang.String menuname){
      this.menuname = menuname;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getParentcode(){
      return parentcode;
   }

   /**
    *
    *@param parentcode
    */
   public void setParentcode(java.lang.String parentcode){
      this.parentcode = parentcode;
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
    *
    *@return java.lang.Integer
    */
   public java.lang.Integer getLevel(){
      return level;
   }

   /**
    *
    *@param level
    */
   public void setLevel(java.lang.Integer level){
      this.level = level;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getVisible(){
      return visible;
   }

   /**
    *
    *@param visible
    */
   public void setVisible(java.lang.String visible){
      this.visible = visible;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getEnabled(){
      return enabled;
   }

   /**
    *
    *@param enabled
    */
   public void setEnabled(java.lang.String enabled){
      this.enabled = enabled;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getTooltip(){
      return tooltip;
   }

   /**
    *
    *@param tooltip
    */
   public void setTooltip(java.lang.String tooltip){
      this.tooltip = tooltip;
   }

   /**
    *
    *@return java.lang.Integer
    */
   public java.lang.Integer getSeqNo(){
      return seqNo;
   }

   /**
    *
    *@param seqNo
    */
   public void setSeqNo(java.lang.Integer seqNo){
      this.seqNo = seqNo;
   }

}