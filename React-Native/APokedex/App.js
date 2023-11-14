import { NavigationContainer } from "@react-navigation/native";
import { createNativeStackNavigator } from"@react-navigation/native-stack";
import PokemonList from "./Screen/PokemonList"
import Home from "./Screen/Home"
import Pokedex from "./Screen/Pokedex"
import Detail from "./Screen/Detail"
import { Provider} from "react-redux"
import store from './store'

const Stack = createNativeStackNavigator()


export default function App() {
    return(
    <Provider store={store}>
    <NavigationContainer>
        <Stack.Navigator initialRouteName="Home">
        <Stack.Screen name="Home" component={Home}></Stack.Screen>
        <Stack.Screen name="PokemonList" component={PokemonList} options={{title:"Tous les pokémons"}}></Stack.Screen>
        <Stack.Screen name="PokedexList" component={Pokedex} options={{title:"Ton Pokédex!"}}></Stack.Screen>
        <Stack.Screen name="PokemonDetail" component={Detail} options={{title:"Mieux me connaître"}}></Stack.Screen>
        {/* <Stack.Screen name= "ErrorPage" component={ErrorPage}></Stack.Screen> a faire plus tard*/}
        </Stack.Navigator>
    </NavigationContainer>
    </Provider>
    )
}

