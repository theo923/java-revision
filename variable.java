import java.util.Date;

public class variable {
  public static void main(String[] args) {
    // primitive type
    byte age = 30;
    long viewsCount = 3_234_543_876L;
    float price = 49.68F;
    char letter = 'A';
    boolean isEligible = false;
    
    System.out.println(age);
    System.out.println(viewsCount);
    System.out.println(price);
    System.out.println(letter);
    System.out.println(isEligible);

    // reference type
    Date now = new Date();
    String message = "Hello World" + "!!";

    System.out.println(now);
    System.out.println(now.getTime());
    System.out.println(message);
    System.out.println(message.endsWith("!!"));
    System.out.println(message.indexOf('e'));
    System.out.println(message.indexOf("sky"));
    System.out.println(message.replace("!!", "**"));
    System.out.println(message.toLowerCase());
    
    // constant
    final float pi = 3.14F;
    System.out.println(pi);

  }
}
