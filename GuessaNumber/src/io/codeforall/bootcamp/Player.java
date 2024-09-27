package io.codeforall.bootcamp;

public class Player {

    public String name;

    public Player (String name){
        this.name = name;
    }
    public int generatedNumPlayer = RandomNum.generate();

    public int generatedNewNumPlayer1() {
        if(RandomNum.generate() == generatedNumPlayer) {
            RandomNum.generate();
        }
        generatedNumPlayer = RandomNum.generate();
        return generatedNumPlayer;
    }
}