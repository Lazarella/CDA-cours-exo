import { createNativeStackNavigator } from "@react-navigation/native-stack"
import { NavigationContainer } from "@react-navigation/native"
import Home from './Component/Home'
import Detail from './Component/Detail'


const Stack = createNativeStackNavigator()

export default function (){
    return (
<NavigationContainer>
    <Stack.Navigator initialRouteName = 'Home'>
        <Stack.Screen name='Home' component={Home}></Stack.Screen>
        <Stack.Screen name='Detail' component={Detail}></Stack.Screen>
    </Stack.Navigator>
</NavigationContainer>

    )

}