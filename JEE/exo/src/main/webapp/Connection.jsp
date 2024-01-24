<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Log In</title>
    <jsp:include page="WEB-INF/includes/head.jsp" />

</head>
<body>
<h2 class ="display-3">Connection</h2>
<form action="insert" method="post">
    <div class="form-row">
        <div class="form-group col-md-6">
            <label for="mail">e-mail</label>
            <input type="text" class="form-control" id="mail" name="mail-user">
        </div>
        <div class="form-group col-md-6">
            <label for="inputPassword4">Mot de passe</label>
            <input type="text" class="form-control" id="inputPassword4" name="password">
        </div>
    </div>
</form>
</body>
</html>
