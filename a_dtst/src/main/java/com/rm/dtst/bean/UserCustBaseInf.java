package com.rm.dtst.bean;

import com.ruimin.ifs.rql.annotation.Id;
import com.ruimin.ifs.rql.annotation.Table;
/**
 * @deprecated:企业基本信息表
 * 创建日期:2019-07-19 17:33:07
 */
@Table("user_cust_base_inf")
public class UserCustBaseInf{

   /**
      *企业编号 
      *数据类型：varchar(32) 
      *是否必填:true 
   **/
   @Id
   private java.lang.String custId;
   /**
      *企业名称 
      *数据类型：varchar(100) 
      *是否必填:false 
   **/
   private java.lang.String custName;
   /**
      *证件类型:01-营业执照、02-组织结构代码证、03-税务登记证、04统一社会信用代码、09其他 
      *数据类型：varchar(2) 
      *是否必填:false 
   **/
   private java.lang.String idType;
   /**
      *证件号码 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String idNum;
   /**
      *企业性质:01-国有企业、02-集体企业、03-联营企业、04-股份合作制企业、05-私营企业、06-个人独资企业、07-外商投资企业、08-合伙企业、09-有限责任公司、10-股份有限公司、11-其他 
      *数据类型：char(2) 
      *是否必填:false 
   **/
   private java.lang.String custProperty;
   /**
      *企业规模:L-大型、M-中型、S-小微 
      *数据类型：char(2) 
      *是否必填:false 
   **/
   private java.lang.String custScope;
   /**
      *行业代码 
      *数据类型：varchar(10) 
      *是否必填:false 
   **/
   private java.lang.String industryCode;
   /**
      *区域代码 
      *数据类型：varchar(6) 
      *是否必填:false 
   **/
   private java.lang.String areaId;
   /**
      *企业类型多选:CO-核心企业、CH-链属企业、GU-担保方、FU-资金方、CR-债权管理人 
      *数据类型：varchar(100) 
      *是否必填:false 
   **/
   private java.lang.String custType;
   /**
      *统一社会信用代码 
      *数据类型：varchar(30) 
      *是否必填:false 
   **/
   private java.lang.String creditNum;
   /**
      *营业执照 
      *数据类型：varchar(30) 
      *是否必填:false 
   **/
   private java.lang.String busiLicenseNum;
   /**
      *组织结构代码 
      *数据类型：varchar(30) 
      *是否必填:false 
   **/
   private java.lang.String orgCode;
   /**
      *税务登记证 
      *数据类型：varchar(30) 
      *是否必填:false 
   **/
   private java.lang.String taxCode;
   /**
      *是否集团客户:0-否 1-是 
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String groupFlag;
   /**
      *公司类型:01-集团 02-成员 
      *数据类型：char(2) 
      *是否必填:false 
   **/
   private java.lang.String corpType;
   /**
      *状态 
      *数据类型：char(2) 
      *是否必填:false 
   **/
   private java.lang.String status;
   /**
      *客户经理 
      *数据类型：varchar(20) 
      *是否必填:false 
   **/
   private java.lang.String mgrNo;
   /**
      *机构号 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String branchId;
   /**
      *评级结果: AAA-AAA AA-AA A-A BBB-BBB BB-BB B-B CCC-CCC CC-CC C-C 
      *数据类型：varchar(10) 
      *是否必填:false 
   **/
   private java.lang.String rating;
   /**
      *尽调状态:00-未尽调，01-已尽调 
      *数据类型：char(2) 
      *是否必填:false 
   **/
   private java.lang.String examineStatus;
   /**
      *授信状态：00-未授信，01-已授信 
      *数据类型：char(2) 
      *是否必填:false 
   **/
   private java.lang.String creditStatus;
   /**
      *企业法人姓名 
      *数据类型：varchar(100) 
      *是否必填:false 
   **/
   private java.lang.String legalName;
   /**
      *法人证件类型:0-身份证、1-户口簿、2-护照 、5-港澳居民来往内地通行证、6-台湾同胞来往内地通行证、X-其他证件 
      *数据类型：varchar(2) 
      *是否必填:false 
   **/
   private java.lang.String legalIdType;
   /**
      *法人证件号码 
      *数据类型：varchar(32) 
      *是否必填:false 
   **/
   private java.lang.String legalIdNum;
   /**
      *注册资本 
      *数据类型：decimal(18,2) 
      *是否必填:false 
   **/
   private java.math.BigDecimal regAmt;
   /**
      *营业开始时间 
      *数据类型：date 
      *是否必填:false 
   **/
   private java.util.Date busStartDt;
   /**
      *营业结束时间 
      *数据类型：date 
      *是否必填:false 
   **/
   private java.util.Date busEndDt;
   /**
      *经营范围 
      *数据类型：varchar(500) 
      *是否必填:false 
   **/
   private java.lang.String busiScope;
   /**
      *注册地址 
      *数据类型：varchar(500) 
      *是否必填:false 
   **/
   private java.lang.String regAddress;
   /**
      *联系人姓名 
      *数据类型：varchar(100) 
      *是否必填:false 
   **/
   private java.lang.String contactsName;
   /**
      *联系地址 
      *数据类型：varchar(500) 
      *是否必填:false 
   **/
   private java.lang.String contactAddress;
   /**
      *岗位 
      *数据类型：varchar(100) 
      *是否必填:false 
   **/
   private java.lang.String post;
   /**
      *手机号码 
      *数据类型：varchar(12) 
      *是否必填:false 
   **/
   private java.lang.String mobilet;
   /**
      *邮箱地址 
      *数据类型：varchar(100) 
      *是否必填:false 
   **/
   private java.lang.String mail;
   /**
      *企业签署账户标识 
      *数据类型：varchar(100) 
      *是否必填:false 
   **/
   private java.lang.String acctid;
   /**
      *实缴资本 
      *数据类型：decimal(18,2) 
      *是否必填:false 
   **/
   private java.math.BigDecimal actualCapital;
   /**
      *成立日期 
      *数据类型：date 
      *是否必填:false 
   **/
   private java.util.Date establish;
   /**
      *经营状态:01-营业、02-停业、03-关闭、04-筹建、05-其他 
      *数据类型：char(2) 
      *是否必填:false 
   **/
   private java.lang.String operatingState;
   /**
      *签章方式：01-线下，02-线上 
      *数据类型：char(2) 
      *是否必填:false 
   **/
   private java.lang.String signMode;
   /**
      *意向融资类型： 01-应收账款转让 02-应收账款质押 03-信贷类融资 
      *数据类型：char(2) 
      *是否必填:false 
   **/
   private java.lang.String intentFinType;
   /**
      *是否需要债权管理人 
      *数据类型：char(1) 
      *是否必填:false 
   **/
   private java.lang.String isNeedManager;
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
    *企业名称
    *@return java.lang.String
    */
   public java.lang.String getCustName(){
      return custName;
   }

