# Flappy Bird

A simple Flappy Bird game implemented in Java using Swing.

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [Game Controls](#game-controls)
- [Project Structure](#project-structure)

## Introduction

This project is a basic implementation of the popular Flappy Bird game. The game is built using Java and the Swing library for the graphical user interface.

## Features

- Simple and intuitive gameplay
- Score tracking
- High score tracking
- Randomly generated pipes

## Installation

To run this project, you need to have Java and Maven installed on your system.

1. Clone the repository:
    ```sh
    git clone https://github.com/Harshavardhan-Yaddalapuri/flappy-bird.git
    cd flappy-bird
    ```

2. Build the project using Maven:
    ```sh
    mvn clean install
    ```

## Usage

To start the game, run the `Main` class:

```sh
mvn exec:java -Dexec.mainClass="com.noobprogrammer.Main"
```

## Game Controls
- Spacebar: Make the bird jump
- Spacebar: To restart the game

## Project Structure

```sh
flappy-bird/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── noobprogrammer/
│   │   │           ├── FlappyBird.java
│   │   │           └── Main.java
│   │   └── resources/
│   │       └── assets/
│   │           ├── flappybird.png
│   │           ├── flappybirdbg.png
│   │           ├── toppipe.png
│   │           └── bottompipe.png
├── .gitignore
├── pom.xml
└── README.md
```
