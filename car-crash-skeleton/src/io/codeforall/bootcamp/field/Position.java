package io.codeforall.bootcamp.field;

public class Position {

    private int row;
    private int col;
    public Position(){
        this.row = setRow();
        this.col = setCol();
    }
    public int getCol() {
        System.out.println("Col = " + col);
        return col;
    }
    public int getRow() {
        System.out.println("Row = " + row);
        return row;
    }
    public int setCol() {
        col = (int) (Math.random() * 100);
        return col;
    }
    public int setRow() {
        this.row = (int) (Math.random() * 25);
        return row;
    }
}
