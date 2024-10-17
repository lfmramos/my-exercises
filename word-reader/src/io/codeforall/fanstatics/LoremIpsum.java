package io.codeforall.fanstatics;

import java.util.Random;

public class LoremIpsum {
    private static final String[] WORDS = {
            "lorem", "ipsum", "dolor", "sit", "amet", "consectetur",
            "adipiscing", "elit", "sed", "do", "eiusmod", "tempor",
            "incididunt", "ut", "labore", "et", "dolore", "magna",
            "aliqua"
    };

    private Random random = new Random();

    public String getParagraph() {
        StringBuilder paragraph = new StringBuilder();
        int wordCount = 50 + random.nextInt(50); // Random word count between 50 and 100
        for (int i = 0; i < wordCount; i++) {
            paragraph.append(WORDS[random.nextInt(WORDS.length)]).append(" ");
        }
        return paragraph.toString().trim() + ".";
    }
}