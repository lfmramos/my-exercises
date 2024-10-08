import org.academiadecodigo.simplegraphics.graphics.*;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 10, 30, 30);
        rectangle.setColor(Color.GRAY);
        rectangle.draw();
        rectangle.fill();

        Ellipse ellipse = new Ellipse(25, 25, 25, 25);
        ellipse.setColor(Color.BLUE);
        ellipse.draw();
        ellipse.fill();

        Text text = new Text(45, 45, "Hello World!");
        text.setColor(Color.GREEN);
        text.draw();

        Line line = new Line(60,60, 80, 75);
        line.setColor(Color.MAGENTA);
        line.draw();

        Line line1 = new Line(80, 75, 100, 60);
        line1.setColor(Color.MAGENTA);
        line1.draw();

    }

}
