<template>
  <div>
    <Home />
    <PostContatosForm />
    <GetAllContatos />
    <GetOneContato />
    <DeleteContato />
  </div>
</template>

<script setup>
import Home from './views/Home.vue'
import PostContatosForm from './components/PostContatosForm.vue'
import GetAllContatos from './components/GetAllContatos.vue';
import GetOneContato from './components/GetOneContato.vue';
import DeleteContato from './components/DeleteContato.vue'

</script>

<!-- <style>
  body {
    background-color: #333;
    color: #FFF;
  }
</style> -->
