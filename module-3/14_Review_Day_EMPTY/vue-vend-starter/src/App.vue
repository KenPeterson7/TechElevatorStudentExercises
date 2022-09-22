<template>
  <div id="app">
    <img alt="Vue logo" src="./assets/logo.png">
    <Machine/>
  </div>
</template>

<script>
import Machine from './components/Machine.vue'

export default {
  name: 'App',
  components: {
    Machine
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
