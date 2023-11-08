import { StyleSheet, Text, View } from 'react-native'
import React from 'react'

export default function Detail({route, navigation}) {
    const grade = route.params.grade
    const contactName = route.params.Name
    const ship = route.params.ship

return (
    <View>
        <Text>Coucou Copain</Text>
      {/* <Text>{route.params.grade}</Text> */}
        <Text>Rang</Text>
        <Text>{grade}</Text>
      {/* <Text>{route.params.Name}</Text> */}
        <Text>Nom</Text>
        <Text>{contactName}</Text>
      {/* <Text>{route.params.ship}</Text> */}
        <Text>Vaisseau</Text>
        <Text>{ship}</Text>
    </View>
)
}

const styles = StyleSheet.create({})