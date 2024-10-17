package io.codeforall.fanstatics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    private static final String FILE_PATH = "rsc/lorem_ipsum.txt";

    /**
     * Entry point
     *
     * @param args application entry point arguments
     */
    public static void main(String[] args) {

        LoremIpsum lorem = new LoremIpsum();
        String text = lorem.getParagraph(); // Generate 1 paragraph

        // Save to file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("rsc/lorem_ipsum.txt"))) {
            writer.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            WordReader wordReader = new WordReader(FILE_PATH);
            for (String word : wordReader) {
                System.out.println(word);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}