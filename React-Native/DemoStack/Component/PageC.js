
import { View, Text, Button } from 'react-native';
import React from 'react'

export default function PageC (navigation) {

    return (
    <View>
        <Text>Hello World </Text>
        <Button title='Go to PageA' onPress={() => navigation.navigate("PageA")}></Button>
    </View>
    );
}
