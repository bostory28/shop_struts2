<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>구매목록</title>
<script type="text/javascript" src="../js/jquery-1.11.1.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$('#index').click(function() {
			location.href='../index.action';
		});
		$('#booklist').click(function() {
			location.href='../book/bookList';
		});
	});
</script>
</head>
<body>
<h1><b>[${member.name }(${member.id })님의 구매목록]</b></h1>
<table border="1" cellspacing="0">
	<tr>
		<td>구입일</td>
		<td>상품코드</td>
		<td>제목</td>
		<td>가격</td>
		<td>수량</td>
		<td>합계금액</td>
	</tr>
	<s:iterator value="list" status="stat">
		<tr>
			<td><s:property value="list[#stat.index].inputdate"/></td>
			<td><s:property value="list[#stat.index].code"/></td>
			<td><s:property value="list[#stat.index].title"/></td>
			<td><s:property value="list[#stat.index].price"/></td>
			<td><s:property value="list[#stat.index].cnt"/></td>
			<td class="sum"><s:property value="list[#stat.index].sum"/></td>
		</tr>
	</s:iterator>
	<tr>
		<td colspan="5">누적 구매액</td>
		<td>${sum }</td>
	</tr>
	<tr>
		<td colspan="6" align="center">
			<input type="button" id="index" value="처음으로">
			<input type="button" id="booklist" value="목록으로">
		</td>
	</tr>
</table>

</body>
</html>