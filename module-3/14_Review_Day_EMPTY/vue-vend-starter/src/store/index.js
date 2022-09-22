import Vue from 'vue'
import Vuex from 'vuex'
import soda from '../assets/soda.jpg';
import gum from '../assets/gum.jpg';
import chips from '../assets/chips.jpg';

Vue.use(Vuex)

export default new Vuex.Store({
  state: {
    funds: 0,
    inventory: [
      {
        id : 1,
        type: "Drink",
        name: "Cola",
        price: 1.25,
        quantity: 5,
        image: soda
      },
      {
        id : 2,
        type: "Drink",
        name: "Dr. Salt",
        price: 1.5,
        quantity: 5,
        image: soda
      },
      {
        id : 3,
        type: "Chips",
        name: "Potato Crisps",
        price: 3.05,
        quantity: 5,
        image: chips
      },
      {
        id : 4,
        type: "Chips",
        name: "Grain Weaves",
        price: 2.75,
        quantity: 5,
        image: chips
      },
      {
        id : 5,
        type: "Gum",
        name: "Triplemint",
        price: 0.75,
        quantity: 5,
        image: gum
      },
    ]
  },
  mutations: {
    INCREASE_FUNDS(state, money) {
    },
    DECREASE_FUNDS(state, money) {
    },
    DECREASE_INVENTORY(state, prodId) {
      state.inventory.forEach(
        (item) => {
          if(item.id === prodId) {
            item.quantity--;
          }
        }
      );
    } 
  },
  actions: {
  },
  modules: {
  }
})
