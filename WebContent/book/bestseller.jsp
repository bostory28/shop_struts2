<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>베스트셀러</title>
<script type="text/javascript">
	function index() {
		location.href='../index.action';
	}
</script>
</head>
<body>
<h1><b>[가장 많이 팔린 책]</b></h1>
<table border="1" cellspacing="0">
	<tr>
		<td>상품코드</td>
		<td>${bestseller.code }</td>
	</tr>
	<tr>
		<td>제목</td>
		<td>${bestseller.title }</td>
	</tr>
	<tr>
		<td>가격</td>
		<td>${bestseller.price }</td>
	</tr>
	<tr>
		<td>총 판매수량</td>
		<td>${bestseller.count }</td>
	</tr>
	<tr>
		<td colspan="2" align="center">
			<input type="button" value="처음으로" id="index" onclick="javascript:index()">
		</td>
	</tr>
</table>
</body>
</html>