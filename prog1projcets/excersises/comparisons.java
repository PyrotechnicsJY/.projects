package excersises;

import java.util.Scanner;

public class comparisons { 
  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    int howManyComparisons;
    int min;
    int max;
    int i;
    int n; 

    howManyComparisons = scnr.nextInt();
    min = scnr.nextInt();
    max = scnr.nextInt();

    for (i=0; i<howManyComparisons;i++) { 
        n = scnr.nextInt();
        if (n<=max && n>=min) {
            System.out.println(n + " is within the range between " + min + " and " + max);
        }
        else {
            System.out.println(n + " is not  within the range between " + min + " and " + max);
        }
    }
  }
}



