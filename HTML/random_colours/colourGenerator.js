window.addEventListener("load", (event) => {
    let column1 = document.getElementById("column1");
    let column2 = document.getElementById("column2");
    let column3 = document.getElementById("column3");
    let column4 = document.getElementById("column4");
    let column5 = document.getElementById("column5");

    column1.style.backgroundColor = generateRandomColor();
    column2.style.backgroundColor = generateRandomColor();
    column3.style.backgroundColor = generateRandomColor();
    column4.style.backgroundColor = generateRandomColor();
    column5.style.backgroundColor = generateRandomColor();

    column1.textContent = column1.style.backgroundColor;
    column2.textContent = column2.style.backgroundColor;
    column3.textContent = column3.style.backgroundColor;
    column4.textContent = column4.style.backgroundColor;
    column5.textContent = column5.style.backgroundColor;

});

function generateRandomColor() {
    let randomColor = "#" + Math.floor(Math.random() * 16777215).toString(16);

    while (randomColor.length < 7) {
        randomColor += "0";
    }

    console.log(randomColor);
    return randomColor;
}