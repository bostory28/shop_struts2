<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>상품상세정보</title>
<style type="text/css">
	.title {
		text-align: center; width: 100px
	}
	.value {
		text-align: left; width: 250px
	}
</style>
<script type="text/javascript" src="../js/jquery-1.11.1.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$('.title').addClass('title');
		$('.value').addClass('value');
		var id = '${session.id}';
		$('#purchase').click(function() {
			var cnt = $('#cnt').val();
			var quantity = $('#quantity').val();
			if(cnt.length > quantity.length) {
				alert(quantity + '를 초과해서 살 수 없습니다.');
				$('#cnt').val("");
				$('#cnt').focus();
				return;
			}
			
			if(id == '') {
				window.open('../member/goLoginForm.action', 'loginform', 'width=300, height=200, top=300, left=500');
			} else {
				document.saleform.action='../sale/purchaseBook.action';
				document.saleform.submit();
			}
		});
		$('#select').click(function() {
			if(id == '') {
				window.open('../member/goLoginForm.action', 'loginform', 'width=300, height=200, top=300, left=500');
			} else {
				document.saleform.action='../wishlist/selectBook.action';
				document.saleform.submit();
			}
		});
	});
</script>
</head>
<body>
<h1><b>[상품 상세 정보]</b></h1>
<form name="saleform" method="post">
<table border="1" cellspacing="0">
	<tr>
		<td class="title">상품코드</td>
		<td class="value"><input type="text" readonly="readonly" name="book.code" value="${book.code }"></td>
	</tr>
	<tr>
		<td class="title">제목</td>
		<td class="value"><input type="text" readonly="readonly" name="book.title" value="${book.title }"></td>
	</tr>
	<tr>
		<td class="title">가격</td>
		<td class="value"><input type="text" readonly="readonly" name="book.price" value="${book.price }"></td>
	</tr>
	<tr>
		<td class="title">재고수량</td>
		<td class="value"><input type="text" id="quantity" readonly="readonly" name="book.quantity" value="${book.quantity }"></td>
	</tr>
	<tr>
		<td class="title" height="50px">구매수량</td>
		<td class="value">
			<input type="text" id="cnt" name="sale.cnt" style="width: 30px">
			<input type="button" value="구입하기" id="purchase">
			<input type="button" value="관심상품저장" id="select">
		</td>
	</tr>
</table>
</form>
</body>
</html>