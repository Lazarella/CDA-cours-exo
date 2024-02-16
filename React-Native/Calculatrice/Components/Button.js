import { Pressable, StyleSheet } from "react-native";

export default function Button(props){


    
    return(
        <Pressable onPress={props.txValue} style={props.isButtonWhite? styles.whiteButton: styles.blackButton }>
            <View>
                <Text style={props.isButtonWhite? styles.whiteTxButton: styles.blackTxButton }>{props.text}</Text>
            </View>
        </Pressable>
    )
}

const styles = StyleSheet({
    whiteButton: {
        width: 20, 
        height : 20, 
        backgroundColor : "F6F1EE",
        borderRadius : 40
    },
    whiteTxButton: {
        color:"4F4A45",
        fonSize: 22
    },
    blackButton: {
        width: 20, 
        height : 20, 
        backgroundColor : "4F4A45",
        borderRadius : 10
    },
    blackTxButton: {
        color:"F6F1EE",
        fonSize: 22
    }
})



