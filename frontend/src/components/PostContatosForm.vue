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

<style>
/* Estilos gerais para o formulário */
#contatos-form {
  max-width: 400px;
  margin: 0 auto;
  padding: 20px;
  border: 1px solid #ccc;
  border-radius: 5px;
  background-color: #f9f9f9;
}

/* Estilos para os rótulos */
.input-container label {
  display: block;
  font-weight: bold;
  margin-bottom: 5px;
}

/* Estilos para as entradas de texto */
.input-container input[type="text"] {
  width: 100%;
  padding: 8px;
  margin-bottom: 15px;
  border: 1px solid #ccc;
  border-radius: 3px;
}

/* Estilos para o botão de envio */
.submit-btn {
  background-color: #007bff;
  color: white;
  border: none;
  padding: 10px 20px;
  border-radius: 3px;
  cursor: pointer;
}

.submit-btn:hover {
  background-color: #0056b3;
}

/* Estilos para o cabeçalho */
h2 {
  font-size: 24px;
  margin-bottom: 20px;
  text-align: center;
}
</style>