<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>관심상품목록</title>
<script type="text/javascript" src="../js/jquery-1.11.1.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$('.deletebtn').click(function() {
			var code = $(this).attr('code');
			location.href = '../wishlist/deleteWishlist.action?code=' + code;
		});
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
<h1><b>[${member.name }(${member.id })님의 WishList]</b></h1>
<table border="1" cellspacing="0">
	<tr>
		<td style="width: 80px">상품코드</td>
		<td style="width: 200px">제목</td>
		<td style="width: 80px">가격</td>
		<td style="width: 150px">관심상품 삭제하기</td>
	</tr>
	<s:iterator value="list" status="stat">
		<tr>
			<td><s:property value="list[#stat.index].code"/></td>
			<td><s:property value="list[#stat.index].title"/></td>
			<td><s:property value="list[#stat.index].price"/></td>
			<td><input type="button" class="deletebtn" value="삭제" code="<s:property value="list[#stat.index].code"/>"></td>
		</tr>
	</s:iterator>
	<tr>
		<td colspan="4" align="center">
			<input type="button" id="index" value="처음으로">
			<input type="button" id="booklist" value="목록으로">
		</td>
	</tr>
</table>
</body>
</html>