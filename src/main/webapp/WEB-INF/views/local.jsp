<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>



<form action="local" method="get">

<input type="text" name="q">
<button type="submit">지역검색</button>
</form>

<script type="text/javascript">

window.onload = function(){
	
	var page = "5"; // 한페이지 게시물 갯수
	
	
	var a = document.getElementById(a);
	a.text('<c:forEach items="${list}" begin="0" var="i" end="${lastSeq}"> <b>${i.seq}</b><br> 명칭:${i.title}<br> 주소:${i.address}<br> 도로명주소:${i.roadAddress}<br>	X좌표:${i.mapx}<br>	Y좌표:${i.mapy}<br>	<br><br></c:forEach>');
	
	
}










</script>

<div id="a">

</div>

<%-- <c:forEach items="${list}" begin="0" var="i" end="${lastSeq}">
<b>${i.seq}</b><br>
명칭:${i.title}<br>
주소:${i.address}<br>
도로명주소:${i.roadAddress}<br>
X좌표:${i.mapx}<br>
Y좌표:${i.mapy}<br>
<br>
<br>
</c:forEach> --%>





</body>
</html>