   /**
    *企业名称
    *@param custName
    */
   public void setCustName(java.lang.String custName){
      this.custName = custName;
   }

   /**
    *证件类型:01-营业执照、02-组织结构代码证、03-税务登记证、04统一社会信用代码、09其他
    *@return java.lang.String
    */
   public java.lang.String getIdType(){
      return idType;
   }

   /**
    *证件类型:01-营业执照、02-组织结构代码证、03-税务登记证、04统一社会信用代码、09其他
    *@param idType
    */
   public void setIdType(java.lang.String idType){
      this.idType = idType;
   }

   /**
    *证件号码
    *@return java.lang.String
    */
   public java.lang.String getIdNum(){
      return idNum;
   }

   /**
    *证件号码
    *@param idNum
    */
   public void setIdNum(java.lang.String idNum){
      this.idNum = idNum;
   }

   /**
    *企业性质:01-国有企业、02-集体企业、03-联营企业、04-股份合作制企业、05-私营企业、06-个人独资企业、07-外商投资企业、08-合伙企业、09-有限责任公司、10-股份有限公司、11-其他
    *@return java.lang.String
    */
   public java.lang.String getCustProperty(){
      return custProperty;
   }

   /**
    *企业性质:01-国有企业、02-集体企业、03-联营企业、04-股份合作制企业、05-私营企业、06-个人独资企业、07-外商投资企业、08-合伙企业、09-有限责任公司、10-股份有限公司、11-其他
    *@param custProperty
    */
   public void setCustProperty(java.lang.String custProperty){
      this.custProperty = custProperty;
   }

