<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>온라인 서점</title>
<script type="text/javascript">
function goLoginform() {
	window.open('./member/goLoginForm.action', 'loginform', 'width=300, height=200, top=300, left=500');
}
</script>
</head>
<body>
<h1><b>[온라인 서점]</b></h1>

<ul>
	<s:if test="#session.id == null">
		<li><a href="./member/goMemberForm.action">회원가입</a></li>
		<li><a href="javascript:goLoginform()">로그인</a></li>
		<li><a href="./book/bookList.action">상품목록</a></li>
		<li><a href="./book/bestseller.action">베스트셀러</a></li>
	</s:if>
	<s:else>
		<li><a href="./member/logout.action">로그아웃</a></li>
		<li><a href="./sale/purchased.action">주문정보</a></li>
		<li><a href="./wishlist/selectedBooks.action">관심상품</a></li>
		<li><a href="./book/bookList.action">상품목록</a></li>
		<li><a href="./book/bestseller.action">베스트셀러</a></li>
	</s:else>
</ul>
</body>
</html>