<%@ page session="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%-- Redirected because we can't set the welcome page to a virtual URL.
     All petitions to the index will be redirected to MainController --%>
<c:redirect url="/main.html"/>