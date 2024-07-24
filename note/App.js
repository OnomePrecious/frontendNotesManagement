import './App.css';
import {BrowserRouter, Route, Routes} from "react-router-dom";
// import SignIn from "./signIn";
import LogIn from "./index.jsx";



function App() {
    return (
        <>
            <BrowserRouter>
                <Routes>
                    {/*<Route element={<SignIn/>} path="/sign-in"/>*/}
                    <Route element={<LogIn/>} path="/logIn"/>
                </Routes>
            </BrowserRouter>
        </>

    );
}

export default App;



