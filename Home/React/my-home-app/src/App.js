import logo from './logo.svg';
import './App.css';
import logoPika from './Pikatchu.png'; 

const AppLink = () => {
  const variable = "React";
  return(
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React {9*3} et +
        </a>
  )
}

const Logo = () => <img id="logo" src={logo} className="App-logo" alt="logo" />


function App() {
  const handleOnClick = (svg) => {
    const logo = document.getElementById("logo")
    logo.src =svg;

  }
  return (
    <div className="App">
      <header className="App-header">
        <p>
          Edit <code>src/App.js</code> and save to reload.
          <Logo svg={logo}/>
          
          
        </p>
        <AppLink/>
        <button onClick={() =>handleOnClick(logo)}>Blue</button>
        <button onClick={() => handleOnClick(logoPika)}>Pink</button>
      </header>
    </div>
  );
}

export default App;
