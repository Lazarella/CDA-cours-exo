import MyStyle from './AlertComponent.module.css'


const AlertComponent2=(myprop)=>{
    let myAlert = myprop?.info??MyStyle.fallBack
    let myTx = "Ceci est aussi un message"
return(
<>
<div style={{backgroundColor:myAlert.info}}>{myTx}</div>
<div className= {MyStyle.info}>{myTx}</div>
</>
)
}
export default AlertComponent2