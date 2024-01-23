<%@taglib prefix="c" uri="jakarta.tags.core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
      integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<html>
<head>
    <title>Liste Produits</title>
</head>
<body>
<h2>Liste des produits</h2>
<table class="table">
    <thead>
    <tr>
        <th scope="col">Marque</th>
        <th scope="col">Référence</th>
        <th scope="col">Date d'achat</th>
<c:forEach items="${produits}" var="produit">
    </tr>
    </thead>
    <tbody>
    <tr>
    <td>${produit.getMarque()}</td>
    <td> ${produit.getReference()}</td>
    <td> ${produit.getDateAchat()}</td>
    </tr>
</c:forEach>
    </tbody>
</table>
</body>
</html>
