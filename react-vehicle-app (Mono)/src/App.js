import logo from './logo.svg';
import './App.css';
import { Menu } from './Components/Menu';
import  VehicleMakeList from './Components/VehicleMakeList';
import VehicleModelList from './Components/VehicleModelList';
import {VehicleMakeEdit} from './Components/VehicleMakeEdit';
import {Routes, Route, Link} from 'react-router-dom';


function App() {



  return (
    <div className="App">
      <div style={{padding: "30px 20% 0 20%"}}>
        <Routes>
          <Route path="/" element={<Menu />}/>
          <Route path="/models" element={<VehicleModelList />}/>
          <Route path="/makes" element={<VehicleMakeList />}/>
          <Route path="/makes/edit/:makeId" element={<VehicleMakeEdit />}/>
        </Routes>
        {/* <VehicleMakeList />
        <div />
        <VehicleModelList /> */}
      </div>

    </div>
  );
}

export default App;
