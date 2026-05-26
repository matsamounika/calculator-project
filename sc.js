// Function to change background color randomly
function changeColor() {
    const colors = ["#fce4ec", "#e3f2fd", "#fff9c4", "#c8e6c9", "#d1c4e9"];
    const randomColor = colors[Math.floor(Math.random() * colors.length)];
    document.body.style.backgroundColor = randomColor;
}

// Function to show a surprise message
function showMessage() {
    alert("🎉 Surprise! You just made your first interactive webpage!");
}
