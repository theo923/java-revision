import java.util.Scanner;

public class input {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("How old are you?");
    byte age = scanner.nextByte();
    System.out.println("You are " + age);

    Scanner scanner2 = new Scanner(System.in);
    System.out.println("What is your name?");
    String name = scanner2.nextLine().trim();
    System.out.println("Hello " + name);
    
  }
}
