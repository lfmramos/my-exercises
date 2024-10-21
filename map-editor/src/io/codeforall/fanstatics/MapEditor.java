package io.codeforall.fanstatics;

import io.codeforall.fanstatics.grid.*;
import io.codeforall.fanstatics.utils.*;


public class MapEditor {

    // Grid representing the map
    private Grid grid;
    // Cursor to indicate the current editing position
    private Cursor cursor;

    /** Constructor to initialize grid and cursor */
    public MapEditor(int numberCols, int numberRows) {

        grid = new Grid(numberCols, numberRows);
        cursor = new Cursor();
        // Create a KeyboardListener to handle user input
        new KeyboardListener(cursor, this);
    }

    /** Function to toggle the painted state of the cell under the cursor */

    public void paint() {

        // get cell to check if it is painted or not and give implementation
        Cell cell = grid.getCell(cursor.getCol(), cursor.getRow());

        if (cell.isPainted()) {
            cell.delete();
        } else {
            cell.paint();
        }
    }

    /** Function to clear the entire grid */
    public void clearGrid() {
        grid.clear();
    }

    private String convertToMapString(Cell cell) {
        StringBuilder sb = new StringBuilder();
        for (int row = 0; row < cell.getRow(); row++) {
            for (int col = 0; col < cell.getCol(); col++) {
                sb.append(grid.getCell(col, row).isPainted() ? 'X' : '-');
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    private void loadMapFromString(String mapData) {
        String[] lines = mapData.split("\n");
        for (int row = 0; row < lines.length; row++) {
            for (int col = 0; col < lines[row].length(); col++) {
                grid.getCell(col, row).setPainted(lines[row].charAt(col) == 'X');
            }
        }
    }
}