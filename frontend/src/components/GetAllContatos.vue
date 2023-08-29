<template>
    <div>
        <h2>Listando todos os contatos da agenda</h2>
        <div>{{ contatos }}</div>
    </div>
</template>

<script setup>
import api from '../services/api';
import { onMounted, ref } from 'vue';


    const contatos = ref([]);

    const getContatos = () =>
        api
            .get("/contatos")
            .then((response) => (contatos.value = response.data._embedded.contatos));
    
    onMounted(getContatos)
</script>