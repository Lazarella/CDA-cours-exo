
import './App.css';
import ProductList from './components/ProductList';
import 'bootstrap/dist/css/bootstrap.css';
// import AddBtn from './components/AddBtn'; 
import AddProduct from './components/AddProduct';


function App() {
  return (
    <div className="App">
      <h1 className='display-4 text-center m-4'>Un super shop</h1>
      <hr></hr>
      <main className='container d-flex align-items-center'>
        <section>
      <ProductList></ProductList>
      </section>
      <section className='m-4'>
        <AddProduct/>
      </section>
      </main>
      {/* <AddBtn></AddBtn> */}
    </div>
  );
}

export default App;
