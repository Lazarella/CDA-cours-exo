import { Button, FlatList, Modal , View } from "react-native";


export default function TestModal({ visible, closeModal, list }){



    return (
        <Modal visible={visible}>
            <View>
                <Button title="Ajouter un article" onPress={closeModal}/>
                <FlatList
                    data={list}
                    renderItem={({itemData})=>{
                        return(
                            <View>
                                <Text style={styles.myitemList}>{itemData.item}</Text>
                            </View>
                        )
                    }}
                />
            </View>
        </Modal>
    )
}

const styles = StyleSheet.create({
    myitemList: {
        color: "white", 
        backgroundColor : "3D30A2"
    }
});