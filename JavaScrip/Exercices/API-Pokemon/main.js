const apiUrl = "https://pokeapi.co/api/v2/pokemon/"; 

let data,
pokemonToGet = 152, 
pokemonList=[];  

//pour utiliser cette logique, une classe pokemon simplifierait les choses 

function fetchMyPokemon(pokemonNumber){
    
    return fetch(apiUrl+ pokemonNumber)
    .then(response => {
        if(!response.ok){
            throw new Error(`La requete a echoue avec un statut ${response.status}`)
        }
        return response.json()
    })
    .then(responseData => {
        data = responseData;
        console.log("Données reçues: ");
        console.log(data);
    })
    .catch(error => {
        console.error("une erreur : "+ error)
    })
    
}

for (let i = 1; i<= pokemonToGet; i++){
    fetchMyPokemon(i)
    .then(data => {
        pokemonList.push(data); 
        console.table(pokemonList);
        
    }); 
}

const showCase = document.querySelector('#displayBox')

const displayBtn = document.querySelectorAll('#displayBtn'); 
function displayRandomPokemon() {
    if (pokemonList.length > 0) {
        const nbRand = Math.floor(Math.random() * pokemonList.length);
        const randomPokemon = pokemonList[nbRand];

        if (randomPokemon) {
            const imgPokemon = document.createElement('img');
            imgPokemon.setAttribute('src', randomPokemon.sprites.front_default);
            showCase.innerHTML = '';
            showCase.appendChild(imgPokemon);

            const namePokemon = document.createElement('h5');
            namePokemon.textContent = 'Voici mon Pokémon: ' + randomPokemon.name;
            showCase.appendChild(namePokemon);

            const weightPokemon = document.createElement('p');
            weightPokemon.textContent = 'Je pèse ' + randomPokemon.weight + ' livres';
            showCase.appendChild(weightPokemon);

            const heightPokemon = document.createElement('p');
            heightPokemon.textContent = 'Je mesure ' + randomPokemon.height + ' pieds de haut';
            showCase.appendChild(heightPokemon);
        } else {
            console.error("Les données ne sont pas encore disponibles.");
        }
    }
}


    displayBtn.forEach(button => {
        button.addEventListener('click', displayRandomPokemon);
    });

// function displayShowCase(a){
//     const imgPokemon = document.createElement('img'); 
//     imgPokemon.setAttribute('src', data.sprites.front_default);
//     showCase.innerHTML = '';
//     showCase.appendChild(imgPokemon); 
//     const namePokemon = document.createElement('h5')
//     namePokemon.textContent = data.name;
//     //namePokemon.className('namePokemon')
//     showCase.appendChild(namePokemon); 
//     const weightPokemon = document.createElement('p')
//     weightPokemon.textContent = 'Je pèse '+(data.weight)+' livres'
//     showCase.appendChild(weightPokemon)
//     const heightPokemon = document.createElement('p')
//     heightPokemon.textContent = 'Je mesure '+data.height+' pieds de haut'
//     showCase.appendChild(heightPokemon)
// }

    

