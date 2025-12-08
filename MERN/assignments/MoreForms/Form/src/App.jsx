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
    <Login label ="FristName" type="text" setlabel ={setFName} length={2} />
    <Login label ="LastName"  type="text" length={2} setlabel ={setLName}/>
    <Login label ="Email" type="text" setlabel ={setEmail} length={5}/>
    <Login label ="Password"  type={"password"} setlabel ={setPassword} length={8}/>
    <Login label ="Confirm Password"  type={"password"} setlabel ={setCPassword}  length={8} isConfirm={passowrd} />

    </>
  )
}

export default App
