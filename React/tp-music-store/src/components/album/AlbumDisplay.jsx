import React from "react"
import {useDispatch, useSelector} from "react-redux"
import { setFormMode, setSelectedAlbum} from "./albumItemsSlice"
import PropTypes from "prop-types"

const AlbumDisplay = (props)=> {

    const albumItems =  props.albumItems
    const dispatch = useDispatch()
    const user = useSelector(state => state.auth.user)
    const altContent = `cover ${albumItems.title} by ${albumItems.artist}`
    let totalScore = 666;

    const editalbumItemsHandler=()=> {
        dispatch(setSelectedAlbum(albumItems))
        dispatch(setFormMode("edit"))
    }

    const deletealbumItemsHandler =()=> {
        dispatch(setSelectedAlbum(albumItems))
        dispatch(setFormMode("delete"))
    }

    AlbumDisplay.propTypes = {

        albumItems: PropTypes.shape({
        id: PropTypes.string.isRequired,
        title: PropTypes.string.isRequired,
        releaseDate: PropTypes.string.isRequired,
        artist: PropTypes.string.isRequired,
        cover: PropTypes.string.isRequired,
        }).isRequired,
    };

    return(
                <section className="albumItemsItemCard">
                    <img src={albumItems.cover} alt={altContent} />
                    <h5>{albumItems.title}</h5>
                    <p>Release : {albumItems.releaseDate}</p>
                    <hr />
                    <h5>{albumItems.artist}</h5>
                    <section className="ranking">{totalScore}</section>
                    <hr />
                    {
                        user &&
                        <section className="sectionAdmin">
                            <button onClick={() =>editalbumItemsHandler()}>
                                Edit
                            </button>
                            <button onClick={() => deletealbumItemsHandler()}>
                                Delete
                            </button>
                        </section>
                    }
                </section>
    )
}

export default AlbumDisplay