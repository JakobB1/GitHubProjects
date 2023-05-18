import * as React from 'react';
import {Link} from 'react-router-dom';

function Menu() {

    return(
        <> 
        <Link to="/makes">
        Vehicle Makes
        </Link>
        <br/>
        <Link to="/models">
        Vehicle Models
        </Link>
        </>
    );
}


export { Menu };
