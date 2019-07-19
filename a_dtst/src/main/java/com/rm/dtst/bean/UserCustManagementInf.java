package com.ruimin.ifs.batch.bean.po;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:企业经营信息表
 * 创建日期:2019-07-19 17:33:11
 */
@Table("user_cust_management_inf")
public class UserCustManagementInf{

   /**
      *信息编号 
      *数据类型：varchar(32) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String id;
   /**
      *企业编号 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String custId;
   /**
      *经营类型:01-生产 02-销售 
      *数据类型：char(2) 
      *是否必填:false 
   **/
   private java.lang.String busiType;
   /**
      *生产详情 
      *数据类型：varchar(2000) 
      *是否必填:false 
   **/
   private java.lang.String produceDetail;
   /**
      *研发、专业详情 
      *数据类型：varchar(2000) 
      *是否必填:false 
   **/
   private java.lang.String majorDetail;
   /**
      *外部支持 
      *数据类型：varchar(2000) 
      *是否必填:false 
   **/
   private java.lang.String supportDetail;
   /**
      *目前市场介绍 
      *数据类型：varchar(2000) 
      *是否必填:false 
   **/
   private java.lang.String marcketIntroduce;
   /**
      *销售情况 
      *数据类型：varchar(2000) 
      *是否必填:false 
   **/
   private java.lang.String saleDetail;
   /**
      *录入时间 
      *数据类型：date 
      *是否必填:false 
   **/
   private java.util.Date tblTime;
   /**
      *状态 
      *数据类型：char(2) 
      *是否必填:false 
   **/
   private java.lang.String status;
   /**
      *机构号 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String branchId;
   /**
      *年份 
      *数据类型：char(4) 
      *是否必填:false 
   **/
   private java.lang.String mgyear;
   /**
      *建立时间 
      *数据类型：datetime(6) 
      *是否必填:true 
   **/
   private java.util.Date createTime;
   /**
      *最后更新时间 
      *数据类型：datetime(6) 
      *是否必填:true 
   **/
   private java.util.Date updateTime;
   /**
      *最后更新程序 
      *数据类型：varchar(200) 
      *是否必填:true 
   **/
   private java.lang.String updateProg;

  //get和set方法
   /**
    *信息编号
    *@return java.lang.String
    */
   public java.lang.String getId(){
      return id;
   }

   /**
    *信息编号
    *@param id
    */
   public void setId(java.lang.String id){
      this.id = id;
   }

   /**
    *企业编号
    *@return java.lang.String
    */
   public java.lang.String getCustId(){
      return custId;
   }

   /**
    *企业编号
    *@param custId
    */
   public void setCustId(java.lang.String custId){
      this.custId = custId;
   }

   /**
    *经营类型:01-生产 02-销售
    *@return java.lang.String
    */
   public java.lang.String getBusiType(){
      return busiType;
   }

   /**
    *经营类型:01-生产 02-销售
    *@param busiType
    */
   public void setBusiType(java.lang.String busiType){
      this.busiType = busiType;
   }

   /**
    *生产详情
    *@return java.lang.String
    */
   public java.lang.String getProduceDetail(){
      return produceDetail;
   }

   /**
    *生产详情
    *@param produceDetail
    */
   public void setProduceDetail(java.lang.String produceDetail){
      this.produceDetail = produceDetail;
   }

   /**
    *研发、专业详情
    *@return java.lang.String
    */
   public java.lang.String getMajorDetail(){
      return majorDetail;
   }

   /**
    *研发、专业详情
    *@param majorDetail
    */
   public void setMajorDetail(java.lang.String majorDetail){
      this.majorDetail = majorDetail;
   }

   /**
    *外部支持
    *@return java.lang.String
    */
   public java.lang.String getSupportDetail(){
      return supportDetail;
   }

   /**
    *外部支持
    *@param supportDetail
    */
   public void setSupportDetail(java.lang.String supportDetail){
      this.supportDetail = supportDetail;
   }

   /**
    *目前市场介绍
    *@return java.lang.String
    */
   public java.lang.String getMarcketIntroduce(){
      return marcketIntroduce;
   }

   /**
    *目前市场介绍
    *@param marcketIntroduce
    */
   public void setMarcketIntroduce(java.lang.String marcketIntroduce){
      this.marcketIntroduce = marcketIntroduce;
   }

   /**
    *销售情况
    *@return java.lang.String
    */
   public java.lang.String getSaleDetail(){
      return saleDetail;
   }

   /**
    *销售情况
    *@param saleDetail
    */
   public void setSaleDetail(java.lang.String saleDetail){
      this.saleDetail = saleDetail;
   }

   /**
    *录入时间
    *@return java.util.Date
    */
   public java.util.Date getTblTime(){
      return tblTime;
   }

   /**
    *录入时间
    *@param tblTime
    */
   public void setTblTime(java.util.Date tblTime){
      this.tblTime = tblTime;
   }

   /**
    *状态
    *@return java.lang.String
    */
   public java.lang.String getStatus(){
      return status;
   }

   /**
    *状态
    *@param status
    */
   public void setStatus(java.lang.String status){
      this.status = status;
   }

   /**
    *机构号
    *@return java.lang.String
    */
   public java.lang.String getBranchId(){
      return branchId;
   }

   /**
    *机构号
    *@param branchId
    */
   public void setBranchId(java.lang.String branchId){
      this.branchId = branchId;
   }

   /**
    *年份
    *@return java.lang.String
    */
   public java.lang.String getMgyear(){
      return mgyear;
   }

   /**
    *年份
    *@param mgyear
    */
   public void setMgyear(java.lang.String mgyear){
      this.mgyear = mgyear;
   }

   /**
    *建立时间
    *@return java.util.Date
    */
   public java.util.Date getCreateTime(){
      return createTime;
   }

   /**
    *建立时间
    *@param createTime
    */
   public void setCreateTime(java.util.Date createTime){
      this.createTime = createTime;
   }

   /**
    *最后更新时间
    *@return java.util.Date
    */
   public java.util.Date getUpdateTime(){
      return updateTime;
   }

   /**
    *最后更新时间
    *@param updateTime
    */
   public void setUpdateTime(java.util.Date updateTime){
      this.updateTime = updateTime;
   }

   /**
    *最后更新程序
    *@return java.lang.String
    */
   public java.lang.String getUpdateProg(){
      return updateProg;
   }

   /**
    *最后更新程序
    *@param updateProg
    */
   public void setUpdateProg(java.lang.String updateProg){
      this.updateProg = updateProg;
   }

}