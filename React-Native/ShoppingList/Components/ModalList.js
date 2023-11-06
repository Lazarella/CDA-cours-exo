import { Button, FlatList, Modal , View } from "react-native";


export default function TestModal({ visible, closeModal, list }){



    return (
        <Modal visible={visible}>
            <View>
                <Button title="Ajouter un article" onPress={closeModal}/>
                <FlatList>
                    data={list}
                    renderItem={(item)=>{
                        return(
                            <View>
                                <Text style={styles.myitemList}>{item.text}</Text>
                            </View>
                        )
                    }}
                </FlatList>
            </View>
        </Modal>
    )
}

const styles = StyleSheet.create({
    myitemList: {
        color: "white", 
        background : "3D30A2"
    }
});