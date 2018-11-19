<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>상품목록</title>
</head>
<body>
<h1><b>[상품목록]</b></h1>
<table border="1" cellspacing="0">
	<tr style="font-weight: bold;" align="center">
		<td width="100px">상품코드</td>
		<td width="200px">제목</td>
	</tr>
	<s:iterator value="list" status="stat">
		<tr align="center">
			<td><s:property value="list[#stat.index].code"/></td>
			<td><a href="./infoOneOfBooks.action?code=<s:property value="list[#stat.index].code"/>">
					<s:property value="list[#stat.index].title"/>
				</a>
			</td>
		</tr>
	</s:iterator>
</table>
</body>
</html>