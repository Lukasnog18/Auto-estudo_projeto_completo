import axios from "axios";

export const api = axios.create({
    baseURL: "http://localhost:8090",
    // timeout: 500
});

export default api;