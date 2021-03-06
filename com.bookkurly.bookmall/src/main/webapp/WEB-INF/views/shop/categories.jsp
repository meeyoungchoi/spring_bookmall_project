
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="path" value="<%=request.getContextPath()%>" />

<jsp:include page="../layouts/header.jsp" />

<div class="jumbotron">
	<h1 class="display-4">환영합니다~!</h1>
	<p class="lead">도서 쇼핑몰 BookKurly입니다</p>
	<hr class="my-4">
	<p>즐거운 쇼핑 하세용~</p>
	<a class="btn btn-success btn-lg"
		href="${path}/subcategory/backend/${1}">쇼핑하기</a>
</div>



<div class="container">
	<div class="row">

		<c:forEach var="str" items="${books}">
			<div class="card mt-5 mr-5 ml-4" style="width: 19rem;">
				<img src="${path}/resources/${str.bookImageName}"
					class="card-img-top" alt="...">
				<div class="card-body">

					<h5 class="card-title container text-center font-weight-bold">${str.bookTitle}</h5>

					<p class="card-text container text-center">${str.bookPrice}원</p>
					<a
						href="${path}/book/${str.bookSeq}/subcateseq/${str.subCateSeq}"
						class="btn btn-primary btn-block text-center">상세조회</a>

				</div>
			</div>
		</c:forEach>



	</div>



</div>





<jsp:include page="../layouts/footer.jsp" />
