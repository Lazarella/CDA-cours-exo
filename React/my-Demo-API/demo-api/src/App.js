import './App.css';
import {useEffect} from 'react';
import axios from 'axios';

function App() {

  // 1ère étape: installation d'Axios: npm install axios dans le dossier react

// récupération
  useEffect(() => {
    axios.get("http://localhost:4091/people")
    .then (response => {
      console.log(response.data);
    })
    .catch(error => {
      console.error("Erreur: ",error);
    })
  },[])
  const addPerson =()=>{
    axios.post("http://localhost:4091/people",{nom: "Ulysse XXXI", age : 47, occupation : "Dad"} )
    .then(response=>{
      console.log(response.data)})
    .catch(error=>{
      console.error("Error :",error)
    })
  }

  const deletePerson=()=>{
    const id = 3
    axios.delete(`http://localhost:4091/people/${id}`)
    .then(response=>{
      console.log("personne avec id "+id+"supprimer")})
    .catch(error=>{
      console.error("Error :",error)
    })
  }
  const updatePerson = () =>{
    const id = 4 ; 
    axios.put(`http://localhost:4091/people/${id}`, {name: "Best Girl", age:66, occupation :"Awsomness"})
    .then(response=>{
      console.log(response.data)})
      .catch(error=>{
        console.error("Error :",error)
      })
  }

  return (
    <div className="App">
<button onClick={addPerson}>Ajouter</button>
<button onClick={deletePerson}>Bye bye</button>
<button onClick={updatePerson}>upgrade</button>
    </div>
  );
}

export default App;