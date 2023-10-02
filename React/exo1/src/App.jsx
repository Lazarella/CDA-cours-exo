import './App.css';
import AlertComponent from './component/AlertComponent';
import AlertComponent2 from './component/ArlertComponent2';
import 'bootstrap/dist/css/bootstrap.min.css'; 
import 'bootstrap/dist/js/bootstrap.min.js';
import 'bootstrap-icons/font/bootstrap-icons.css';

function App() {
  return (
    <main>
      <header>
        <h1 className='display-1'>Exo Alert</h1>
        <hr />
        <AlertComponent/>
        <hr />
        <AlertComponent2/>
      </header>
    </main>
  );
}

export default App;
