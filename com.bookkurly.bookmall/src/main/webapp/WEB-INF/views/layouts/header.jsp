<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.List"%>
<%@ page
	import="com.bookkurly.bookmall.customer.category.entity.MainCategory"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="path" value="<%=request.getContextPath()%>" />



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">
</head>
<body>

	<%
		List<MainCategory> mainCategories = (List<MainCategory>) session.getAttribute("mainCategories");

	String userId = (String) session.getAttribute("loginSession");
	%>


	<nav class="navbar navbar-expand-lg navbar-light bg-light ">
		<a class="navbar-brand" href="#">Navbar</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active"><a class="nav-link" href="#">Home
						<span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item"><a class="nav-link" href="#">Link</a></li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
					role="button" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false"> 카테고리 </a>
					<div class="dropdown-menu" aria-labelledby="navbarDropdown">

						<c:forEach var="maincategory" items="${mainCategories}"
							varStatus="status">
							<c:choose>
								<c:when test="${maincategory.mainCateSeq == 1}">
									<a class="dropdown-item"
										href="${path}/subacategory/backend/${maincategory.mainCateSeq}">${maincategory.mainCateName}</a>
								</c:when>
								<c:when test="${maincategory.mainCateSeq == 2}">
									<a class="dropdown-item"
										href="${path}/subacategory/frontend/${maincategory.mainCateSeq}">${maincategory.mainCateName}</a>

								</c:when>

							</c:choose>
						</c:forEach>
					</div></li>
				<li class="nav-item"><a class="nav-link disabled" href="#"
					tabindex="-1" aria-disabled="true">Disabled</a></li>
			</ul>
			<form class="form-inline my-2 my-lg-0">
				<input class="form-control mr-sm-2" type="search"
					placeholder="Search" aria-label="Search">
				<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
				<c:if test="${userId != null}">
					<h1 class="text-success">${userId}님로그인중</h1>
					<a class="btn btn-outline-info my-2 my-sm-0 ml-2"
						href="${path}/customer/logout" type="submit">로그아웃</a>
				</c:if>
				<c:if test="${userId == null}">
					<a class="btn btn-outline-info my-2 my-sm-0 ml-2"
						href="${path}/customer/login" type="submit">로그인</a>
					<a class="btn btn-outline-primary my-2 my-sm-0 ml-2" type="submit">회원가입</a>
				</c:if>

			</form>
		</div>
	</nav>