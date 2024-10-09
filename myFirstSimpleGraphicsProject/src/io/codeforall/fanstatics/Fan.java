package io.codeforall.fanstatics;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Fan implements KeyboardHandler {

    private Keyboard keyboard;
    private Picture picture; // Variable that will receive the image.
    public Fan(){ //Constructor for the fan
        /** To "construct" a fan (or other image object) it's necessary to
         * determine the path of the image and then require it to be drawn.
         * It is necessary to determine the initial position of the image on the canvas.
         * The path is included as a String.
         * */
        picture = new Picture(20,20, "rsc/fan.jpg");
        picture.draw(); //Method for showing the image on the canvas.

        initKeyboard();
    }

    /** This method will instantiate a new Keyboard object and obtain and manage its actions.
     * */
    private void initKeyboard(){
        this.keyboard = new Keyboard(this);


    }
    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
