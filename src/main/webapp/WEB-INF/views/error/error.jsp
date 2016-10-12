<%@include file="../common/include-top.jsp"%>

<div class="error-page">

    <h1><fmt:message key="error"/>&nbsp;<i class="alert glyphicon glyphicon-alert"></i></h1>

    <div class="row">
        <div class="col-md-1 col-xs-2 text-left">
            ${data.errorCode}
        </div>
        <div class="col-md-11 col-xs-10 text-left">
            ${data.errorMessage}
        </div>
    </div>

    <h3><fmt:message key="stacktrace"/></h3>

    <div class="row error-row">
        <div class="col-xs-12 text-left">
            ${data.exception}
        </div>
    </div>

</div>

<%@include file="../common/include-bottom.jsp"%>
