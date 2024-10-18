package io.codeforall.fanstatics.utils;

import org.academiadecodigo.simplegraphics.keyboard.*;
import io.codeforall.fanstatics.MapEditor;
import io.codeforall.fanstatics.grid.*;

import java.io.*;

public class KeyboardListener implements KeyboardHandler {

    // fields
    private Cursor cursor;
    private MapEditor map;
    private String text;
    //private static final String FILE_PATH = "rsc/map.txt";

    // constructor
    public KeyboardListener(Cursor cursor, MapEditor map) {
        this.cursor = cursor;
        this.map = map;
        setup();
    }

    public void setup() {

        Keyboard keyboard = new Keyboard(this);

        KeyboardEvent right = new KeyboardEvent();
        right.setKey(KeyboardEvent.KEY_RIGHT);
        right.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(right);

        KeyboardEvent left = new KeyboardEvent();
        left.setKey(KeyboardEvent.KEY_LEFT);
        left.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(left);

        KeyboardEvent up = new KeyboardEvent();
        up.setKey(KeyboardEvent.KEY_UP);
        up.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(up);

        KeyboardEvent down = new KeyboardEvent();
        down.setKey(KeyboardEvent.KEY_DOWN);
        down.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(down);

        KeyboardEvent space = new KeyboardEvent();
        space.setKey(KeyboardEvent.KEY_SPACE);
        space.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(space);

        KeyboardEvent cKey = new KeyboardEvent();
        cKey.setKey(KeyboardEvent.KEY_C);
        cKey.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(cKey);

        KeyboardEvent sKey = new KeyboardEvent();
        sKey.setKey(KeyboardEvent.KEY_S);
        sKey.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(sKey);

        KeyboardEvent lKey = new KeyboardEvent();
        lKey.setKey(KeyboardEvent.KEY_L);
        lKey.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(lKey);
    }

    private void Write(String file) throws IOException {
        BufferedWriter bWriter = new BufferedWriter(new FileWriter("rsc/map.txt"));
        bWriter.write(file);
        bWriter.close();
    }

    private void Read() throws IOException {
        BufferedReader bReader = new BufferedReader(new FileReader("rsc/map.txt"));
        text = bReader.readLine();
        bReader.close();
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        switch (keyboardEvent.getKey()) {

            case KeyboardEvent.KEY_RIGHT:
                cursor.moveRight();
                break;
            case KeyboardEvent.KEY_LEFT:
                cursor.moveLeft();
                break;
            case KeyboardEvent.KEY_DOWN:
                cursor.moveDown();
                break;
            case KeyboardEvent.KEY_UP:
                cursor.moveUp();
                break;
            case KeyboardEvent.KEY_SPACE:
                map.paint();
                break;
            case KeyboardEvent.KEY_C:
                map.clearGrid();
                break;
            case KeyboardEvent.KEY_S:
                try {
                    Write(text);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                break;
            case KeyboardEvent.KEY_L:
                try{
                    Read();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {
    }
}