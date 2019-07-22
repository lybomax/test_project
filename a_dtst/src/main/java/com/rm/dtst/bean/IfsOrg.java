package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:[框架自带]机构信息表
 * 创建日期:2019-07-22 09:37:15
 */
@Table("ifs_org")
public class IfsOrg{

   /**
      *内部机构号 
      *数据类型：varchar(20) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String brcode;
   /**
      *外部机构号 
      *数据类型：varchar(20) 
      *是否必填:true 
   **/
   private java.lang.String brno;
   /**
      *机构名称 
      *数据类型：varchar(60) 
      *是否必填:false 
   **/
   private java.lang.String brname;
   /**
      *机构级别(DDIC:105) 
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String brclass;
   /**
      *机构属性(暂未使用) 
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String brattr;
   /**
      *分支机构级别(暂未使用) 
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String blnBranchClass;
   /**
      *分支机构号(暂未使用) 
      *数据类型：varchar(20) 
      *是否必填:false 
   **/
   private java.lang.String blnBranchBrcode;
   /**
      *管理机构号 
      *数据类型：varchar(20) 
      *是否必填:false 
   **/
   private java.lang.String blnManageBrcode;
   /**
      *上级机构号 
      *数据类型：varchar(20) 
      *是否必填:false 
   **/
   private java.lang.String blnUpBrcode;
   /**
      *交易机构号(暂未使用) 
      *数据类型：varchar(20) 
      *是否必填:false 
   **/
   private java.lang.String txnBrcode;
   /**
      *授权级别(暂未使用) 
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String authlvl;
   /**
      *联系人(暂未使用) 
      *数据类型：varchar(20) 
      *是否必填:false 
   **/
   private java.lang.String linkman;
   /**
      *联系电话(暂未使用) 
      *数据类型：char(20) 
      *是否必填:false 
   **/
   private java.lang.String teleno;
   /**
      *机构地址 
      *数据类型：varchar(60) 
      *是否必填:false 
   **/
   private java.lang.String address;
   /**
      *邮编 
      *数据类型：char(6) 
      *是否必填:false 
   **/
   private java.lang.String postno;
   /**
      *异地行标识(暂未使用) 
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String otherAreaFlag;
   /**
      *行政区划代码(暂未使用) 
      *数据类型：char(6) 
      *是否必填:false 
   **/
   private java.lang.String regionalism;
   /**
      *金融机构代码(暂未使用) 
      *数据类型：char(14) 
      *是否必填:false 
   **/
   private java.lang.String financeCode;
   /**
      *有效标识(1有效0无效) 
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
      *数据类型：varchar(256) 
      *是否必填:false 
   **/
   private java.lang.String misc;
   /**
      *最后更新操作员 
      *数据类型：varchar(20) 
      *是否必填:false 
   **/
   private java.lang.String lastUpdTlr;
   /**
      *最后修改交易码 
      *数据类型：varchar(20) 
      *是否必填:false 
   **/
   private java.lang.String lastUpdFunc;
   /**
      *最后更新日期 
      *数据类型：char(8) 
      *是否必填:false 
   **/
   private java.lang.String lastUpdDate;
   /**
      *记录状态(暂未使用) 
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String st;
   /**
      *是否锁定(暂未使用) 
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String isLock;
   /**
      *是否删除(暂未使用) 
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String isDel;
   /**
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String legalPersonBrcode;

  //get和set方法
   /**
    *内部机构号
    *@return java.lang.String
    */
   public java.lang.String getBrcode(){
      return brcode;
   }

   /**
    *内部机构号
    *@param brcode
    */
   public void setBrcode(java.lang.String brcode){
      this.brcode = brcode;
   }

   /**
    *外部机构号
    *@return java.lang.String
    */
   public java.lang.String getBrno(){
      return brno;
   }

   /**
    *外部机构号
    *@param brno
    */
   public void setBrno(java.lang.String brno){
      this.brno = brno;
   }

