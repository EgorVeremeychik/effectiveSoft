<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>About</title>
    <link rel="stylesheet" href="<c:url value="/resources/css/bootstrap.min.css"/>">
</head>
<body>
<c:url value="/city/addCity" var="addCity"/>
<div class="wrapper">
    <jsp:include page="common/header.jsp"/>
    <div class="container">
        <div class="row">
            <br><br>
            <h1 class="text-center">About</h1>
            <br><br><br>
            <div class="col-md-12">
                <table class="table table-hover">
                    <thead>
                    <tr>
                        <th class="info">RoadId</th>
                        <th class="info">Name</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${roadList}" var="road">
                    <tr>
                        <td>${road.roadId}</td>
                        <td>${road.roadName}</td>
                    </tr>
                    </c:forEach>
                    <tr>
                    </tr>
                    <tr>
                        <th><a href="/city/">
                            <button class="btn btn-primary">Back</button>
                        </a></th>
                        <td></td>
                    </tr>
                    <tbody>
                </table>
            </div>
        </div>
    </div>
</div>
<jsp:include page="common/footer.jsp"/>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>
</body>
</html>
