<template>
  <div id="app">
    <Header />
    <Nav />
    <component :is="$store.state.currentView"></component>
    <Footer />
  </div>
</template>

<script>
import Header from './components/Header.vue';
import Nav from './components/Nav.vue';
import Contents from './components/Contents.vue';
import Footer from './components/Footer.vue';
import Signup from './components/Signup.vue';
import {mapState, mapMutations, mapActions} from 'vuex'

export default {
  name: 'App',
  data() {
    return {
      currentView: "Contents"
    }
  },
  components: {
    Header,
    Nav,
    Contents,
    Footer,
    Signup
  },
  computed : {
    ...mapState(['name', 'selectPage', 'pageState']),
  },
  methods: {
    ...mapActions([]),
    ...mapMutations(['setPageState']),
  },

}
</script>

<style>
html,body{padding: 0; margin: 0;}
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin: 0; padding: 0;
}
</style>
