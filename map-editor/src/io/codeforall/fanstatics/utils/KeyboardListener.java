package io.codeforall.fanstatics.utils;

import org.academiadecodigo.simplegraphics.keyboard.*;
import io.codeforall.fanstatics.MapEditor;
import io.codeforall.fanstatics.grid.*;

import java.io.*;

public class KeyboardListener implements KeyboardHandler {

    // Cursor reference for position updates
    private Cursor cursor;
    // MapEditor reference for calling paint and clear functions
    private MapEditor map;
    // String to hold loaded map data (unused in provided code)
    private String text;
    private static final String FILE_PATH = "rsc/map.txt";

    /** Constructor to set references and register key listeners */
    public KeyboardListener(Cursor cursor, MapEditor map) {
        this.cursor = cursor;
        this.map = map;
        setup();
    }

    /** Function to register keyboard events for movement, painting, clearing, saving and loading */
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

    /** Function to write map data to a file (not implemented in provided code) */

    private void Write(String fileData) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            writer.write(fileData);
        }
    }

    /** Function to read map data from a file (not implemented in provided code) */

    private String Read() throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line).append("\n");
            }
            return sb.toString();
        }
    }

    /** Function to handle key press events */
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
                    // Convert the current grid state to a string representation
                    String mapData = convertToMapString(map.getGrid());
                    Write(mapData);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                break;
            case KeyboardEvent.KEY_L:
                try {
                    String mapData = Read();
                    // Load the map from the string representation
                    loadMapFromString(mapData);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                break;
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {
        // No actions needed on key release in this implementation
    }
}