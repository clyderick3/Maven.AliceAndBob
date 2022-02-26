import java.util.Scanner;

public class Main {

    public static void main(String[] args ){
        Scanner scanner = new Scanner(System.in);
// Write a program that prompts the user to input their name.
        String name1 = "Alice";
        String name2 = "Bob";
        String name3 = "alice";
        String name4 = "bob";
        String upperCaseName;
        System.out.println("Please insert your name: ");
        String result = scanner.nextLine();
        System.out.println("Your name is " + result + ".");

        if (name1.equals(result) || name3.equals(result)) {
            System.out.println("Greetings " + name1 + ".");
        }
        else if(name2.equals(result) || name4.equals(result)) {
            System.out.println("Greetings " + name2 + ".");
        }
        else {
            System.out.println("You are not Alice or Bob. Sorry.");
        }
    }
}
