import java.util.Scanner;
public class timesTable { 
  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    int factor1; 
    int factor2; 
    int product; 
    int hey;

    System.out.print("Please enter an Integer");
    factor1 = scnr.nextInt();
    for (factor2 = 0;factor2<=20;factor2++) {
        product = factor1 * factor2; 
        System.out.println(factor1 + " x " + factor2 + " = " + product);
    }
hey = 12 % 2;
System.out.print(hey);
  }
}
