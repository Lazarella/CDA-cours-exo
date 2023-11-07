import { Button, StyleSheet, TextInput, View, Image, TestModal } from "react-native"
import { useState } from "react"

export default function CardMenu(){

    const [list, setList] = useState([]);
    const [listInput, setListInput] = useState('')
    const [modalVisible, setModalVisible] = useState(false)

    function addItem() {
        setList(prevList => [...prevList, { text: listInput, id: Date.now() }]);
        setListInput('');
        console.log(list);
    }

    function closeModal(){
        console.log("Close Modal")
        setModalVisible(false)
    }

    function deleteItem(id){
        setList(prevList => prevList.filter(item => item.id !== id));
    }

    return(
        <View style={styles.container}>
            <Image
            style={styles.logo}
            source={{
                uri:'https://www.super-hobby.fr/zdjecia/0/1/3/39296_rn.png'
            }}
            />
            <TextInput value={listInput} 
                onChangeText={setListInput}
                placeholder="Feu de forêt" 
                style={styles.myInput}></TextInput>
            <Button title="Ajouter un article" onPress={addItem} ></Button>
            <Button title="Cancel" onPress={() => deleteItem(item.id)}></Button>
            <TestModal visible={modalVisible} closeModal={closeModal}></TestModal>
        </View>
    )
}

const styles = StyleSheet.create({
    container: {
        flex:1,
        gap: 20,
        alignItems:"center"
    },
    logo:{
        height:60, 
        width : 60, 
    }, 
    myInput : {
        borderColor : "grey"
    }, 
})
