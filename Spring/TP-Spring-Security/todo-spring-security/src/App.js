import './App.css';
import { Router,Routes, Route } from 'react-router-dom';
import { DashBoard } from './component/Dashboard';

function App() {
  <Router>
    <Routes>

   <Route path="/login" element={<Login />} /> 
   <Route path="/dashboard" element={
     <ProtectedRoute>
       <DashBoard />
     </ProtectedRoute>
   } />
  
    </Routes>
  </Router>
}

export default App;
