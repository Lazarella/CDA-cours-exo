
// import  Modal from './components/shared/Modal'
import './App.css'
import AlbumForm from './components/album/AlbumForm'
import NavBar from './components/shared/NavBar'
import { useDispatch, useSelector} from 'react-redux'
import { useEffect } from 'react'
import { fetchAlbums } from './components/album/albumItemsSlice'
import AlbumDisplay from './components/album/AlbumDisplay'


function App() {
  
  const user = useSelector((state) => state.auth.user)
  const formMode = useSelector((state) => state.albumItems.formMode)
  const albumItems = useSelector((state) => state.albumItems.albumList)
  const dispatch = useDispatch()



  useEffect(() => {
    dispatch(fetchAlbums())
  },[ dispatch])

  return (
    <>
    <NavBar/>
{/* <Modal> */}

    <AlbumForm/>
{/* </Modal> */}

    <main className='container'>
      <section className='titleDisplay'>
        <h3>Discover the Epic Sound of Metal through Our Records</h3>
      </section>
      <hr />
      {
        albumItems.length === 0? 
        <caption>
        <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQmCx7VvEhRNPkD02mscG-mSpd5zBsf7pTDLQ&usqp=CAU" alt="kitty sleeping on a guitar" />
        <figcaption><p>It&apos;s a peach perfect silence here</p></figcaption>
        </caption> : albumItems.map((al) => <AlbumDisplay key={al.id} album={al} />)
      }

    </main>
    </>
  )
}

export default App
