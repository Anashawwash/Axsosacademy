import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import { Routes,Route } from 'react-router-dom'
import Landing from './components/Lnding'
import NewAuthor from './components/NewAuthor'


function App() {

  return (
    <>
      <h1 className={"m-5 text-6xl"}>Favorite authors</h1>

      <Routes>
        <Route path='/' element={<Landing/>}/>
        <Route path='/author/new' element={<NewAuthor/>}/>




      </Routes>
    </>
  )
}

export default App
