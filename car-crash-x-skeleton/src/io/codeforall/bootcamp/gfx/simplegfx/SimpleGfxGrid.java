package io.codeforall.bootcamp.gfx.simplegfx;

import io.codeforall.bootcamp.grid.Grid;
import io.codeforall.bootcamp.grid.GridColor;
import io.codeforall.bootcamp.grid.GridDirection;
import io.codeforall.bootcamp.grid.position.GridPosition;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class SimpleGfxGrid implements Grid {

    public static final int PADDING = 10; //Used for including padding on top and left sides of the canvas
    /** By default, the SimpleGfx library includes 10px of padding to the right and bottom sides of the canvas*/
    public static final int CELL_SIZE = 20;
    //public static final int COL_NUM = 80; // The number os columns in the grid
    //private static final int ROW_NUM = 25; // The number of rows in the grid
    private int rows;
    private int cols;


    public SimpleGfxGrid(int cols, int rows){
        //throw new UnsupportedOperationException();
        this.cols = cols;
        this.rows = rows;
    }

    /**
     * @see Grid#init()
     */
    @Override
    public void init() {
        //throw new UnsupportedOperationException();
        Rectangle rectangle = new Rectangle(PADDING, PADDING, this.cols*getCellSize(), this.rows*getCellSize());
        rectangle.draw();
    }

    /**
     * @see Grid#getCols()
     */
    @Override
    public int getCols() {
        //throw new UnsupportedOperationException();
        return this.cols;
    }

    /**
     * @see Grid#getRows()
     */
    @Override
    public int getRows() {
        //throw new UnsupportedOperationException();
        return this.rows;
    }

    /**
     * Obtains the width of the grid in pixels
     * @return the width of the grid
     */
    public int getWidth() {
        //throw new UnsupportedOperationException();
        return this.cols * CELL_SIZE;
    }

    /**
     * Obtains the height of the grid in pixels
     * @return the height of the grid
     */
    public int getHeight() {
        //throw new UnsupportedOperationException();
        return this.rows * CELL_SIZE;
    }

    /**
     * Obtains the grid X position in the SimpleGFX canvas
     * @return the x position of the grid
     */
    public int getX() {
        //throw new UnsupportedOperationException();
        return PADDING;
    }

    /**
     * Obtains the grid Y position in the SimpleGFX canvas
     * @return the y position of the grid
     */
    public int getY() {
        //throw new UnsupportedOperationException();
        return PADDING;
    }

    /**
     * Obtains the pixel width and height of a grid position
     * @return
     */
    public int getCellSize() {
        //throw new UnsupportedOperationException();
        return CELL_SIZE;
    }

    /**
     * @see Grid#makeGridPosition()
     */
    @Override
    public GridPosition makeGridPosition() {
        //throw new UnsupportedOperationException();
        return new SimpleGfxGridPosition(this);
    }
    /**
     * @see Grid#makeGridPosition(int, int)
     */
    @Override
    public GridPosition makeGridPosition(int col, int row) {
        //throw new UnsupportedOperationException();
        return new SimpleGfxGridPosition(col, row, this);
    }

    /**
     * Auxiliary method to compute the y value that corresponds to a specific row
     * @param row index
     * @return y pixel value
     */
    public int rowToY(int row) { //Why is this method unnecessary??
        throw new UnsupportedOperationException();
        // The conversion of logical position to graphical position
        //return row * getCellSize() + PADDING;
    }

    /**
     * Auxiliary method to compute the x value that corresponds to a specific column
     * @param column index
     * @return x pixel value
     */
    public int columnToX(int column) { //Why is this method unnecessary??
        throw new UnsupportedOperationException();
        // The conversion of logical position to graphical position
        //return column * getCellSize() + PADDING;
    }
}
