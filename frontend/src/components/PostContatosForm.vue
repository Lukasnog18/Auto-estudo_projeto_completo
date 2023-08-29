<template>
    <div>
        <h2>Adicionar um novo contato</h2>
        <div>
            <form id="contatos-form">
                <div class="input-container">
                    <label for="nome"></label>
                    <input type="text" id="nome" name="nome" v-model="contato.nome" placeholder="Digite seu nome">
                </div>
                <div class="input-container">
                    <label for="telefone"></label>
                    <input type="text" id="telefone" name="telefone" v-model="contato.telefone" placeholder="Digite seu telefone">
                </div>
                <div class="input-container">
                    <label for="endereco"></label>
                    <input type="text" id="endereco" name="endereco" v-model="contato.endereco" placeholder="Digite seu endereco">
                </div>
                <!-- <div class="input-container">
                    <label for="status"></label>
                    <input type="checkbox" id="status" name="status" v-model="status">
                </div> -->
                <div>
                    <input type="submit" class="submit-btn" value="Adicionar contato" @click="postContatos">
                </div>
            </form>
        </div>
    </div>
</template>

<script setup>
import api from '../services/api';
// import { onMounted, ref } from 'vue';

    const contato = {
    nome : "",
    telefone : "",
    endereco : "",
    status : true
    }

    
    const postContatos = () =>
        api
            .post("/contatos", contato)
            .then((response) =>  {
                console.log(response)
            });
    
    // onMounted(postContatos)
    
</script>