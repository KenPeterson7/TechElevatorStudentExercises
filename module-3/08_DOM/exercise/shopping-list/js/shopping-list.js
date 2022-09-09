// add pageTitle
const pageTitle = 'My Shopping List'
// add groceries
const groceries = ['apples', 'bananas', 'strawberries', 
'chicken', 'nutrigrain bars', 'donuts', 'milk', 'cereal',
'tuna', 'broccoli']

/**
 * This function will get a reference to the title and set its text to the value
 * of the pageTitle variable that was set above.
 */
function setPageTitle() {
  const pTitle = document.getElementById('title') //getting the element by it's id and storing it (the element) pTitle
  pTitle.innerText = pageTitle;  //updating the text (value) of that element to the value in the constant pageTitle
}

/**
 * This function will loop over the array of groceries that was set above and add them to the DOM.
 */
function displayGroceries() {
  const ul = document.getElementById('groceries')  //get the element by ID and store it in a constant called ul

  groceries.forEach(grocery => {    //for each grocery in groceries
    const container = document.createElement('li')  //create a new li, store it in a constant called container
    container.setAttribute('class', 'grocery')  //set the class of each li to grocery
    container.innerText += grocery;  //update the text (value) of each li to the current element (value) in the array
    ul.insertAdjacentElement('afterbegin', container) //adds new Dom Nodes to the beginning of the li
    //afterbegin adds new DOM nodes to the beginning of the list (last item is first, first item is last)
    //beforeend adds new DOM nodes to the end of the list ( first item is first, last item is last)
  })
}

/**
 * This function will be called when the button is clicked. You will need to get a reference
 * to every list item and add the class completed to each one
 */
function markCompleted(parent, completed) {   //added parent and completed as local vars
  const test = document.querySelectorAll('li') //select all the li's and store it in a constant called test
  test.forEach((item) => { //for each item in the list items (test)
    item.setAttribute('class', 'completed') //set the class for each li to completed
  })

}

setPageTitle();

displayGroceries();

// Don't worry too much about what is going on here, we will cover this when we discuss events.
document.addEventListener('DOMContentLoaded', () => {
  // When the DOM Content has loaded attach a click listener to the button
  const button = document.querySelector('.btn');
  button.addEventListener('click', markCompleted);
});
