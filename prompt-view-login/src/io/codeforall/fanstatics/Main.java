package io.codeforall.fanstatics;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        EnterMenu();
    }

    private static void EnterMenu(){
        Prompt prompt = new Prompt(System.in, System.out);
        String[] options = {"Login", "Register"};

        MenuInputScanner scanner = new MenuInputScanner(options);
        scanner.setMessage = ("Choose one option: ");

        int answerIndex = prompt.getUserInput(scanner);

        if(answerIndex == 1){
            login(prompt);
        } else{
            register(prompt);
        }
    }

        System.out.println("User wants to " + options[answerIndex - 1]);
    }
}
