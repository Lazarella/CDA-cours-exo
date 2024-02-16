import './App.css';
import HomePage from './component/home';
import { ItemProvider } from './context/itemContext'; 

function App() {
  return (
    <ItemProvider> 
      <HomePage/>
    </ItemProvider>
  );
}

export default App;
