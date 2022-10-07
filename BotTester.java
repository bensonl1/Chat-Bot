import java.util.Scanner;

public class BotTester
{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Hello. What is your name?");
    String name = input.nextLine();
    Bot one = new Bot(name);
    one.greeting();
    one.help();
    System.out.println("How many feet in a mile?");
    one.feetInMile();
    one.goodbye();
    }
}
