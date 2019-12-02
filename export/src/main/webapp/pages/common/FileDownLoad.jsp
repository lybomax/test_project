<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<iframe src="" style="display: none;" id="filedownfrm"></iframe>
<script type="text/javascript">
	var FILE = {
		download:function(bussId,type,params) {
			var url = '<snow:url flowId="cn.cbcc.elcs.common.comp.FileProcessAction:downLoadFile" isDownLoad="true"></snow:url>';
			if(top.checkResult){
				//此处补充用户信息
				url+="&userId="+top.checkResult.userId+"&token="+top.checkResult.token;
			}
			//id为业务编号，tp为业务类型，其他参数为附件，均可以在core服务中获取
			var furl = url + "&id="+bussId+"&tp="+type;
			if(params && params.length>0){
				furl += params;
			}
			document.getElementById("filedownfrm").src = furl;
		}
	};
</script>