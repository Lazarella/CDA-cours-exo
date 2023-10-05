import { useState } from "react"
const formChronos = () => {

    const [chrono1, setChrono1] = useState("00:00");
    const [chrono2, setChrono2] = useState("00:00");
    const [chrono3, setChrono3] = useState("00:00");
    const [chrono4, setChrono4] = useState("00:00");
    const [chrono5, setChrono5] = useState("00:00");

    return(
        <>
        <h1>Bienvenue Maître du Temps</h1>
        <hr />
        <h6>Programmez vos chronomètres!</h6>
        <div>
            <label htmlFor="chrono1">Chnono #1</label>
            <input type="time" id="chrono1" name="chrono1" min="00:00" max="59:00" value={chrono1} onChange={(e) => setChrono1(e.target.value)} />
            <button onClick={editChrono}>Start</button>
            <label htmlFor="chrono1">Chnono #2</label>
            <input type="time" id="chrono2" name="chrono2" min="00:00" max="59:00" value={chrono2} />
            <button onClick={editChrono}>Start</button>
            <label htmlFor="chrono1">Chnono #3</label>
            <input type="time" id="chrono3" name="chrono3" min="00:00" max="59:00" value={chrono3} />
            <button onClick={editChrono}>Start</button>
            <label htmlFor="chrono1">Chnono #4</label>
            <input type="time" id="chrono4" name="chrono4" min="00:00" max="59:00" value={chrono4} />
            <button onClick={editChrono}>Start</button>
            <label htmlFor="chrono1">Chnono #5</label>
            <input type="time" id="chrono5" name="chrono5" min="00:00" max="59:00" value={chrono5} />
            <button onClick={editChrono}>Start</button>
        </div>
        
        </>
    )
}
export default formChronos