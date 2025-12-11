import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import User from './components/user'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
    <User name="Anas" lastName="hawwash" age="40" color="black"  />
    <User name="omar" lastName="hawwash" age="10" color="green"  />

    </>
  )
}

export default App
