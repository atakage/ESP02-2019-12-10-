<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="rootPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
    <head>
        <meta charset='utf-8'>
        <title>취업지원정보 - 회원가입</title>
        <style>
            
            body{
                background-color: rgb(245,246,247);
            }
            .join{
                width: 410px;
                position: absolute;
                left: 50%;
                top: 50%;
                transform: translate(-50%, -50%);
                
            }
            
            .join li{
                list-style: none;
            }
            .join h4{
                margin-bottom: 5px;
            }
            .join input{
                width: 90%;
                height: 30px;
                font-size: 14px;
                padding: 0 15px;
                margin-top: 5px;
            }
            
            button{
                padding: 0px 5px;
            }
            .addr{
                margin: 2px 0;
            }
            #mit{
                background-color: rgb(47,79,79);
                color: white;
                width: 99.5%;
                height: 30px;
                margin-top: 10px;
                cursor: pointer;
                font-size: 12px;
            }
            #mit:hover{
                font-weight: bold;
            }
            #search{
                padding: 11px;
                color: white;
                background-color: rgb(47,79,79);
            }
        </style>
        
    </head>
    <body>
            
            <section class="join">
                <form action="/esp" method="POST">
                    <ul>
                        <h4>아이디</h4>
                        <li><input type="text" placeholder="아이디" name="id" title="아이디입력"></li>
                        <h4>비밀번호</h4>
                        <li><input type="password" placeholder="비밀번호" name="pwd" title="비밀번호입력"></li>
                        <h4>이메일</h4>
                        <li><input type="email" name="email" placeholder="이메일" title="이메일입력"></li>
                        <h4>주소</h4>
                        <input class="addr" type="text" name="zip" placeholder="우편번호" style="width:80px; height:30px;" />
                        <button id="search" type="button"style="width:50px; height:34px;" >검색</button><br>
                        <input class="addr" type="text" name="addr1" placeholder="주소"/><br>
                        <input class="addr" type="text" name="addr2" placeholder="상세주소"/>
                        <h4>전화번호</h4>
                        <li><input type="tel" title="전화번호입력" placeholder="전화번호"></li>
                        <li ><a href="${rootPath}/"><button id="mit" type="submit" >가입완료</button></a></li>
                    </ul>
                </form>          
            </section>
            
    </body>
</html>