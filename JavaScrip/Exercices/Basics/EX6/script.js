let squareSide,
squarePerimeter, 
squareArea, 
rectangleSideA,
rectangleSideB,
rectanglePerimeter, 
rectangleArea, 
read =""; 

const DATA = document.querySelector(".data");

squareSide= parseInt(prompt(`Veuillez entrer la longuer d'un côté du carré (en cm)`)); 

rectangleSideA = parseInt(prompt(`Veuillez entrer la longueur d'un côté du rectangle`));
rectangleSideB = parseInt(prompt(`Veuillez entrer la largeur d'un côté du rectangle`));

squarePerimeter = squareSide*4;
squareArea = squareSide**2;  

rectanglePerimeter = (rectangleSideA+rectangleSideB)*2;
rectangleArea = rectangleSideA*rectangleSideB;

read += `<h4>Calcul de l'aire et du pémimètre d'un carré</h4>`;
read += `Les longueur des côtés du carré étant de ${squareSide} cm,<br>`;
read += `‣ Le périmètre de ce carré est de ${squarePerimeter} cm<br>`; 
read += `‣ L'aire de ce carré est de ${squareArea} cm²<br>`;  
read += `<hr>`;


read += `<h4>Calcul de l'aire et du périmètre d'un rectangle</h4>`;

if (rectangleSideA===rectangleSideB){
    alert("Cette figure est un carré (⊙x⊙;)");
    rectangleSideA = parseInt(prompt(`Veuillez entrer la longueur d'un côté du rectangle`));
    rectangleSideB = parseInt(prompt(`Veuillez entrer la largeur d'un côté du rectangle`));
}else{
    
    read += `Les longueur des côtés du rectangle étant de ${rectangleSideA} cm pour la longueur, et de ${rectangleSideB} cm pour la largeur<br>`;
    read += `‣ Le périmètre de ce rectangle est de ${rectanglePerimeter} cm<br>`; 
    read += `‣ L'aire de ce carré est de ${rectangleArea} cm²<br>`; 
} 
read += `<hr>`;

DATA.innerHTML = read; 

