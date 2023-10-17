import {useDispatch, useSelector} from "react-redux"
import { setAuthMode } from "./authSlice"
import { useRef } from "react"

const SignForm = () => {
    const autMode = useSelector (state => state.auth.authMode)
    const dispatch = useDispatch()

    const emailRef = useRef()
    const passwordRef = useRef()

    const submitFormHandler = async (event) => {
        event.preventDefault()
    }
}