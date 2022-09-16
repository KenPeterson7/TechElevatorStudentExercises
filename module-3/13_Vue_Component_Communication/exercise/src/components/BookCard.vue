<template>
  <div class="card">
    <div class="book-title">{{book.title}}</div>
    <img v-if="book.isbn" v-bind:src="'http://covers.openlibrary.org/b/isbn/' + book.isbn + '-M.jpg'" />
    <div class="book-author">{{book.author}}</div>
     <button class="mark-read" v-on:click.prevent="updateReadStatus(true)" v-if="!book.read">Mark Read</button>
     <button class="mark-unread" v-on:click.prevent="updateReadStatus(false)" v-if="book.read">Mark Unread</button>
    <!-- <button @click="updateReadStatus" :class="book.read ? 'mark-unread' : 'mark-read'">{{book.read ? 'Mark Unread' : 'Mark Read'}}</button> -->
  </div>
</template>

<script>
export default {
    name: 'book-card',
        props: ['book'],
        methods: {
            updateReadStatus(value) {
                this.$store.commit('SET_READ_STATUS', {book: this.book, value: value});
            }
            // updateRead() {
            //     this.$store.commit("READ", this.book)
            // }
        }
}
</script>

<style>
.card {
    border: 2px solid black;
    border-radius: 10px;
    width: 250px;
    height: 550px;
    margin: 20px;
}

.card.read {
    background-color: lightgray;
}

.card .book-title {
    font-size: 1.5rem;
}

.card .book-author {
    font-size: 1rem;
}
</style>