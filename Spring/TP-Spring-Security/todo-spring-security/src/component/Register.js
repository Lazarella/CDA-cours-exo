import { useState } from "react";
import { useNavigate } from "react-router-dom";





const Register = () => {
    const navigate = useNavigate();
    const [file, setFile] = useState();
    const [uploadProgress, setUploadProgress] = useState(0);
    const [userData, setUserData] = useState({
      name: '', // Assurez-vous que ce n'est pas undefined
      email: '', // Assurez-vous que ce n'est pas undefined
      password: '',
      roles: 'ROLE_USER', // Une valeur par défaut, pour éviter undefined
  });
    const handleChange = (e) => {
      const { name, value } = e.target;
      setUserData(prevState => ({
        ...prevState,
        [name]: value
      }));
    };
  


    const handleFileChange = (e) => {
        setFile(e.target.files[0]);
    };

    const handleSubmit = async (e) => {
        e.preventDefault();
        const formData = new FormData();
        formData.append('name', userData.name);
        formData.append('email', userData.email);
        formData.append('password', userData.password);
        formData.append('roles', userData.roles);
        formData.append('avatar', file); 

        try {
            await authService.register(formData);
            console.log('User registered successfully');
            navigate('/login');
        } catch (error) {
            console.error('Error registering user:', error);
        }
    };
  
    return (
      <div className="container mt-5">
        <h2>Inscription</h2>
        <form onSubmit={handleSubmit}>
          <div className="mb-3">
            <label htmlFor="name" className="form-label">Nom</label>
            <input
              type="text"
              className="form-control"
              id="name"
              name="name"
              value={userData.name}
              onChange={handleChange}
              required
            />
          </div>
          <div className="mb-3">
            <label htmlFor="email" className="form-label">Email</label>
            <input
              type="email"
              className="form-control"
              id="email"
              name="email"
              value={userData.email}
              onChange={handleChange}
              required
            />
          </div>
          <div className="mb-3">
            <label htmlFor="password" className="form-label">Mot de passe</label>
            <input
              type="password"
              className="form-control"
              id="password"
              name="password"
              value={userData.password}
              onChange={handleChange}
              required
            />
          </div>
          <div className="mb-3">
            <label htmlFor="role" className="form-label">Rôle</label>
            <select
              className="form-control"
              id="roles"
              name="roles"
              value={userData.roles}
              onChange={handleChange}
              required
            >
              <option value="ROLE_USER">Utilisateur</option>
              <option value="ROLE_ADMIN">Administrateur</option>
            </select>
          </div>
          <div class="form-group">
    <label htmlFor="file">Example file input</label>
    <input 
                    type="file" 
                    className="form-control-file" 
                    onChange={handleFileChange} 
                    id="file"
                />
  </div>
          <button type="submit" className="btn btn-primary">S'inscrire</button>
        </form>
      </div>
    );
}

  
  export default Register;