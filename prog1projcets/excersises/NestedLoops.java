import java.util.Scanner;
public class NestedLoops {
       public static void main (String[] args) {
          Scanner scnr = new Scanner(System.in);
          int numRows;
          int numColumns;
          int currentRow;
          char currentRowLetter;
          int currentColumn;
       
          numRows = scnr.nextInt();
          numColumns = scnr.nextInt();
          currentRowLetter = 65;
          for (currentRow=1;currentRow<=numRows;currentRow++) {
             for (currentColumn=1;currentColumn<=numColumns;currentColumn++) {
                System.out.print((char)currentRowLetter + ""+ currentColumn+ " ");
             }
             currentRowLetter++;
             System.out.println("");
          }
             
    
       }
    }
    

