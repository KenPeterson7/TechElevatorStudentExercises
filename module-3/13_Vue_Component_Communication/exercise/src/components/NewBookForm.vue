<template>
  <div>
    <form v-on:submit.prevent="addBook" class="new-book-form">
        <label for="title">Title</label>
        <input v-model="newBook.title" id="title" type="text" class="title-input">

        <label for="author">Author</label>
        <input v-model="newBook.author" type="text" id="author" class="author-input">

        <label for="isbn">ISBN</label>
        <input v-model="newBook.isbn" type="text" id="isbn" class="isbn-input">

        <button type="submit" value="Submit">Test</button>
    </form>
  </div>
</template>

<script>
export default {
    data() {
    return {
      newBook: {
        title: '',
        author: '',
        read: false,
        isbn: ''
      }
    };
  },
    methods: {
        clear() {
            this.newBook = {
                title: '',
                author: '',
                read: false,
                isbn: ''
            }       
        },
        addBook() {
                this.$store.commit('ADD_BOOK', this.newBook);
                this.clear()
            //     this.newBook = {
            //     title: '',
            //     author: '',
            //     read: false,
            //     isbn: ''
            // }   
        }      
    }
}
</script>

<style>
</style>