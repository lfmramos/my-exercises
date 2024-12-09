let dog = "Dog"; // global definition of dog

function animals() {
    console.log(dog); // access to global dog
    badAnimal();
    console.log(rabbit); // access to global rabbit
}

function badAnimal() {
    rabbit = "rabbit"; // rabbit leaked into the global scope
}

animals();