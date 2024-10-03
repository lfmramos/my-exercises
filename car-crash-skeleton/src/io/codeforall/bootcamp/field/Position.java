package io.codeforall.bootcamp.field;

public class Position {

    private int row;
    private int col;
    public Position(int row, int col){
        this.row = row;
        this.col = col;
    }
    public int getCol() {
        System.out.println(col);
        return col;
    }
    public int getRow() {
        System.out.println(row);
        return row;
    }
    public int setCol() {
        this.col = (int) (Math.random() * 100);
        return col;
    }
    public int setRow() {
        this.row = (int) (Math.random() * 25);
        return row;
    }

    public void setPosition(){
        setCol();
        setRow();
    }
}
