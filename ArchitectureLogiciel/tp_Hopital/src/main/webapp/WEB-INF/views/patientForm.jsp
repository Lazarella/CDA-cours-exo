<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Création de patient</title>
</head>
<body>
<div class="container mt-4">
    <center>
        <c:if test="${patient == null}">
            <h2>Ajouter un produit </h2>
        </c:if>
        <c:if test="${patient != null}">
            <h2>Modifier un produit </h2>
        </c:if>
    </center>
    <div>
        <form action="insert" method="post" enctype="multipart/form-data">
            <div class="form-row">
                <c:if test="${patient != null}">
                    <input type="hidden" name="id" value="<c:out value='${patient.getId()}' />" />
                </c:if>
                <div class="form-group col-md-6">
                    <label for="inputName">nom</label>
                    <input type="text" class="form-control" id="inputName" name="NamePatient" value="${patient.getName()}">
                </div>
                <div class="form-group col-md-6">
                    <label for="inputPhone">Phone</label>
                    <input type="text" class="form-control" id="inputPhone" name="phonePatient" value="${patient.getPhone()}">
                </div>
            </div>
            <button type="submit" class="btn btn-primary">${produit == null ? 'Valider' : 'Update'}</button>
        </form>
    </div>
</div>
</body>
</html>
