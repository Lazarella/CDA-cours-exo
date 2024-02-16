import { TouchableHighlight, StyleSheet, FlatList, View } from "react-native"
import PokemonCard from "../component/PokemonCard"
import { useDispatch } from 'react-redux'
import { useEffect, useState } from 'react'
import { fetchPokemons } from "../PokemonSlice"

export default function PokemonList ({navigation}){

const dispatch = useDispatch(); 
const[thisPokemons, setThisPokemons] = useState([]); 

useEffect(()=>{
    const fetchData = async () => {
        try{
            const response = await dispatch(fetchPokemons())
            console.log("kiki",response.payload);
        setThisPokemons(response.payload)
        }catch (error){
            console.error("Oups! Une erreur s'est produite : ",error)
        }

    } 
    fetchData();   
},[])

    return(
        <View style={styles.container} >
            <FlatList
        numColumns={2}
        data = {thisPokemons}
        renderItem={({item})=>{
        console.log(item);
        return(
            <TouchableHighlight onPress={()=>navigation.navigate("PokemonDetail")}
            style={styles.item}>
    <PokemonCard sprites ={item.sprites?.front_default}  name={item.name} types={item.types?.type.name}/>
        </TouchableHighlight>
        )
    }}
    keyExtractor={item=>item.id}
        />
        </View>
    )
}

const styles = StyleSheet.create({
    container: {
        flex: 1,
        margin: 20,
    },
    item:{
        flex:1, 
        margin: 10
    }
    
})