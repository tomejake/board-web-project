import { createStore } from 'vuex'

const store = createStore({
    state(){
      return {
        currentView: "Contents",
        thisBoard: {}
      }
    },
    mutations : {
      setPageState(state, data){
        state.currentView = data;
      },
      setThisBoard(state, boardData){
        state.thisBoard = boardData;
      }
    },
    actions: {

    },
    modules: {

    }
  });

export default store;