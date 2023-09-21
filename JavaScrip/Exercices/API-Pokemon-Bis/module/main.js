import { pokemon } from "./js/pokemon.js"

const apiUrl = 'https://pokeapi.co/api/v2/pokemon/'

function fetchMyPokemon(){
    for(let i = 1 ; i<23 ; i++ ){
        
        fetch(apiUrl+i)
            .then(response =>{
                if(!response.ok){
                    throw new Error(`Coucou : echec echec echec (╬▔皿▔)╯ satus ${response.status}`)
                }
            return response.json()
            })
            .then(data =>{
                console.log("Coucou, les données sont bien arrivées q(≧▽≦q)");
                console.log(data);
            })
            .catch(error =>{
                console.error(+error+"sauvage est apparue dans les hautes herbes")
        })
    }
}

    fetchMyPokemon()