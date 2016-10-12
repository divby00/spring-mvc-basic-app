<%@include file="common/include-top.jsp"%>

<div class="app-page">

    <h1><fmt:message key="heading"/><i class="heart glyphicon glyphicon-heart"></i></h1>

    <div class="row">
        <div class="col-md-2 col-xs-6">
            <img class='avatar' src='<c:url value="/images/avatar.png"/>'/>
        </div>
        <div class="col-md-10 col-xs-6">
            <c:choose>
                <c:when test="${not empty data.products}">
                    Products in database: <c:out value='${data.products}'/>
                </c:when>
                <c:otherwise>
                    There aren't products in the database
                </c:otherwise>
            </c:choose>
        </div>
    </div>

</div>

<%@include file="common/include-bottom.jsp"%>
