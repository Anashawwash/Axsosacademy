import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import CreatePro from './components/Create'
import CreateForm from './components/CreateForm'
import { Routes, Route, Link } from 'react-router-dom'
import ShowPro from './components/showPro'
function App() {
  const [count, setCount] = useState(0)
  const [boo, setBoo] = useState(false)

  return (
    <>
    <Routes>
      <Route path='/' element={
        <div>
          <CreateForm setStaatus= {setBoo} status ={boo} />
          <CreatePro status = {boo} />
          </div>
      }/>
    <Route path='/product/:id' element={<ShowPro/>}/>
  </Routes>

    </>
  )
}

export default App
