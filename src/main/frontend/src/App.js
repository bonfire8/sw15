import { Routes, Route } from "react-router-dom";
import CarPage from "./pages/CarPage";
import Home from "./pages/Home";
import UserPage from "./pages/UserPage";
import BookPage from "./pages/BookPage";
import PayPage from "./pages/PayPage";
import ParkinglotPage from "./pages/ParkinglotPage";

function App() {

  return (
      <>
        <Routes>
            <Route element={<Home />} path="/"/>
            <Route element={<UserPage />} path="/user/:userId"/>
            <Route element={<BookPage />} path="/user/:userId/book"/>
            <Route element={<CarPage />} path="/user/:userId/car"/>
            <Route element={<PayPage />} path="/user/:userId/pay"/>
            <Route element={<ParkinglotPage />} path="/user/:userId/parkinglot"/>
        </Routes>
      </>
  );
}

export default App;