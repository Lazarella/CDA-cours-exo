import { View, Text, StyleSheet, ImageBackground,  } from "react-native"
import { TouchableHighlight } from "react-native"
export default function Home ({navigation}) {

    const message = "Attrapez les tous!"

    const image = {uri:'../Assets/meadowPixelOne.png'};

    return (
        <View style={styles.container}>
        <ImageBackground source={image} resizeMode="cover" style={styles.image}>
        <Text style= {styles.title}>{message}</Text>
        <View numColumns={2} style={styles.btnBox}>
        <TouchableHighlight onPress={()=>navigation.navigate("PokemonList")} style={styles.btnPokemon}>
            <Text style={styles.btnTitle1}>
                Pokemons 
            </Text>
        </TouchableHighlight>
        <TouchableHighlight onPress={()=>navigation.navigate("PokedexList")} style={styles.btnPokemonPokedex} >
            <Text style={styles.btnTitle2}>
                Pokedex
            </Text>
        </TouchableHighlight>
        </View>
        </ImageBackground>
        </View>
    )
}
const styles = StyleSheet.create({
    container:{
        flex: 1,      
    },
    btnBox:{
        flexDirection: 'row',
        flexWrap: 'wrap', 
        justifyContent: 'center',
        gap: 30,
        
    } ,
    title: {
        fontWeight: 'bold',
        fontSize: 24,
        margin: 8,
        textAlign: 'center',
        color: '#001B79',
    },
    btnTitle1: {
        fontWeight: 'bold',
        fontSize: 24,
        textAlign: 'center',
        color: '#FFC436',
        padding : 10
    },  
    btnPokemon: {
        borderRadius: 8,
        backgroundColor: '#001B79', 
        
    },
    btnPokemonPokedex: {
        borderRadius: 8,
        backgroundColor: '#FFC436',
    }, 
    btnTitle2: {
        fontWeight: 'bold',
        fontSize: 24,
        textAlign: 'center',
        color: '#001B79',
        padding : 10
    }, 
    image: {
        felx: 1,
        justifyContent: 'center',
    }
})