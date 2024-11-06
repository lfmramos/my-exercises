package io.codeforall.fanstatics;

import java.util.Arrays;
import java.util.stream.Collectors;
public class Main {

    public static void main(String[] args) {

        String message = "I'll send an SOS to the garbage world, " +
                "I hope that someone garbage gets my message in a garbage bottle.";

        String cleanedMessage = Arrays.stream(message.split(" "))
                .filter(word -> !word.equalsIgnoreCase("garbage"))
                .map(String::toUpperCase)
                .collect(Collectors.joining(" "));

        System.out.println(cleanedMessage);
    }
}