import { NavigationContainer } from "@react-navigation/native";
import { createNativeStackNavigator } from "@react-navigation/native-stack";
import PageA from './Component/PageA'
import PageB from './Component/PageB'
import PageC from './Component/PageC'


const Stack = createNativeStackNavigator()

export default function App(){
    return(
        <NavigationContainer>
            <Stack.Navigator initialRouteName='PageC'>
            <Stack.Screen name="PageA" component={PageA}></Stack.Screen>
            <Stack.Screen name="PageB" component={PageB}></Stack.Screen>
            <Stack.Screen name="PageC" component={PageC}></Stack.Screen>
            </Stack.Navigator>       
        </NavigationContainer>
    )
    }