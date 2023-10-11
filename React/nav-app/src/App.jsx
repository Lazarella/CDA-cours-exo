import './App.css';
import Link from 'react-dom'
import Menu from './component/menu';

function App() {
  return (
    <div className="App">
      <Menu/>
      <Link to="/menu"/>

      <footer>
        <p>Yolo</p>
      </footer>
    </div>
  );
}

export default App;

