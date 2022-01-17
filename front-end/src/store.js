import { createStore } from 'vuex'

const store = createStore({
    state(){
      return {
        currentView: "Contents",
      }
    },
    mutations : {
      setPageState(state, data){
        state.currentView = data;
      }
    },
    actions: {

    },
    modules: {

    }
  });

export default store;