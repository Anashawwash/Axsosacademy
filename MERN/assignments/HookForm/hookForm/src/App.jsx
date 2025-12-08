import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import Login from './components/Login'

function App() {
  const [fName,setFName] = useState("")
  const [lName,setLName] = useState("")
  const [email,setEmail] = useState("")
  const [passowrd,setPassword] = useState("")
  const [cPassowrd,setCPassword] = useState("")


  return (
    <>
    <div >
    <Login label ="FristName" type="text" setlabel ={setFName}/>
    <Login label ="LastName"  type="text" setlabel ={setLName}/>
    <Login label ="Email" type="text" setlabel ={setEmail}/>
    <Login label ="Password"  type={"password"} setlabel ={setPassword}/>
    <Login label ="Confirm Password"  type={"password"} setlabel ={setCPassword} />
    </div>
    <h1>Your Form Data</h1>

    </>
  )
}

export default App
