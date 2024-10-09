package io.codeforall.bootcamp.gfx.simplegfx;

import io.codeforall.bootcamp.grid.GridDirection;
import io.codeforall.bootcamp.grid.position.AbstractGridPosition;
import io.codeforall.bootcamp.grid.position.GridPosition;
import io.codeforall.bootcamp.grid.GridColor;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

/**
 * Simple graphics position
 */
public class SimpleGfxGridPosition extends AbstractGridPosition {

    private Rectangle rectangle;
    private SimpleGfxGrid simpleGfxGrid;

    /**
     * Simple graphics position constructor
     * @param grid Simple graphics grid
     */
    public SimpleGfxGridPosition(SimpleGfxGrid grid){ //Do not modify this constructor
        super((int) (Math.random() * grid.getCols()), (int) (Math.random() * grid.getRows()), grid);

        throw new UnsupportedOperationException();
    }

    /**
     * Simple graphics position constructor
     * @param col position column
     * @param row position row
     * @param grid Simple graphics grid
     */
    public SimpleGfxGridPosition(int col, int row, SimpleGfxGrid grid){
        super(col, row, grid);
        rectangle = new Rectangle(simpleGfxGrid.columnToX(col), simpleGfxGrid.rowToY(row), simpleGfxGrid.getCellSize(), simpleGfxGrid.getCellSize());
        show();
        //throw new UnsupportedOperationException();
    }

    /**
     * @see GridPosition#show()
     */
    @Override
    public void show() {
        //throw new UnsupportedOperationException();
        rectangle.draw();
        rectangle.setColor(Color.BLACK);
        rectangle.fill();
    }

    /**
     * @see GridPosition#hide()
     */
    @Override
    public void hide() {
        //throw new UnsupportedOperationException();
        rectangle.delete();
    }

    /**
     * @see GridPosition#moveInDirection(GridDirection, int)
     */
    @Override
    public void moveInDirection(GridDirection direction, int distance) {
        throw new UnsupportedOperationException();
    }

    /**
     * @see AbstractGridPosition#setColor(GridColor)
     */
    @Override
    public void setColor(GridColor color) {
        throw new UnsupportedOperationException();
    }
}