<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>로그인</title>
<script type="text/javascript" src="../js/jquery-1.11.1.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$('#loginbtn').click(login);
	});
	function login() {
		var id = document.getElementById("id").value;
		var password = document.getElementById("password").value;
		
		if(id.length==0 || password.length==0) {
			alert('값을 입력하시오');
			return;
		}
		$.ajax({
			url:'login.action',
			type:'post',
			dataType:'json',
			data:$('#loginform').serialize(),
			contentType:'application/x-www-form-urlencoded; charset=UTF-8',
			success:function() {
				alert('로그인 성공');
				window.close();
				opener.location.href='<s:url value="/index.action"></s:url>';
			}
		});
	}
</script>
</head>
<body>
<h1><b>[로그인]</b></h1>
<form id="loginform">
<table>
	<tr>
		<td>ID</td>
		<td><input type="text" id="id" name="member.id"></td>
	</tr>
	<tr>
		<td>비밀번호</td>
		<td><input type="password" id="password" name="member.password"></td>
	</tr>
	<tr>
		<td colspan="2">
			<input type="button" id="loginbtn" value="로그인">
		</td>
	</tr>
</table>
</form>
</body>
</html>