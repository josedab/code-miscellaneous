// Function scoped
// Access outside of the scope will not work

function saySomething () {
    var proverb = "The best time to plant a tree was 20 years ago. The second best time is now.";
    console.log(proverb);
}
saySomething();
console.log(proverb); // It does not run OK!