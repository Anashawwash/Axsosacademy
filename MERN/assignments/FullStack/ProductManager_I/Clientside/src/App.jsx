import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import CreatePro from './components/Create'
import CreateForm from './components/CreateForm'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      <CreateForm/>
      <CreatePro/>
    </>
  )
}

export default App
