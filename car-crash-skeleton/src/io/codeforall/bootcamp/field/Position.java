package io.codeforall.bootcamp.field;

public class Position {

    private int row;
    private int col;

    /** Calls methods from Field class to get the field dimensions and randomly set the position within those bounds.
     * This constructor doesn't take any arguments.
     * It uses the Field class (assuming it provides methods to access field dimensions) to randomly set the row and col values within the boundaries of the field.
     * */
    public Position(){
        this.row = (int) (Math.random() * Field.getHeight()); //Calls the method getHeight from the Class Field.
        this.col = (int) (Math.random() * Field.getWidth()); //Calls the method getWidth from the Class Field.
    }
    public int getCol() {
        return col;
    }
    public int getRow() {
        return row;
    }
    /**
     * Moves the position to the right by the specified speed, considering the field boundaries.
     *
     * @param speed The amount of positions to move to the right
     */
    public void turnRight(int speed){
        if (col <= Field.getWidth() - 1 - speed) {
            col += speed;
        }
    }
    /**
     * Moves the position to the left by the specified speed, considering the field boundaries.
     *
     * @param speed The amount of positions to move to the left
     */
    public void turnLeft(int speed){
        if(col - speed > 0){
            col -= speed;
        }
    }
    /**
     * Moves the position forward (up) by the specified speed, considering the field boundaries.
     *
     * @param speed The amount of positions to move forward
     */
    public void moveForward(int speed){
        if(row - speed > 0){
            row -= speed;
        }
    }
    /**
     * Moves the position backward (down) by the specified speed, considering the field boundaries.
     *
     * @param speed The amount of positions to move backward
     */
    public void moveBackward(int speed){
        if(row <= Field.getHeight() - 1 - speed){
            row += speed;
        }
    }
}