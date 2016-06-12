<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>About</title>
    <link rel="stylesheet" href="<c:url value="/resources/css/bootstrap.min.css"/>">
</head>
<body>
<c:url value="/road/addRoad" var="addRoad"/>
<div class="wrapper">
    <jsp:include page="common/header.jsp"/>
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <h1 class="text-center">City roads</h1>
                <br>
                <div class="col-md-10">
                    <table class="table table-hover">
                        <thead>
                        <tr>
                            <th class="info">RoadID</th>
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
                    <form:form action="${addRoad}" method="POST" modelAttribute="road">
                        <table>
                            <tr>
                                <td class="indent"><h4>Input road name :</h4></td>
                                <td class="indent">
                                    <form:input id="roadName" type="text" path="roadName" class="input-group" required="true" />
                                    <form:input type="hidden" name="cityIdId" value="${cityId}" path="cityIdId"/>
                                </td>
                                <td>
                                    <button class="btn btn-primary">Add road</button>
                                </td>
                            </tr>
                        </table>
                    </form:form>
                </div>
                <div class="col-md-2 marg">
                    <c:forEach items="${roadList}" var="road">
                        <a href="/road/delete/${road.roadId}" class="btn btn-danger margin-del">Delete</a>
                    </c:forEach>
                </div>
            </div>
        </div>
    </div>
</div>
<jsp:include page="common/footer.jsp"/>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>
</body>
</html>
