import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      boolean chipsSold;   // Snack items
      boolean fruitSold;
      boolean nutsSold;
      boolean juiceSold;   // Drink items
      boolean waterSold;
      boolean coffeeSold;
      

      chipsSold = scnr.nextBoolean();
      fruitSold = scnr.nextBoolean();
      nutsSold = scnr.nextBoolean();
      
      juiceSold = scnr.nextBoolean();
      waterSold = scnr.nextBoolean();
      coffeeSold = scnr.nextBoolean();
     
      
            if (chipsSold && fruitSold && nutsSold != false ) {
            System.out.print("All-snacks ");
            }
              else {
                 if (chipsSold == false) {}   
                     else {
                     System.out.print("Chips ");
                   }
                  if (fruitSold == false) {}   
                     else {
                      System.out.print("Fruit ");
                    } 
                  if (nutsSold == false) {}   
                     else {
               System.out.print("Nuts ");
                   }
             }
       
            if (juiceSold && waterSold && coffeeSold != false) {
               System.out.print("All-drinks ");
               }
               else {
                  if (juiceSold == false) {}   
                     else {
                 System.out.print("Juice ");
                 }
                  if (waterSold == false ) {}       
                     else {
                  System.out.print("Water ");
                 }
                 if (coffeeSold == false) {} 
                     else { 
                  System.out.print("Coffee ");
                    }
              
     System.out.println();  
   }
   
   }
}
