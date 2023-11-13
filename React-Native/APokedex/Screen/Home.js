import { View, Text, StyleSheet } from "react-native"
import { TouchableHighlight } from "react-native-gesture-handler"

export default function Home (navigation) {

    const message = "Bienvenue jeune maître Pokémons"

    return (
        <View>
        <Text>{message}</Text>
        <TouchableHighlight onPress={navigation.navigate("PokemonList")}>
            <Text>
                Pokemons 
            </Text>
        </TouchableHighlight>
        {/* <TouchableHighlight>  BONUS PART
            <Text>
                Pokedex
            </Text>
        </TouchableHighlight> */}
        </View>
    )
}
const styles = StyleSheet.create({
    
})