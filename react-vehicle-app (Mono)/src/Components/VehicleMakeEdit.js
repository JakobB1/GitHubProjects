import * as React from 'react';
import { useParams } from 'react-router-dom';


function VehicleMakeEdit() {

    const [vehicleMake, setVehicleMake] = React.useState({});

    let params = useParams();

    function refreshData() {
        fetch(`https://api.baasic.com/v1/vehicleApp/resources/VehicleMake/${params.makeId}`)
        .then(response => response.json())
        .then(data => {
            setVehicleMake(data)
        })
    }

    
    React.useEffect(() => {
        refreshData()
    }, [])

    return (

        <p>
            {params.makeId}
            VehicleMakeEdit
            {vehicleMake.name}
        </p>

    );
}


export { VehicleMakeEdit };
