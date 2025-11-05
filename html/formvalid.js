document.addEventListener("DOMContentLoaded", function () {
  document.getElementById("btn").addEventListener("click", login);
});
console.log("ljld");

function login() {
  console.log("logincall");

  let uname = document.getElementById("uname").value;
  let pass = document.getElementById("pass").value;

  let user = getUser(uname, pass);
  if (user != null) {
    console.log("login succesfull");
  } else {
    console.log("invalid credential");
  }
}

function getUser(uname, pass) {
  let data = getdata();
  for (let i = 0; i < data.length; i++) {
    if (data[i].username == uname && data[i].password == pass) {
      return data[i];
    }
  }
  return null;
}

function getdata() {
  return [
    {
      username: "tushar",
      password: "1234",

      name: "rohit",
      rollno: 102,
      marks: 83,
    },
    {
      username: "tushar",
      password: "1234",

      name: "rohit",
      rollno: 102,
      marks: 83,
    },
    {
      username: "tushar",
      password: "1234",

      name: "tushar",
      rollno: 102,
      marks: 83,
    },
  ];
}