   /**
    *企业规模:L-大型、M-中型、S-小微
    *@return java.lang.String
    */
   public java.lang.String getCustScope(){
      return custScope;
   }

   /**
    *企业规模:L-大型、M-中型、S-小微
    *@param custScope
    */
   public void setCustScope(java.lang.String custScope){
      this.custScope = custScope;
   }

   /**
    *行业代码
    *@return java.lang.String
    */
   public java.lang.String getIndustryCode(){
      return industryCode;
   }

   /**
    *行业代码
    *@param industryCode
    */
   public void setIndustryCode(java.lang.String industryCode){
      this.industryCode = industryCode;
   }

   /**
    *区域代码
    *@return java.lang.String
    */
   public java.lang.String getAreaId(){
      return areaId;
   }

   /**
    *区域代码
    *@param areaId
    */
   public void setAreaId(java.lang.String areaId){
      this.areaId = areaId;
   }

   /**
    *企业类型多选:CO-核心企业、CH-链属企业、GU-担保方、FU-资金方、CR-债权管理人
    *@return java.lang.String
    */
   public java.lang.String getCustType(){
      return custType;
   }

   /**
    *企业类型多选:CO-核心企业、CH-链属企业、GU-担保方、FU-资金方、CR-债权管理人
    *@param custType
    */
   public void setCustType(java.lang.String custType){
      this.custType = custType;
   }

   /**
    *统一社会信用代码
    *@return java.lang.String
    */
   public java.lang.String getCreditNum(){
      return creditNum;
   }

   /**
    *统一社会信用代码
    *@param creditNum
    */
   public void setCreditNum(java.lang.String creditNum){
      this.creditNum = creditNum;
   }

   /**
    *营业执照
    *@return java.lang.String
    */
   public java.lang.String getBusiLicenseNum(){
      return busiLicenseNum;
   }

   /**
    *营业执照
    *@param busiLicenseNum
    */
   public void setBusiLicenseNum(java.lang.String busiLicenseNum){
      this.busiLicenseNum = busiLicenseNum;
   }

   /**
    *组织结构代码
    *@return java.lang.String
    */
   public java.lang.String getOrgCode(){
      return orgCode;
   }

   /**
    *组织结构代码
    *@param orgCode
    */
   public void setOrgCode(java.lang.String orgCode){
      this.orgCode = orgCode;
   }

   /**
    *税务登记证
    *@return java.lang.String
    */
   public java.lang.String getTaxCode(){
      return taxCode;
   }

   /**
    *税务登记证
    *@param taxCode
    */
   public void setTaxCode(java.lang.String taxCode){
      this.taxCode = taxCode;
   }

   /**
    *是否集团客户:0-否 1-是
    *@return java.lang.String
    */
   public java.lang.String getGroupFlag(){
      return groupFlag;
   }

   /**
    *是否集团客户:0-否 1-是
    *@param groupFlag
    */
   public void setGroupFlag(java.lang.String groupFlag){
      this.groupFlag = groupFlag;
   }

   /**
    *公司类型:01-集团 02-成员
    *@return java.lang.String
    */
   public java.lang.String getCorpType(){
      return corpType;
   }

