import './App.css';
import Form from './component/form';
import 'bootstrap/dist/css/bootstrap.min.css'; 

function App() {
  return (
    <div className="App">
      <header className="App-header">
      <h3>Etre organisé, c'est bien （＾∀＾●）ﾉｼ</h3>
      </header>
      <main className='card p-4 m-2'>
        <Form/>
      </main>
    </div>
  );
}

export default App;
