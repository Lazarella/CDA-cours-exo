import { View, Text, Button, } from 'react-native';

function Home({navigation, route}) {

    return (
    <View>
        <Text> Salut les petits potes </Text>
        <Button title='Flamme' onPress={() => navigation.navigate('Detail',{grade: "Capitain", Name : "Flamme", ship : "None"})}></Button>
        <Button title='Albator' onPress={() => navigation.navigate('Detail', {grade: "Capitain", Name : "Albator", ship : "Atlantis"})}></Button>
        <Button title='Ulysse' onPress={() => navigation.navigate('Detail',{grade: "Capitain", Name : "Ulysse", ship:"Odysseus"})}></Button>
    </View>
    );
}


export default Home;