   /**
    *机构名称
    *@return java.lang.String
    */
   public java.lang.String getBrname(){
      return brname;
   }

   /**
    *机构名称
    *@param brname
    */
   public void setBrname(java.lang.String brname){
      this.brname = brname;
   }

   /**
    *机构级别(DDIC:105)
    *@return java.lang.String
    */
   public java.lang.String getBrclass(){
      return brclass;
   }

   /**
    *机构级别(DDIC:105)
    *@param brclass
    */
   public void setBrclass(java.lang.String brclass){
      this.brclass = brclass;
   }

   /**
    *机构属性(暂未使用)
    *@return java.lang.String
    */
   public java.lang.String getBrattr(){
      return brattr;
   }

   /**
    *机构属性(暂未使用)
    *@param brattr
    */
   public void setBrattr(java.lang.String brattr){
      this.brattr = brattr;
   }

   /**
    *分支机构级别(暂未使用)
    *@return java.lang.String
    */
   public java.lang.String getBlnBranchClass(){
      return blnBranchClass;
   }

   /**
    *分支机构级别(暂未使用)
    *@param blnBranchClass
    */
   public void setBlnBranchClass(java.lang.String blnBranchClass){
      this.blnBranchClass = blnBranchClass;
   }

   /**
    *分支机构号(暂未使用)
    *@return java.lang.String
    */
   public java.lang.String getBlnBranchBrcode(){
      return blnBranchBrcode;
   }

   /**
    *分支机构号(暂未使用)
    *@param blnBranchBrcode
    */
   public void setBlnBranchBrcode(java.lang.String blnBranchBrcode){
      this.blnBranchBrcode = blnBranchBrcode;
   }

   /**
    *管理机构号
    *@return java.lang.String
    */
   public java.lang.String getBlnManageBrcode(){
      return blnManageBrcode;
   }

   /**
    *管理机构号
    *@param blnManageBrcode
    */
   public void setBlnManageBrcode(java.lang.String blnManageBrcode){
      this.blnManageBrcode = blnManageBrcode;
   }

   /**
    *上级机构号
    *@return java.lang.String
    */
   public java.lang.String getBlnUpBrcode(){
      return blnUpBrcode;
   }

   /**
    *上级机构号
    *@param blnUpBrcode
    */
   public void setBlnUpBrcode(java.lang.String blnUpBrcode){
      this.blnUpBrcode = blnUpBrcode;
   }

   /**
    *交易机构号(暂未使用)
    *@return java.lang.String
    */
   public java.lang.String getTxnBrcode(){
      return txnBrcode;
   }

   /**
    *交易机构号(暂未使用)
    *@param txnBrcode
    */
   public void setTxnBrcode(java.lang.String txnBrcode){
      this.txnBrcode = txnBrcode;
   }

   /**
    *授权级别(暂未使用)
    *@return java.lang.String
    */
   public java.lang.String getAuthlvl(){
      return authlvl;
   }

   /**
    *授权级别(暂未使用)
    *@param authlvl
    */
   public void setAuthlvl(java.lang.String authlvl){
      this.authlvl = authlvl;
   }

   /**
    *联系人(暂未使用)
    *@return java.lang.String
    */
   public java.lang.String getLinkman(){
      return linkman;
   }

   /**
    *联系人(暂未使用)
    *@param linkman
    */
   public void setLinkman(java.lang.String linkman){
      this.linkman = linkman;
   }

   /**
    *联系电话(暂未使用)
    *@return java.lang.String
    */
   public java.lang.String getTeleno(){
      return teleno;
   }

   /**
    *联系电话(暂未使用)
    *@param teleno
    */
   public void setTeleno(java.lang.String teleno){
      this.teleno = teleno;
   }

   /**
    *机构地址
    *@return java.lang.String
    */
   public java.lang.String getAddress(){
      return address;
   }

