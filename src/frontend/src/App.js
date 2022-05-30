import { Button } from 'antd';
import { Rate } from 'antd';
import { getAllStudents } from './client';


import './App.css';


function App() {
    getAllStudents()
    // .then(res => res.json())
    .then(console.log)
  return (
    <div className="App">
      <Button type='primary'>Hello</Button>
      <Rate allowHalf defaultValue={2.5} />
    </div>
  );
  
}

export default App;
