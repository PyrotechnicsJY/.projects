import java.util.Scanner;

public class PrintCustomizedDiamond {
    public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    int x;

    System.out.print("Enter a letter: ");
    char letter = scnr.next().charAt(0);


    while (true) {
        System.out.print("Enter a size (even number no less than 6): ");
         x = scnr.nextInt();
        if (x >= 6 && x % 2 ==0){
            break;
        }
    }
    System.out.println("");
    int halfOfX= x/2;
    for (int i = 1; i <=halfOfX;i++) {
         for (int j =0;j< halfOfX - i;j++){
        System.out.print(" ");
        }
        for (int j = 0; j<2 * i;j++){
            System.out.print(letter);
        }
        System.out.println("");
        }
    for (int l = halfOfX;l>0;l--){
        for ( int k = 0;k<halfOfX - l;k++){
            System.out.print(" ");
        }
        for (int k = 0;k<2*l;k++){
            System.out.print(letter);
        }
        System.out.println();
    }



    
    




  }
}
