document.addEventListener('DOMContentLoaded', () => {
    document.getElementById("dogBtn").addEventListener('click', () => {
        //display a dog picture
        displayDoggo();
    })
    document.getElementById("hotelBtn").addEventListener('click', () => {
        displayHotels();
    })
})

function displayDoggo() {

    //fetch says to go to API endpoint - what comes back is called a promise
    fetch("https://dog.ceo/api/breeds/image/random")
    // .then handles the promise -- the response object that comes back from the fetch
    // there is lot of data in the promise
    .then((response) => {
        let json = response.json(); // holds for me the json version of the promise
        //console.log(json);
        return json;
    })
    // take the json that is returned from the .then
    // extract the data from that json
    .then((data) => {
        //console.log(data);
        const img = document.createElement('img');
        img.src = data.message;
        const div1 = document.getElementById('div1')
        div1.appendChild(img);
    })
}

function displayHotels() {
    fetch("http://localhost:8080/hotels")
    .then((response) => response.json())
    .then((data) => {
        console.log(data);
        const hotelId = document.getElementById('hotelId');
        for (let i = 0; i < data.length; i++){
            const h3 = document.createElement('h3')
            h3.innerText = data[i].name;
            hotelId.appendChild(h3);
            const p = document.createElement('p');
            p.innerText = data[i].address.city + ',' + data[i].address.state;
            hotelId.appendChild(p);
        }
    })
}