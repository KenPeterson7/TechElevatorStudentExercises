<template>
<div>
  <money-feed />
  <br>
  <div  id="display" >
    <item-box v-for="item in this.$store.state.inventory" :key="item" :item="item" />
  </div>
</div>

</template>

<script>
import ItemBox from '../components/Item.vue'
import MoneyFeed from '../components/MoneyFeed.vue'

export default {
  components: {ItemBox, MoneyFeed},

};
</script>

<style scoped>
#display {
    display: flex;
}
</style>