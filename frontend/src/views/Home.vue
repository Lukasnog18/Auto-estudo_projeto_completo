<template>
    <div class="home">
        <img src="../assets/logo.png" alt="logo vue" width="120" />
        <h2>Listando os contatos da agenda</h2>
        <div>
            {{ contatos }}
        </div>
    </div>    
</template>

<script setup>
import api from '../services/api';
import { onMounted, ref } from 'vue';


const contatos = ref([]);

    const fetchContatos = () =>
        api
            .get("/contatos/")
            .then((response) => (contatos.value = response.data.results));
        
    onMounted(fetchContatos);
    
</script>
