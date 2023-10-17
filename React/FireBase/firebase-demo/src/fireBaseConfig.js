// Import the functions you need from the SDKs you need
import { initializeApp } from "firebase/app";
import { getAnalytics } from "firebase/analytics";
// TODO: Add SDKs for Firebase products that you want to use
// https://firebase.google.com/docs/web/setup#available-libraries

// Your web app's Firebase configuration
// For Firebase JS SDK v7.20.0 and later, measurementId is optional
const firebaseConfig = {
    apiKey: "AIzaSyAjSQcU1ElmRlMZjviVWAo3cBQ6a8UCBOw",
    authDomain: "cda-carpier.firebaseapp.com",
    databaseURL: "https://cda-carpier-default-rtdb.europe-west1.firebasedatabase.app",
    projectId: "cda-carpier",
    storageBucket: "cda-carpier.appspot.com",
    messagingSenderId: "1015173067990",
    appId: "1:1015173067990:web:e5eb6d8676673c53530577",
    measurementId: "G-4X2RQW0XHB"
};
export const Base_DB_URL = firebaseConfig.databaseURL
export const SIGN_UP_URL = `https://identitytoolkit.googleapis.com/v1/accounts:signUp?key=${firebaseConfig.apiKey}`
export const SIGN_IN_URL = `https://identitytoolkit.googleapis.com/v1/accounts:signInWithPassword?key=${firebaseConfig.apiKey}`


// Initialize Firebase
const app = initializeApp(firebaseConfig);
const analytics = getAnalytics(app);

