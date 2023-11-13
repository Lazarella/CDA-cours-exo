import { View } from "react-native";


export default function PokemonCard(){

    return(
        
        <View style= {styles.container}>
            <Image
        style = {styles.avatar}
        source = {{
            uri:{pic}
        }}
        />
                <Text>
                    {name}
                </Text>
                <Text>
                {type}
                </Text>
        </View>
    )
        
}
const styles = StyleSheet.create({
    container:{

    },
    avatar:{
        width: 50,
        height: 50,
    },

})