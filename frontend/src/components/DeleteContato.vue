<template>
    <div>
        <h2>Deletar um contato</h2>
        <div class="input-container">
            <label for="id"></label>
            <input type="text" id="id" name="id" v-model="id" placeholder="Digite o id do contato que deseja deletar">
        </div>
        <div>
            <button @click="deleteContato">Deletar</button>
        </div>
        <div v-if="contato.id">
            <p><b>O contato</b></p>
            <p> {{ contato }} </p>
            <p><b>foi deletado com sucesso!</b></p>
        </div>
        
    </div>
</template>

<script setup>
import api from '../services/api';
import { ref } from 'vue';

    let id = "";

    const contato = ref([]);

    const deleteContato = () =>
        api
            .delete(`/contatos/${id}`)
            .then((response) => (contato.value = response.data));
    

</script>
