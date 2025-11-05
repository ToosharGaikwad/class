import { users } from "./users.js";

let mobInput, sendOtpBtn, otpInput, loginBtn, messageBox;
let currentUser = null;

document.addEventListener("DOMContentLoaded", function () {
  mobInput = document.getElementById("mob");
  sendOtpBtn = document.getElementById("sendotp");
  otpInput = document.getElementById("otp");
  loginBtn = document.getElementById("login");
  messageBox = document.getElementById("msg");

  sendOtpBtn.addEventListener("click", sendOtp);
  loginBtn.addEventListener("click", verifyOtp);
});

function sendOtp() {
  const mob = mobInput.value.trim();
  currentUser = users.find((u) => u.mobile === mob);

  if (currentUser) {
    alert(`OTP sent successfully! (Demo OTP: ${currentUser.otp})`);
  } else {
    alert("Mobile number not found!");
  }
}

function verifyOtp() {
  const otp = otpInput.value.trim();

  if (!currentUser) {
    alert("Please enter a valid mobile number first!");
    return;
  }

  if (otp === currentUser.otp) {
    messageBox.innerHTML = `✅ Welcome ${currentUser.name}! (ID: ${currentUser.id})`;
  } else {
    messageBox.innerHTML = "❌ Incorrect OTP!";
  }
}
