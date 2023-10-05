
import './App.css';
import { CardContext } from './contexts/cardContext';
import DisplayCard from './component/displayCard';
import AddForm from './component/addForm';

function App() {
  return (
    <div className="App">
      <CardContext.Provider value = "card" >
        <AddForm/>
        <div className="container">
      <DisplayCard/>
        </div>
      </CardContext.Provider>
    </div>
  );
}

export default App;
