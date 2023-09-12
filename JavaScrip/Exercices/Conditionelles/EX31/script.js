let read ="",
nbUser, 
sum,
persons = [
{
firstName : "Jean", 
LastName : "Dupont", 
age : 15 
}
,
{
firstName : "Pierrine", 
LastName : "Payet", 
age : 16 
}
,
{
firstName : "Laura", 
LastName : "Sahoueri", 
age : 17 
}]
;

const DATA = document.querySelector(".data")

read += `<h5>Liste des contacts</h5>`


read += `<table class= "table">
<thead class="thead-dark">
<tr>
<th>Prénom</th>
<th>Nom</th>
<th>Age</th>
</tr>
</thead>
<tbody>`; // cette partie n'as pas besoin d'être dans le JS

persons.forEach(person => {
        read +=`<tr>`;
        for ( let prop in person){
            
            read +=`<td>${person[prop]}</td>`
        }
    read += `</tr>`;
});

// Pour faire un tableau associatif, il faut utiliser un for...of (une ligne par prop)

    read += `</tbody>
            </table>`
    read += `<p>La personne à la <b>2eme position</b> de l'annuaire est :</p>`

    read += `${persons[1].firstName} ${persons[1].LastName} `




DATA.innerHTML = read; 