<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="http://libs.baidu.com/jquery/1.10.2/jquery.min.js"></script>
<script type="text/javascript">
$(document).ready(function () {
	alert("wwww");
	$("#ws").click(function () {
		$("#ww").attr("action","login2");
	});
});
</script>

</head>
<body>
	<s:form action="login1" method="post" theme="simple" id="ww">
		<table>
			<tr>
				<td>用户：</td>
				<td><s:textfield name="username" size="18" maxlength="40"></s:textfield></td>
			</tr>
			<tr>
				<td>密码：</td>
				<td><s:textfield name="password" size="18" maxlength="40"></s:textfield></td>
			</tr>
			<tr>
				<td align="center" colspan="2"><s:submit value="确定"></s:submit>
					<s:reset value="注册" id="ws"></s:reset></td>
			</tr>
		</table>
	</s:form>
	
</body>
</html>