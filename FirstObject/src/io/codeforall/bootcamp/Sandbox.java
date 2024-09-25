package io.codeforall.bootcamp;

public class Sandbox {
    public static void main(String[] args) {

        Book book1 = new Book("Just for Fun", "Linus Torvald", "Harper Business", 288, "978-0066620732");
        Book book2 = new Book("The Art of Intrusion", "Kevin Mitnick", "Wiley", 288, "978-0471782667");

        System.out.println("We have two books available:");
        System.out.println(book1.getTitle() + " by " + book1.getAuthor());
        System.out.println(book2.getTitle() + " by " + book2.getAuthor());
    }
}
