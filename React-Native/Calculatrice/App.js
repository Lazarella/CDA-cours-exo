/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 */

import React from 'react';
import {
  SafeAreaView, StyleSheet,
} from 'react-native';
import Calculator from './Components/Calculator.js';




function App() {

  return (
    <SafeAreaView style={styles.background}>
      <Calculator/>
    </SafeAreaView>
  );
}

const styles = StyleSheet.create({
  background:{
    flex:1,
    backgroundColor:"black",
  }
});

export default App;