import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import Create from './components/Create'

function App() {
  const [list, setList] = useState([])


  return (
    <>
    <Create list={list} setList = {setList} />
    </>
  )
}

export default App
