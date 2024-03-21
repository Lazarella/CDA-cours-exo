import { Fragment } from "react"


const Todo =()=>{

    return(
        <fragmement>
        <div class="card" style="width: 18rem;">
  <img class="card-img-top" src="https://fastly.picsum.photos/id/340/200/300.jpg?hmac=JIWzQMzudGQJ5ZI2GIRg4NTwRI4fwA8k8xcnMvEmwcQ" alt="Card image cap"/>
  <div class="card-body">
    <h5 class="card-title">Titre Todo</h5>
    <p class="card-text">Description todo</p>
  </div>

  <table className="table">
        <thead>
          <tr>
            <th scope="col">#</th>
            <th scope="col">Name</th>
            <th scope="col">Price</th>
            <th scope="col" className='center'>Actions</th>

          </tr>
          </thead>
          <tbody>
    {tasks.map((task, index)=>(
        <tr key={task.emoji}>
         <th scope="row">{index + 1}</th>
         <td>{task.name}</td>
         <td>{task.description}</td>
         <td>{task.status}</td>
         <td><button class="btn btn-info">Détails</button></td>
         </tr>
    ))}
    </tbody>
    </table>
  <div class="card-body">
  <button type="button" class="btn btn-outline-danger">Danger</button>
    <a href="#" class="card-link">Another link</a>
  </div>
</div>
</fragmement>
    ); 
}