   /**
    *公司类型:01-集团 02-成员
    *@param corpType
    */
   public void setCorpType(java.lang.String corpType){
      this.corpType = corpType;
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
    *客户经理
    *@return java.lang.String
    */
   public java.lang.String getMgrNo(){
      return mgrNo;
   }

   /**
    *客户经理
    *@param mgrNo
    */
   public void setMgrNo(java.lang.String mgrNo){
      this.mgrNo = mgrNo;
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
    *评级结果: AAA-AAA AA-AA A-A BBB-BBB BB-BB B-B CCC-CCC CC-CC C-C
    *@return java.lang.String
    */
   public java.lang.String getRating(){
      return rating;
   }

   /**
    *评级结果: AAA-AAA AA-AA A-A BBB-BBB BB-BB B-B CCC-CCC CC-CC C-C
    *@param rating
    */
   public void setRating(java.lang.String rating){
      this.rating = rating;
   }

   /**
    *尽调状态:00-未尽调，01-已尽调
    *@return java.lang.String
    */
   public java.lang.String getExamineStatus(){
      return examineStatus;
   }

   /**
    *尽调状态:00-未尽调，01-已尽调
    *@param examineStatus
    */
   public void setExamineStatus(java.lang.String examineStatus){
      this.examineStatus = examineStatus;
   }

   /**
    *授信状态：00-未授信，01-已授信
    *@return java.lang.String
    */
   public java.lang.String getCreditStatus(){
      return creditStatus;
   }

   /**
    *授信状态：00-未授信，01-已授信
    *@param creditStatus
    */
   public void setCreditStatus(java.lang.String creditStatus){
      this.creditStatus = creditStatus;
   }

   /**
    *企业法人姓名
    *@return java.lang.String
    */
   public java.lang.String getLegalName(){
      return legalName;
   }

   /**
    *企业法人姓名
    *@param legalName
    */
   public void setLegalName(java.lang.String legalName){
      this.legalName = legalName;
   }

   /**
    *法人证件类型:0-身份证、1-户口簿、2-护照 、5-港澳居民来往内地通行证、6-台湾同胞来往内地通行证、X-其他证件
    *@return java.lang.String
    */
   public java.lang.String getLegalIdType(){
      return legalIdType;
   }

   /**
    *法人证件类型:0-身份证、1-户口簿、2-护照 、5-港澳居民来往内地通行证、6-台湾同胞来往内地通行证、X-其他证件
    *@param legalIdType
    */
   public void setLegalIdType(java.lang.String legalIdType){
      this.legalIdType = legalIdType;
   }

   /**
    *法人证件号码
    *@return java.lang.String
    */
   public java.lang.String getLegalIdNum(){
      return legalIdNum;
   }

   /**
    *法人证件号码
    *@param legalIdNum
    */
   public void setLegalIdNum(java.lang.String legalIdNum){
      this.legalIdNum = legalIdNum;
   }

   /**
    *注册资本
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getRegAmt(){
      return regAmt;
   }

   /**
    *注册资本
    *@param regAmt
    */
   public void setRegAmt(java.math.BigDecimal regAmt){
      this.regAmt = regAmt;
   }

   /**
    *营业开始时间
    *@return java.util.Date
    */
   public java.util.Date getBusStartDt(){
      return busStartDt;
   }

   /**
    *营业开始时间
    *@param busStartDt
    */
   public void setBusStartDt(java.util.Date busStartDt){
      this.busStartDt = busStartDt;
   }

   /**
    *营业结束时间
    *@return java.util.Date
    */
   public java.util.Date getBusEndDt(){
      return busEndDt;
   }

   /**
    *营业结束时间
    *@param busEndDt
    */
   public void setBusEndDt(java.util.Date busEndDt){
      this.busEndDt = busEndDt;
   }

   /**
    *经营范围
    *@return java.lang.String
    */
   public java.lang.String getBusiScope(){
      return busiScope;
   }

   /**
    *经营范围
    *@param busiScope
    */
   public void setBusiScope(java.lang.String busiScope){
      this.busiScope = busiScope;
   }

   /**
    *注册地址
    *@return java.lang.String
    */
   public java.lang.String getRegAddress(){
      return regAddress;
   }

   /**
    *注册地址
    *@param regAddress
    */
   public void setRegAddress(java.lang.String regAddress){
      this.regAddress = regAddress;
   }

   /**
    *联系人姓名
    *@return java.lang.String
    */
   public java.lang.String getContactsName(){
      return contactsName;
   }

   /**
    *联系人姓名
    *@param contactsName
    */
   public void setContactsName(java.lang.String contactsName){
      this.contactsName = contactsName;
   }

   /**
    *联系地址
    *@return java.lang.String
    */
   public java.lang.String getContactAddress(){
      return contactAddress;
   }

   /**
    *联系地址
    *@param contactAddress
    */
   public void setContactAddress(java.lang.String contactAddress){
      this.contactAddress = contactAddress;
   }

   /**
    *岗位
    *@return java.lang.String
    */
   public java.lang.String getPost(){
      return post;
   }

   /**
    *岗位
    *@param post
    */
   public void setPost(java.lang.String post){
      this.post = post;
   }

   /**
    *手机号码
    *@return java.lang.String
    */
   public java.lang.String getMobilet(){
      return mobilet;
   }

   /**
    *手机号码
    *@param mobilet
    */
   public void setMobilet(java.lang.String mobilet){
      this.mobilet = mobilet;
   }

   /**
    *邮箱地址
    *@return java.lang.String
    */
   public java.lang.String getMail(){
      return mail;
   }

   /**
    *邮箱地址
    *@param mail
    */
   public void setMail(java.lang.String mail){
      this.mail = mail;
   }

   /**
    *企业签署账户标识
    *@return java.lang.String
    */
   public java.lang.String getAcctid(){
      return acctid;
   }

   /**
    *企业签署账户标识
    *@param acctid
    */
   public void setAcctid(java.lang.String acctid){
      this.acctid = acctid;
   }

   /**
    *实缴资本
    *@return java.math.BigDecimal
    */
   public java.math.BigDecimal getActualCapital(){
      return actualCapital;
   }

   /**
    *实缴资本
    *@param actualCapital
    */
   public void setActualCapital(java.math.BigDecimal actualCapital){
      this.actualCapital = actualCapital;
   }

   /**
    *成立日期
    *@return java.util.Date
    */
   public java.util.Date getEstablish(){
      return establish;
   }

   /**
    *成立日期
    *@param establish
    */
   public void setEstablish(java.util.Date establish){
      this.establish = establish;
   }

   /**
    *经营状态:01-营业、02-停业、03-关闭、04-筹建、05-其他
    *@return java.lang.String
    */
   public java.lang.String getOperatingState(){
      return operatingState;
   }

   /**
    *经营状态:01-营业、02-停业、03-关闭、04-筹建、05-其他
    *@param operatingState
    */
   public void setOperatingState(java.lang.String operatingState){
      this.operatingState = operatingState;
   }

   /**
    *签章方式：01-线下，02-线上
    *@return java.lang.String
    */
   public java.lang.String getSignMode(){
      return signMode;
   }

   /**
    *签章方式：01-线下，02-线上
    *@param signMode
    */
   public void setSignMode(java.lang.String signMode){
      this.signMode = signMode;
   }

   /**
    *意向融资类型： 01-应收账款转让 02-应收账款质押 03-信贷类融资
    *@return java.lang.String
    */
   public java.lang.String getIntentFinType(){
      return intentFinType;
   }

   /**
    *意向融资类型： 01-应收账款转让 02-应收账款质押 03-信贷类融资
    *@param intentFinType
    */
   public void setIntentFinType(java.lang.String intentFinType){
      this.intentFinType = intentFinType;
   }

   /**
    *是否需要债权管理人
    *@return java.lang.String
    */
   public java.lang.String getIsNeedManager(){
      return isNeedManager;
   }

   /**
    *是否需要债权管理人
    *@param isNeedManager
    */
   public void setIsNeedManager(java.lang.String isNeedManager){
      this.isNeedManager = isNeedManager;
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