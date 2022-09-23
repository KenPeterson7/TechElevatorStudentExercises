<template>
    <div id="item-box">
        Item: {{this.item.name}}<br>
        {{this.item.type}}<br>
        Price: {{this.item.price}}<br>
        Stock: {{this.item.quantity}}<br v-show="this.item.quantity > 0">
        <button class="buy" @click="buyMe">Buy Me!</button>
        <div>
            <img :src="item.image" alt="pic" class="prod-img">
        </div>
        
    </div>
</template>

<script>
export default {
    data(){
        return {
           
        }
    },
    props: [
        'item'
    ],
    methods: {
        buyMe(){
            let money = this.item.price
            let n = this.item.id
            if(this.$store.state.funds >= money && this.item.quantity > 0){
            this.$store.commit('DECREASE_FUNDS', parseFloat(money))
            this.$store.commit('DECREASE_INVENTORY', n)
            } else if(this.$store.state.funds < money) {
                alert('Not enough money')
            } else if (this.item.quantity == 0){
                alert('Out of stock')
            }
            
        },
        
    }
      
}


</script>

<style scoped>
#item-box {
    margin: 5px;
    border-radius: 15px;
    border: 5px solid grey;
    width: 300px;
    height: 250px;
}

.prod-img {
    width: 100px;
}
</style>