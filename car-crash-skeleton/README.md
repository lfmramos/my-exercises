# Car Crash Animation

This program simulates a car crash scenario on a 2D grid. Cars are randomly generated and moved around the grid. Collisions are detected when two cars occupy the same position.

## Features

- Creates a car racing field with user-defined dimensions.
- Randomly generates cars of different types (e.g., Ferrari, Toyota).
- Simulates car movement and collisions.
- It uses a console-based graphical interface (Lanterna library) to display the cars in the field.

## Usage

1. Clone the repository:

```
git clone https://github.com/your-username/CarCrash.git
```

2. Compile and run the program:

```
cd CarCrash
javac Main.java Field.java Car.java CarFactory.java Position.java Toyota.java Ferrari.java 
java Main
```

**Note**: To run the program, you might need to install the Lanterna library (`com.googlecode.lanterna:lanterna:3.9.0`).

## Customisation

- You can modify the `MANUFACTURED_CARS` constant in `Game.java` to change the number of cars created.
- New car types can be implemented by extending the `Car` class and overriding its behaviour (e.g., speed, collision detection).

## Dependencies

Lanterna library ([URLlanterna ON GitHub github.com])

## Contributing

Feel free to fork this repository and contribute your improvements!
