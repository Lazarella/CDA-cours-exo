import { Image, Text, View, StyleSheet } from "react-native";


const typeColors = {
    fire: '#FDDFDF',
    grass: '#DEFDE0',
    electric: '#FCF7DE',
    water: '#DEF3FD',
    ground: '#f4e7da',
    rock: '#d5d5d4',
    fairy: '#fceaff',
    poison: '#98d7a5',
    bug: '#f8d5a3',
    dragon: '#97b3e6',
    psychic: '#eaeda1',
    flying: '#F5F5F5',
    fighting: '#E6E0D4',
    normal: '#F5F5F5'
    // Couleurs selon le type
};

export default function PokemonCard({sprites, name, types}){

    console.log({ sprites, name, types }); 


const backgroundColor = types && types.length > 0 ? typeColors[types[0].type.name]: 'white'

    return(
        
        <View style= {[styles.container, {backgroundColor}]}>
            <Image
        style = {styles.avatar}
        source = {{
            uri: sprites
        }}
        />
                <Text>
                    {name}
                </Text>
                {types && types.map((type, index) => (
                <Text key={index}>{type.type.name}</Text>
            ))}
        </View>
    )
        
}
const styles = StyleSheet.create({
    container:{
        height: 100,
        borderRadius : 8,
        padding:10,
        flex: 3, 
    },
    avatar:{
        width: 50,
        height: 50,
        alignSelf: 'left' ,
    },
    
})