   /**
    *机构地址
    *@param address
    */
   public void setAddress(java.lang.String address){
      this.address = address;
   }

   /**
    *邮编
    *@return java.lang.String
    */
   public java.lang.String getPostno(){
      return postno;
   }

   /**
    *邮编
    *@param postno
    */
   public void setPostno(java.lang.String postno){
      this.postno = postno;
   }

   /**
    *异地行标识(暂未使用)
    *@return java.lang.String
    */
   public java.lang.String getOtherAreaFlag(){
      return otherAreaFlag;
   }

   /**
    *异地行标识(暂未使用)
    *@param otherAreaFlag
    */
   public void setOtherAreaFlag(java.lang.String otherAreaFlag){
      this.otherAreaFlag = otherAreaFlag;
   }

   /**
    *行政区划代码(暂未使用)
    *@return java.lang.String
    */
   public java.lang.String getRegionalism(){
      return regionalism;
   }

   /**
    *行政区划代码(暂未使用)
    *@param regionalism
    */
   public void setRegionalism(java.lang.String regionalism){
      this.regionalism = regionalism;
   }

   /**
    *金融机构代码(暂未使用)
    *@return java.lang.String
    */
   public java.lang.String getFinanceCode(){
      return financeCode;
   }

   /**
    *金融机构代码(暂未使用)
    *@param financeCode
    */
   public void setFinanceCode(java.lang.String financeCode){
      this.financeCode = financeCode;
   }

   /**
    *有效标识(1有效0无效)
    *@return java.lang.String
    */
   public java.lang.String getStatus(){
      return status;
   }

   /**
    *有效标识(1有效0无效)
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
    *最后更新操作员
    *@return java.lang.String
    */
   public java.lang.String getLastUpdTlr(){
      return lastUpdTlr;
   }

   /**
    *最后更新操作员
    *@param lastUpdTlr
    */
   public void setLastUpdTlr(java.lang.String lastUpdTlr){
      this.lastUpdTlr = lastUpdTlr;
   }

   /**
    *最后修改交易码
    *@return java.lang.String
    */
   public java.lang.String getLastUpdFunc(){
      return lastUpdFunc;
   }

   /**
    *最后修改交易码
    *@param lastUpdFunc
    */
   public void setLastUpdFunc(java.lang.String lastUpdFunc){
      this.lastUpdFunc = lastUpdFunc;
   }

   /**
    *最后更新日期
    *@return java.lang.String
    */
   public java.lang.String getLastUpdDate(){
      return lastUpdDate;
   }

   /**
    *最后更新日期
    *@param lastUpdDate
    */
   public void setLastUpdDate(java.lang.String lastUpdDate){
      this.lastUpdDate = lastUpdDate;
   }

   /**
    *记录状态(暂未使用)
    *@return java.lang.String
    */
   public java.lang.String getSt(){
      return st;
   }

   /**
    *记录状态(暂未使用)
    *@param st
    */
   public void setSt(java.lang.String st){
      this.st = st;
   }

   /**
    *是否锁定(暂未使用)
    *@return java.lang.String
    */
   public java.lang.String getIsLock(){
      return isLock;
   }

   /**
    *是否锁定(暂未使用)
    *@param isLock
    */
   public void setIsLock(java.lang.String isLock){
      this.isLock = isLock;
   }

   /**
    *是否删除(暂未使用)
    *@return java.lang.String
    */
   public java.lang.String getIsDel(){
      return isDel;
   }

   /**
    *是否删除(暂未使用)
    *@param isDel
    */
   public void setIsDel(java.lang.String isDel){
      this.isDel = isDel;
   }

   /**
    *
    *@return java.lang.String
    */
   public java.lang.String getLegalPersonBrcode(){
      return legalPersonBrcode;
   }

   /**
    *
    *@param legalPersonBrcode
    */
   public void setLegalPersonBrcode(java.lang.String legalPersonBrcode){
      this.legalPersonBrcode = legalPersonBrcode;
   }

}