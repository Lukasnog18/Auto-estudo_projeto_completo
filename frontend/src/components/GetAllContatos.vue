<template>
    <div>
        <head>
            <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
        </head>
        <h2>Listando todos os contatos da agenda</h2>
        <div>
        <table id="lista-contatos">
            <thead>
            <tr>
                <th>Nome</th>
                <th>Telefone</th>
                <th>Endereço</th>
                <th>Status</th>
                <th>Ações</th>
            </tr>
            </thead>
            <tbody>
            <tr v-for="contato in contatos" :key="contato.id">
                <td>{{ contato.nome }}</td>
                <td>{{ contato.telefone }}</td>
                <td>{{ contato.endereco }}</td>
                <td>{{ contato.status }}</td>
                <td>
                <button @click="deleteContato(contato.id)" class="delete-button">
                    <i class="fas fa-trash-alt"></i>
                </button>
                <button @click="editarContato(contato.id)">Editar</button>
                </td>
            </tr>
            </tbody>
        </table>
        </div>
  </div>
</template>

<script setup>
// import PostContatosForm from './PostContatosForm.vue'
import { useRouter } from 'vue-router';
import api from '../services/api';
import { onMounted, ref } from 'vue';

// const contato = {
//     nome : contato.nome,
//     telefone : contato.telefone,
//     endereco : contato.endereco,
//     status : contato.status
//     }

    const contatos = ref([]);

    const getContatos = () =>
        api
            .get("/contatos")
            .then((response) => (contatos.value = response.data._embedded.contatos));
    
    onMounted(getContatos)

    const deleteContato = (id) =>
        api
            .delete(`/contatos/${id}`)
            .then(getContatos);


    const router = useRouter();
    const editarContato = (id) => 
        router.push(`/contatos/${id}`)
</script>

<style>
/* Estilos para a tabela */
#lista-contatos {
  width: 100%;
  border-collapse: collapse;
  margin-top: 20px;
}

#lista-contatos th, #lista-contatos td {
  border: 1px solid #ccc;
  padding: 8px;
  text-align: left;
}

/* Estilos para o botão de exclusão */
.delete-button {
  background-color: transparent;
  border: none;
  color: red;
  cursor: pointer;
}

.delete-button:hover {
  color: darkred;
}
</style>