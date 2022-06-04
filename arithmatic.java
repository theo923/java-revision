public class arithmatic {
  public static void main(String[] args) {
    double result = (double)10 / (double)3;
    System.out.println(result);
    
    int x = 1;
    int y = x++;
    System.out.println(x);
    System.out.println(y);

    // Implicit casting
    // byte > short > int > long > float > double
    double x1 = 1.1;
    double y1 = x1 + 2;
    System.out.println(y1);

    double x2 = 1.6;
    int y2 = (int)x2 + 2;
    System.out.println(y2);

    String x3 = "5";
    int y3 = Integer.parseInt(x3) + 2;
    System.out.println(y3);
  }
}
