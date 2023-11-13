import { ScrollView } from "react-native-gesture-handler/lib/typescript/components/GestureComponents"
import { Text, StyleSheet } from "react-native"
import PokemonCard from "../component/PokemonCard"

export default function PokemonList (navigation, route){

const dispatch = useDispatch(); 
const[thisPokemons, setThisPokemons] = useState([]); 

useEffect(()=>{
    const fetchData = async () => {
        try{
            const response = await dispatch(fetchPokemons(props.)) //pas fini =>[prev...newPokemon]
        }catch (error){
            console.error("Oups! Une erreur s'est produite : ",error)
        }

    } 
    fetchData();   
},[])

const pokeName = route.params.name
const pokePic = route.params.pic
const pokeType = route.params.type




    return(
        <ScrollView>
            <TouchableHighlight onPress={navigation.navigate("PokemonDetail")}>
            <FlatList
        data = {}
        renderItem={({item})=>
    <PokemonCard/>
    }
    keyExtractor={item=>item.id}
        />
        </TouchableHighlight>
        </ScrollView>
    )
}

const styles = StyleSheet.create({

})