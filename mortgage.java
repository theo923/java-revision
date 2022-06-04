import java.util.Scanner;

public class mortgage {
  public static void main(String[] args) {
    final double MONTHS = 12;
    final double PERCENTS = 100;

    Scanner scanner = new Scanner(System.in);
    System.out.println("Principal: ");
    double principle = scanner.nextDouble();

    System.out.println("Annual Interest Rate: ");
    double rate = scanner.nextDouble() / PERCENTS / MONTHS;

    System.out.println("Period (Years): ");
    double period = scanner.nextDouble() * MONTHS;
    
    double answer = principle * (rate * Math.pow((1 + rate), period)) / (Math.pow(1 + rate, period) - (double) 1);

    System.out.println("Mortgage: $" + answer);
  }
}
