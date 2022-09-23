<template>
    <div>
        <h1>My Money: ${{(this.$store.state.funds).toFixed(2)}}</h1>
        <label for="money">Add some money</label>
        <input type="number" value="10" v-model="cash" @keypress.enter="addMoney()">
    </div>
</template>

<script>
export default {
        data(){
            return{
                cash: 0,
            }
        },
methods: {
    addMoney(){
        if(this.cash > 0){
            this.$store.commit('INCREASE_FUNDS', parseFloat(this.cash))
        } else {
            alert('Please enter a positive number')
        }
    }
}
}
</script>

<style>

</style>