let fullName = prompt("Enter your name: ")

let greeting = document.querySelector("#greeting")
greeting.innerHTML = `Merhaba,${fullName} <strong><span id="myName"></span></strong>! Hoş geldin!`

function showTime() {
    let clock = document.querySelector("#myClock");
    let date = new Date();
    let hours = date.getHours();
    let minutes = date.getMinutes();
    let seconds = date.getSeconds();
    let day = date.getDate();
    let month = date.getMonth() + 1;
    let year = date.getFullYear();
  
    
    hours = hours < 10 ? "0" + hours : hours;
    minutes = minutes < 10 ? "0" + minutes : minutes;
    seconds = seconds < 10 ? "0" + seconds : seconds;
    month = month < 10 ? "0" + month : month;
    day = day < 10 ? "0" + day : day;
  
    
    clock.innerHTML = `${day}.${month}.${year} tarihinde ${hours}:${minutes}:${seconds} saatindesiniz.`;
  }
  
  showTime(); 
  
  // To update hour per second
  setInterval(showTime, 1000);