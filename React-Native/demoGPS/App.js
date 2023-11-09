import { StyleSheet, Text, View } from 'react-native'
import React, { useEffect, useState } from 'react'
import Geolocation from '@react-native-community/geolocation'
import axios from 'axios'


// npm i @react-native-community/geolocation
// ajout de la ligne : <uses-permission android:name="android.permission.ACCESS_FINE_LOCATION" />
// dans le repertoire android/app/src/main/AndroidManifest.xml


export default function App() {

  const baseUrl = "http://dataservice.accuweather.com/"  //locations/v1/cities/geoposition/search"
  const apiKey = "blN05P6feZx2yXlDwtBteGSnofscmqoC"
  
  const [latitude, setLatitude] = useState(null)
  const [longitude, setLongitude] = useState(null)
  const [mydata, setMyData] = useState(null)
  
  
  useEffect(() => {
    Geolocation.requestAuthorization()
    Geolocation.getCurrentPosition(position => {
      setLatitude(position.coords.latitude)
      setLongitude(position.coords.longitude)
    },
    error => console.log(error),
    {enableHighAccuracy : true, timeout : 20000,maximumAge : 1000 }
    )
  },[])
  
  axios.get({baseUrl}+'/'+{apiKey}+'/'+{latitude}+{longitude}+"/").then((response) => {
    console.log(response.data);
  });

  

  return (
    <View>
      <Text>Latitude : {latitude}</Text>
      <Text>Latitude : {longitude}</Text>
      <Text>cities:  {"localizeNAme"}</Text>
      <Text>Latitude : {DataSet.AirQualityForecast}</Text>

    </View>
  )
}

const styles = StyleSheet.create({})