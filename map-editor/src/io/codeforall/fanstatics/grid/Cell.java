package io.codeforall.fanstatics.grid;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Cell {

    // Column and row position of the cell
    int col;
    int row;
    // Graphical representation of the cell
    Rectangle square;
    // Flag indicating if the cell is painted
    private boolean painted;

    /** Constructor to initialize cell position and draw it */
    public Cell(int col, int row) {
        this.col = col;
        this.row = row;
        square = new Rectangle(col * Grid.CELLSIZE + Grid.PADDING,
                row * Grid.CELLSIZE + Grid.PADDING,
                Grid.CELLSIZE,
                Grid.CELLSIZE);
        square.draw();
        painted = false;
    }

    /** Function to paint the cell visually */
    public void paint() {
        painted = true;
        square.fill();
    }

    public void delete() {
        painted = false;
        square.draw();
    }

    // getters
    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public boolean isPainted() {
        return painted;
    }

    public void setPainted(boolean painted) {
        this.painted = painted;
        if (painted) {
            square.fill();
        } else {
            square.draw();
        }
    }
}