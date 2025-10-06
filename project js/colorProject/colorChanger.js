let buttons = document.querySelectorAll('.button');
let body = document.querySelector('body');

 buttons.forEach(function(button){
    //console.log(button);
button.addEventListener('click' ,function (e){
console.log(e);
 console.log(e.target);


if(e.target.id === 'red'){
    body.style.backgroundColor = 'red';
}
if(e.target.id === 'green'){
  body.style.backgroundColor = 'green';
}
if(e.target.id === 'yellow'){
  body.style.backgroundColor = 'yellow';
}
if(e.target.id === 'purple'){
  body.style.backgroundColor = 'purple';
}

});
});



