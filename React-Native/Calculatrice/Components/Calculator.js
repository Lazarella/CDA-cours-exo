import { StyleSheet, Text, View } from 'react-native'
import React, { useState } from 'react'
import Button from './Button'

export default function Calculator(){

    const [lastCalcul, setLastCalcul] = useState("")
    const [calcul, setCalcul] = useState("")
    const [lastOperator, setLastOperator] = useState(true)

    const btnTab = [
        {txValue:"Ac", isButtonWhite: false,id:1},
        {txValue:"^", isButtonWhite: false, id:2},
        {txValue:"%", isButtonWhite: false, id:3},
        {txValue:"/", isButtonWhite: false, id:4},
        {txValue:"7", isButtonWhite: true, id:5},
        {txValue:"8", isButtonWhite: true, id:6},
        {txValue:"9", isButtonWhite: true, id:7},
        {txValue:"x", isButtonWhite: false, id:8},
        {txValue:"4", isButtonWhite: true, id:9},
        {txValue:"5", isButtonWhite: true, id:10},
        {txValue:"6", isButtonWhite: true, id:11},
        {txValue:"-", isButtonWhite: false, id:12},
        {txValue:"1", isButtonWhite: true, id:13},
        {txValue:"2", isButtonWhite: true, id:14},
        {txValue:"3", isButtonWhite: true, id:15},
        {txValue:"+", isButtonWhite: false, id:16},
        {txValue:".", isButtonWhite: true, id:17},
        {txValue:"0", isButtonWhite: true, id:18},
        {txValue:"Del", isButtonWhite: true, id:19},
        {txValue:"=", isButtonWhite: false, id:20}
    ]

    const operator = ["/","-","+",".","X"]

    const addText=(text)=>{
        if(text==="Ac"){
        setCalcul("")
        setLastOperator(true)
        }
        else if(text==="Del"){
        setCalcul(calcul.substring(0,calcul.length-1))
        if(operator.find(e=> e === calcul[calcul.length-2])){
            setLastOperator(true)
        }
        else{
            setLastOperator(false)
        }
        }
        else if (text === "="){
        setLastCalcul(calcul)
        setCalcul(eval(calcul))
        setLastOperator(false)
        }
        else{
        if(operator.find(e => e === text) && !lastOperator){
            setLastOperator(true)
            if(text === "X"){
            setCalcul(calcul+"*")
            }
            else{
            setCalcul(calcul+text)
            }
        }
        else{
            if( operator.find(e => e === text) === undefined){
            setCalcul(calcul+text)
            setLastOperator(false)
            }
            }
        }
    }
    
        return (
            <View style={styles.globalContainer}>
                <Text style={styles.containerTitle}>Calculatrice</Text>
                <View style={styles.textContainer}>
                <Text style={styles.text}>{lastCalcul}</Text>
                <Text style={[styles.text,textWidth]}>{calcul === ""?0:calcul}</Text>
            </View>
            <View style={styles.btnContainer}>
                {btnTab.map(btn => <Button addText={addText} key={btn.id} txValue={btn.txValue} id={btn.id} isButtonWhite={btn.isButtonWhite}/>)}
            </View>
            </View>
        )
}
    const styles = StyleSheet.create({
        globalContainer:{
            flexDirection:"column",
            justifyContent:"space-evenly",
            alignItems:"center"
        },
        containerTitle:{
            color:"white",
            fontSize:35
        },
        btnContainer:{
        justifyContent:"space-evenly",
            width:"95%",  
            flexDirection:"row",
            flexWrap:"wrap",
        },
        textContainer:{
            marginTop:"10%",
            marginBottom:"20%",
            height:"20%",
            width:"100%",
            flexDirection:"column",
            alignItems:"flex-end"
        },
        text:{
            marginRight:"5%",
            color:"white"
        },
        })