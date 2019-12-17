<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<c:set var="rootPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>취업지원정보 - 정책자료실</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<%@ include file="/WEB-INF/views/include/include-title.jspf" %>
<link rel="stylesheet" href="${rootPath}/css/body.css?ver=20191121001" type="text/css">
<link rel="stylesheet" href="${rootPath}/css/table.css?ver=20191121001" type="text/css">
<script>
	$(function(){
		$(".content-body").click(function(){
			let id = $(this).attr("data-id")
			document.location.href = "${rootPath}/reference/view?id=" +id
		})
		
		$("#btn-insert").click(function(){
			document.location.href="${rootPath}/reference/insert"
		})
	})
</script>
</head>
<body>
	<%@ include file="/WEB-INF/views/include/include-header.jspf" %>
	<%@ include file="/WEB-INF/views/include/include-mainnav.jspf" %>
    <section class="news_section">
        <article class="body_title">
            <p> 정책자료실 </p>
	        <article class="news_search">
	        	<form>
	            <select name="searchField" class="news_button">
	                <option value="allList" selected="selected">전체</option>
	                <option value="title">제목</option>
	                <option value="content">내용</option>
	            </select>
	            	<input name="search" type="text" id="news_input">
	            <button class="news_button" id="search_enter">검색</button>
	            <button class="news_button" type="button" id="btn-insert">글쓰기</button>
	            </form>
	        </article>
	        <div class="detail_table">
	            <table border="1">
	                <tr>
	                    <th id="th1">번호</th>
	                    <th id="th2">제목</th>
	                    <th id="th3">작성자</th>
	                    <th id="th4">등록일</th>
	                    <th id="th5">첨부파일</th>
	                </tr>
					<c:choose>
						<c:when test="${empty RLIST}">
							<tr><td colspan="5">정책 자료가 없음</td></tr>
						</c:when>
						<c:otherwise>
							<c:forEach items="${RLIST}" var="vo" 
				                	varStatus="count">
								<tr class="content-body"
										data-id="${vo.d_seq}">
									<td>${fn:length(RLIST) - count.index}</td>
									<td>${vo.d_title}</td>
									<td>${vo.d_writer}</td>
									<td>${vo.d_date}</td>
									<td>${vo.d_file}</td>
								</tr>
							</c:forEach>
						</c:otherwise>
					</c:choose>
	            </table>
	        </div>
	        <article class="news_page_button">
	            <button>≪</button>
	            <button>＜</button>
	            <button>1</button>
	            <button>2</button>
	            <button>3</button>
	            <button>4</button>
	            <button>5</button>
	            <button>＞</button>
	            <button>≫</button>
	        </article>
        </article>
    </section>
    <%@ include file="/WEB-INF/views/include/include-footer.jspf" %>
</body>
</html>