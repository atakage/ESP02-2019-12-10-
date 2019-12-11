<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="rootPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>취업지원정보 - 개선의견수렴</title>
<%@ include file="/WEB-INF/views/include/include-title.jspf" %>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script>
$(function(){
	
	$(".opinion_insert").click(function(e){
		alert("등록되었습니다.")
	})
	
	
	
})
</script>
</head>
<body>
<%@ include file="/WEB-INF/views/include/include-header.jspf" %>
<%@ include file="/WEB-INF/views/include/include-mainnav.jspf" %>
<link rel="stylesheet" href="${rootPath}/css/body.css?ver=20191121001"	type="text/css">
<link rel="stylesheet" href="${rootPath}/css/table.css?ver=20191121001"	type="text/css">
    <section class="news_section">
        <article class="body_title">
            <p>개선의견수렴</p>
        </article>
        <article class="opinion_table">
            <table>
                <tr>
                    <th>제목</th>
                    <td><input name="opinion_submit" type="text" placeholder="제목을 입력해주세요"></input></td>
                </tr>
                <tr>
                    <th>이메일</th>
                    <td><input name="opinion_submit" type="email"  placeholder="이메일을 입력해주세요"></td>
                </tr>
                <tr>
                    <th>내용</th>
                    <td><input name="opinion_submit" type="text" class="op_input" placeholder="내용을 입력해주세요"></td>
                </tr>
            </table>
            <div>
                <a href="${rootPath}/opinion"><button class="opinion_insert">등록</button></a>
            </div>
        </article>
    </section>
    <%@ include file="/WEB-INF/views/include/include-footer.jspf" %>
</body>
</html>