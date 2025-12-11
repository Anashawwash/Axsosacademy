import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import Usercard  from './components/userCard'

function App() {
  const [count, setCount] = useState(0)

  return (
  <>
  <Usercard firstName = "anas" lastname = "hawwash" age ="20" color = "black"/>
  <Usercard firstName = "omar" lastname = "hawwash" age ="23" color = "whait"/>
  <Usercard firstName = "osama" lastname = "hawwash" age ="20" color = "black"/>
  <Usercard firstName = "anas" lastname = "hawwash" age ="20" color = "black"/>

  </>
  )
}

export default App
