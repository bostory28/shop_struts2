<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원가입</title>
<script type="text/javascript" src="../js/jquery-1.11.1.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$('#memberbtn').click(join);
	});
	function join() {
		var id = $('#id').val();
		var password = $('#password').val();
		var name = $('#name').val();
		var address = $('#address').val();
		var phone = $('#phone').val();
		if(id.length==0||password.length==0||name.length==0||address.length==0||phone.length==0) {
			alert('값을 입력하시오');
			return;
		}
		$.ajax({
			url:'joinMember.action',
			type:'post',
			dataType:'json',
			data:$('#memberform').serialize(),
			contentType:'application/x-www-form-urlencoded; charset=UTF-8',
			success:function() {
				alert('가입성공');
				location.href='../index.action';
			}
		});
	}
</script>
</head>
<body>
<h1><b>[회원가입]</b></h1>
<form id="memberform">
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
			<td>이름</td>
			<td><input type="text" id="name" name="member.name"></td>
		</tr>
		<tr>
			<td>주소</td>
			<td><input type="text" id="address" name="member.address"></td>
		</tr>
		<tr>
			<td>전화번호</td>
			<td><input type="text" id="phone" name="member.phone"></td>
		</tr>
		<tr>
			<td colspan="2" align="center"><input type="button" id="memberbtn" value="가입완료"></td>
		</tr>
	</table>
</form>
</body>
</html>