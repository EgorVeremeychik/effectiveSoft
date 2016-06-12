<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="<c:url value="/resources/css/bootstrap.min.css" />">
    <title>CityRoad</title>
</head>
<body>
<c:url value="/city/addCity" var="addCity"/>
<div class="wrapper">
    <jsp:include page="common/header.jsp"/>
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <h1 class="text-center">Cities</h1>
                <br>
                <div class="col-md-10">
                    <table class="table table-hover">
                        <thead>
                        <tr>
                            <th class="info">CityID</th>
                            <th class="info">Name</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach items="${cityList}" var="city">
                            <tr data-href="/road/cityRoads/${city.cityId}">
                                <td>${city.cityId}</td>
                                <td>${city.cityName}</td>
                            </tr>
                        </c:forEach>
                            <tr></tr>
                        </tbody>
                    </table>
                    <form:form action="${addCity}" method="POST" modelAttribute="city">
                        <table>
                            <tr>
                                <td class="indent"><h4>Input city name :</h4></td>
                                <td class="indent"><form:input id="cityName" type="text" path="cityName" class="input-group" required="true" /></td>
                                <td>
                                    <button class="btn btn-primary">Add city</button>
                                </td>
                            </tr>
                        </table>
                    </form:form>
                </div>
                <div class="col-md-2 marg">
                    <c:forEach items="${cityList}" var="city">
                        <a href="/city/delete/${city.cityId}" class="btn btn-danger margin-del">Delete</a>
                    </c:forEach>
                </div>
            </div>
        </div>
    </div>
</div>
<jsp:include page="common/footer.jsp"/>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>
<script src="<c:url value="/resources/js/link.js"/>"></script>
</body>
</html>