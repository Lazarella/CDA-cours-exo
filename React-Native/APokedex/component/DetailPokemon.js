import { StyleSheet, View, Text, Image } from "react-native"

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

export default function DetailPokemon({ sprite, name, types, weight, height, description}) {

    const backgroundColor =types && types.length > 0 ? typeColors[types[0].type.name]: 'white'
    
    const cm = Math.round(height*30.48)
    const kg = Math.round(weight/2.2046)

    return( 
        
        <View style= {styles.container}>
            <View styles={[styles.header, {backgroundColor}]}>
            <Text>
                {name}
            </Text>
            {types && types.map((type, index) => (
            <Text key={index}>{type.type.name}</Text>
        ))}
            <Image
        style = {styles.avatar}
        source = {{
            uri: sprite
        }}
        />
        </View>
            <View style={styles.measurement}>
                <Text>
                Height : {height}fts({cm})
                </Text>
                <Text>
                    Weight : {weight}lbs({kg}) 
                </Text>
            </View>
        </View>
    )

}
const styles = StyleSheet.create({
    container: {
        flex: 1,
        padding: 10,
    },
    header: {

    },
    measurement:{

    }

})