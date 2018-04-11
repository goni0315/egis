<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
네이버 블로오그 검색 api
<form action="search" method="get">
<input type="text" name="q">
<button type="submit">검색</button>
</form>

<c:forEach items="${list}" begin="0" var="i" end="4">
<div><a href=${i.link}>${i.title}</a> ${i.postdate}

</div>
<div>
${i.description}
</div>
<div>

${i.bloggername} <a href=${i.bloggerlink}>${i.bloggerlink}</a>
</div>
</br>


</c:forEach>


</body>
</html>