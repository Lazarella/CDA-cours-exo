
let styleAlert = "alert alert-primary"
let myTx = " Ceci est un message à l'attention de tous"
let myIcon = "bi bi-info-circle-fill"

const AlertComponent =() =>{
    return (
        <div className={styleAlert} role="alert">
            <i className={myIcon}></i>{myTx}
        </div>
    )
}

export default AlertComponent