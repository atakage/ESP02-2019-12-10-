<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="rootPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>취업지원정보 - 정책자료실</title>
<%@ include file="/WEB-INF/views/include/include-title.jspf" %>
<link rel="stylesheet" href="${rootPath}/css/body.css?ver=20191121001" type="text/css">
<link rel="stylesheet" href="${rootPath}/css/table.css?ver=20191121001" type="text/css">

</head>
<body>
	<%@ include file="/WEB-INF/views/include/include-header.jspf" %>
	<%@ include file="/WEB-INF/views/include/include-mainnav.jspf" %>
	
    <section class="news_section">
        <article class="body_title">
            <p> 정책 자료실 </p>
        <article class="news_search">
            <select name="searchField" class="news_button">
                <option value="allList" selected="selected">전체</option>
                <option value="title">제목</option>
                <option value="subject">내용</option>
            </select>
            <input name="search" type="text" id="news_input">
            <button class="news_button">검색</button>
        </article>
        <div class="detail_table">
            <table border="1">
                <tr>
                    <th id="th1">번호</th>
                    <th id="th2">제목</th>
                    <th id="th3">작성자</th>
                    <th id="th4">등록일</th>
                    <th id="th5">첨부파일</th>
                    <th id="th6">분류</th>
                </tr>
                <tr>
                    <td>3</td>
                    <td><a href="${rootPath}/reference/detail">세번째 자료입니다.</a></td>
                    <td>관리자</td>
                    <td>2019.12.07</td>
                    <td>파일은</td>
                    <td>공지사항</td>
                </tr>
                <tr>
                    <td>2</td>
                    <td><a href="${rootPath}/reference/detail">두번째 자료</a></td>
                    <td>관리자</td>
                    <td>2019.12.06</td>
                    <td>파일은</td>
                    <td>공지사항</td>
                </tr>
                <tr>
                    <td>1</td>
                    <td><a href="${rootPath}/reference/detail">정책자료실입니다.</a></td>
                    <td>작성자는</td>
                    <td>2019.12.01</td>
                    <td>파일은</td>
                    <td>공지사항</td>
                </tr>
                <tr>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                </tr>
                <tr>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                </tr>
                <tr>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                </tr>
                <tr>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                </tr>
                <tr>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                </tr>
                <tr>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                </tr>
                <tr>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                </tr>
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

	
</body>
	<%@ include file="/WEB-INF/views/include/include-footer.jspf" %>
</html>
