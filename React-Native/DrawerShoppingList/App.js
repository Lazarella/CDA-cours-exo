import { createDrawerNavigator } from '@react-navigation/drawer'
import React from 'react';
import { View, Text, StyleSheet } from 'react-native';
import { NavigationContainer } from '@react-navigation/native';
import Home from './screens/Home'; 
import Detail from './screens/Detail'
import Form from './screens/Form' 

const Drawer = createDrawerNavigator()

export default function App () {
    return (
        <NavigationContainer>
            <Drawer.Navigator initialRouteName="Home">
            <Drawer.Screen name="Home" component={Home}></Drawer.Screen>
            <Drawer.Screen name="Detail" component={Detail}></Drawer.Screen>
            <Drawer.Screen name="Form" component={Form}></Drawer.Screen>
            </Drawer.Navigator>
        </NavigationContainer>
    )
}

const styles = StyleSheet.create({
    container: {

    },
});




