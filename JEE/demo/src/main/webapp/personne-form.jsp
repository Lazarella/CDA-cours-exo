<%@taglib prefix="c" uri="jakarta.tags.core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Creation de personne</title>
    <link href ="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"/>
</head>
<body>
<h2>Formulaire de création de personne</h2>
<form action="personne" method="post" class = m-4>
    <div class="mb-3">
        <label for="nom" class="form-label">Nom</label>
        <input type="text" class="form-control" id="nom" aria-describedby="nom">
    </div>
    <div class="mb-3">
        <label for="prenom" class="form-label">Prenom</label>
        <input type="text" class="form-control" id="prenom">
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
</form>
</body>
</html>
