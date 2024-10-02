package io.codeforall.bootcamp.exercise;

public class Ai {

    private String creationDate;
    private String name;

    // Constructor that sets values for creationDate and name
    public Ai(String creationDate, String name){
        this.creationDate = creationDate;
        this.name = name;
    }

    // Getter for creationDate
    public String getCreationDate(){
        return creationDate;
    }

    // Setter for creationDate
    public void setCreationDate(String creationDate){
        this.creationDate = creationDate;
    }

    // Getter for name
    public String getName(){
        return name;
    }

    // Setter for name
    public void setName(String name){
        this.name = name;
    }

    public int[] doubleArray(int[] array){
        int[] doubledArray = new int[array.length];
        for (int i = 0; i < doubledArray.length; i++) {
            doubledArray[i] = array[i] * 2;                
            }
        return doubledArray;
    }

    public int factorialIterative(int number){
        if (number < 0) {
            System.out.println("It is not possible to calculate the factorial for a negative number.");
        }
        int factorialNumber = 1;
        for (int i = 2; i <= number; i++){
            factorialNumber *= i;
        }
        return factorialNumber;
    }

    public int factorialRecursive(int number){
        if (number < 0) {
            System.out.println("It is not possible to calculate the factorial for a negative number.");
        }
        if (number == 0 || number == 1) {
            return 1;
        } else {
            return number * factorialRecursive(number - 1);
        }
    }

    public String palindromeReplace(String inpuString){
        String[] words = inpuString.split("\\s+");
        String result = "";

        for (String word : words){
            if (isPalindrome(word)) {
                result += "palindrome ";                
            } else {
                result += word + " ";
            }
        }
        return result.trim();
    }

    private boolean isPalindrome(String word){
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (Character.toLowerCase(word.charAt(left)) != Character.toLowerCase(word.charAt(right))){
                return false;
            }
            left++;
            right--;
    }
        return true;
    }

    public String emailValidator(){
        return "^[a-zA-Z0-9.#_-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
    }
}