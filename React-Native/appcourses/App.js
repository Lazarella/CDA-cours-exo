import { Button, FlatList, StyleSheet, Text, View, Pressable } from 'react-native'
import React, { useState } from 'react'
import ModalInput from './component/ModalInput'
import Article from './component/Article'

export default function App() {
    const [modalIsVisible,setModalIsVisible] = useState(false)
    const [articles,setArticles] = useState([])

    function addArticle(article){
        setArticles(articlesCurrent => [
            ...articlesCurrent,
            { text : article , id : Math.random().toString()}
        ])
        setModalIsVisible(false) //  closeModale()
    }

    function closeModale(){
        setModalIsVisible(false)
    }

    function openModale(){
        setModalIsVisible(true)
    }

    function deleteArticle(id){
      setArticles(prevlist => prevlist.filter((i)=>i.id !== id))
      //prevlist ou articlesCurrent on la même fonction, représenter la liste au moment ou la fonction s'execute
    }

  return (
    <View style={styles.container}>
      <Button title='Add Article' onPress={openModale} />
      <ModalInput visible={modalIsVisible} closeModale={closeModale} addArticle={addArticle}></ModalInput>
      <FlatList
        data={articles}
        renderItem={({ item }) => (
          <Article item={item} deleteArticle={deleteArticle} />
        )}
        keyExtractor={(item, index) => item.id}
      />
    </View>
  )
}

const styles = StyleSheet.create({
    container : {
        flex : 1,
        paddingTop :20,
        paddingHorizontal : 16,
    }
})