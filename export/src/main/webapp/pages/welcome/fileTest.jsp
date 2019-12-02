<html>
	<div style="line-height: 30px; padding: 10px">
		<div>
			文件下载示例:<br />
			<input type="button" id="fileDownLoad" desc="文件下载" icon="fa fa-download" />
		</div>
		<div>文件上传示例:</div>
	</div>
	<br />
	<%@include file="/pages/common/FileDownLoad.jsp" %>
	<script type="text/javascript">
		function fileDownLoad_onClick() {
			//参数1：业务编号，参数2：下载文件分类，参数3：可选（附加参数，例如："&t=1&t2=2")
			FILE.download("aaa","01");
		}
	</script>
</html>