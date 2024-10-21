package io.codeforall.fanstatics.grid;

public class Grid {

    // fields
    public static final int PADDING = 10;
    public static final int CELLSIZE = 20;
    public static int numberCols;
    public static int numberRows;

    private Cell[][] cell;

    // constructor
    public Grid(int numberCols, int numberRows) {
        this.numberCols = numberCols;
        this.numberRows = numberRows;

        cell = new Cell[numberCols][numberRows];
        drawGrid();
    }

    // populate my grid
    public void drawGrid() {
        for (int i = 0; i < numberCols; i++) {
            for (int j = 0; j < numberRows; j++) {
                cell[i][j] = new Cell(i, j);
            }
        }
    }

    // clear grid
    public void clear() {
        for (int i = 0; i < numberCols; i++) {
            for (int j = 0; j < numberRows; j++) {
                cell[i][j].delete();
            }
        }
    }

    // getter for cell
    public Cell getCell(int numberCols, int numberRows) {
        return cell[numberCols][numberRows];
    }

/*    @Override
    public String toString() {
        //StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        for (Cell[] row : rows) {
            for (Cell col : cols) {
                stringBuilder.append(cell.isPainted() ? "1" : "0");
            }
        }
        stringBuilder.append("\n");
        return stringBuilder.toString();
    }*/
}