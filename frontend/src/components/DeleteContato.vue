<template>
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
