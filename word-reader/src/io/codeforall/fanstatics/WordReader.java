package io.codeforall.fanstatics;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;

public class WordReader implements Iterable<String>{
    FileReader fileReader;
    BufferedReader bReader;
    String[] words;

    public WordReader(String filePath) throws IOException {
        try{
            this.fileReader = new FileReader(filePath);
            this.bReader = new BufferedReader(this.fileReader);
        } catch (FileNotFoundException ex){
            System.out.println("File not found!");
        }

        String line = "";
        String result = "";

        while ((line = bReader.readLine()) != null){
            line = line.replaceAll("[^a-zA-Z ]", "");
            result += line;
        }

        this.bReader.close();
        this.words = result.split(" ");
    }

    @Override
    public Iterator<String> iterator() {
        return Arrays.stream(this.words).iterator();
    }
}