import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import { Route, Routes } from 'react-router-dom'
import Home from './components/Home'
import Say from './components/Say'
import Display from './components/Display'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>

      <Routes>
      <Route path='/home' element={<Home/>}/>
      <Route path='/:world' element={<Say/>}/>
      <Route path='/:world/:text/:bg' element={ <Display/>}/>
      </Routes>
    </>
  )
}

export default App
