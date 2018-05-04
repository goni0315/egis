<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<script type="text/javascript">




</script>
<body>

<form action="local" method="get">

<input type="text" name="q">
<button type="submit">지역검색</button>
</form>

<c:set var="lastSeq" value="${lastSeq}" />



<c:choose>
<c:when test="${p*5-5>=0}">
<c:forEach items="${list}" begin="${p*5-5}" var="i" end="${p*5-1}">
<b>${i.seq}</b><br>
명칭:${i.title}<br>
주소:${i.address}<br>
도로명주소:${i.roadAddress}<br>
X좌표:${i.mapx}<br>
Y좌표:${i.mapy}<br>
<br>
<br>
</c:forEach>
</c:when>
<c:otherwise>
검색 결과가 없습니다.
</c:otherwise>
</c:choose>




<c:forEach var="i" begin="1" end="${lastSeq/5}">
<a href="local?q=${query}&p=${i}">${i}</a>
</c:forEach>




</body>
</html>