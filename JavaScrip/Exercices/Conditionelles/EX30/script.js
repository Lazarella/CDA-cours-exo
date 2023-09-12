let read ="", 
gradeInput,
grades=[],
i=0, 
average 
;

const DATA = document.querySelector(".data")

read += `<h3>Meilleure note, moins bonne note, moyenne des notes</h3><hr>`;

while(gradeInput !==777){
    gradeInput=parseInt(prompt(`Veuillez entrer une note (/20)
    Saisissez "777" pour interompre la saisie`));
    if(gradeInput<0 || gradeInput>20||gradeInput===NaN){
        continue;
    }
grades.push(gradeInput);
console.table(grades); 
i++;
    read += `<p>La série comprend les notes suivantes : </p>`
    read += `En note ${i}, vous avez saisi ${gradeInput}/20.`
console.log (i);
}

grades.sort((a, b) => a - b);
console.log(grades);

read += `<hr><p>Sur l'ensemble des ${i} notes :</p><ul>`
read += `<li class="text-success">La meilleure note est de ${grades[grades.length -1]}</li>`;
read += `<li class ="text-danger">La moins bonne note est de ${grades[0]}</li>`;

average = (grades.reduce((accumulator, currentValue) => accumulator + currentValue, 0))/i;

read += `<li>La moyenne des notes est de ${Math.floor(average)}</li></ul>`;

DATA.innerHTML = read; 