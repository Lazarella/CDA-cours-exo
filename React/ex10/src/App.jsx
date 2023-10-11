import './App.css';
import {Link} from 'react-router-dom'
import Home from './routes/Home';
import 'bootstrap/dist/css/bootstrap.min.css';  

function App() {
  
  // const handleNavLinkClasses = ({isActive, isPending}) => {
  //   return isPending ? "pending-class" : isActive ? "active-class" : ""
  // }
  return (
    <div className="App">
      <header className="App-header">
        <nav>
        <Link to="/app" >Accueil</Link>
        <Link to="/contact" >Contact</Link>
        </nav>
      </header>
      <Home/>
    </div>
  );
}

export default App;
