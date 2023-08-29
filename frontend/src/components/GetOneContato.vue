<template>
    <div>
        <h2>Buscar um contato</h2>
        <div class="input-container">
            <label for="id"></label>
            <input type="text" id="id" name="id" v-model="id" placeholder="Digite o id do contato">
        </div>
        <div>
            <button @click="getOneContato">Buscar</button>
        </div>
        <p v-if="contato.id">O contato de id {{ id }} é: {{ contato }} </p>
        <!-- <p v-else>id {{ id }} não encontrado</p> -->
    </div>
</template>

<script setup>
import api from '../services/api';
import { ref } from 'vue';

let id = "";

const contato = ref([]);

    const getOneContato = () =>
        api
            .get(`/contatos/${id}`)
            .then((response) => (contato.value = response.data));
    
    // onMounted(getOneContato)
</script>