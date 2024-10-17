
package io.codeforall.fanstatics;

import org.academiadecodigo.simplegraphics.graphics.*;

public class outerGrid {

    private int row;
    private int col;
    private Rectangle rectangle;
    private final int PADDING = 10;
    private final int CELL_SIZE = 30;

    private Rectangle[][] cells;
    public outerGrid(int col, int row){
        this.col = col;
        this.row = row;
        this.rectangle = new Rectangle(PADDING, PADDING, col * CELL_SIZE, row * CELL_SIZE);
    }

    public void init(){
        rectangle.draw();
        innerGrid();
    }
    public void innerGrid(){
        cells = new Rectangle[this.col][this.row];
        for (int i = 0; i < this.col; i++) {
            for (int j = 0; j < this.row; j++) {
                Rectangle rectangle = new Rectangle(PADDING + (CELL_SIZE * i), PADDING + CELL_SIZE * j, CELL_SIZE, CELL_SIZE);
                rectangle.draw();
            }
        }
    }
}