import { Pressable, StyleSheet, Text, View } from 'react-native'
import React from 'react'

export default function Article(props) {

  // function deleteArticle(id){
  //   props.setArticles(prevlist => prevlist.filter((i)=>i.id !== id))
  // }

  return (
    <View style={styles.articleItem}>
      <Pressable onPress={() => props.deleteArticle(props.item.id)}>
      <Text style={styles.articleText}>{props.item.text}</Text>
    </Pressable >
    </View>
  )
}

const styles = StyleSheet.create({
    articleItem: {
        margin: 8,
        padding: 8,
        borderRadius: 6,
        backgroundColor: '#5e0acc',
      },
      articleText: {
        color: "white",
      }
})