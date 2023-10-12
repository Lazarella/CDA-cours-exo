import './App.css';
import HomePage from './component/home';
import { ItemProvider } from './context/itemContext'; // Correct import

function App() {
  return (
    <ItemProvider> 
      <HomePage></HomePage>
    </ItemProvider>
  );
}

export default App;
