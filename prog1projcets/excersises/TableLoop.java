import java.util.Scanner;
public class TableLoop{
   public static void main(String[] args) {
    int days = 1;
    int startDate; 
    
   for (int i=1; i<=5;i++){ 

    for (int j=1;j<=7; j++){
        if (days<=30){
        System.out.print(days + "\t");
        
        }
        else {
            System.out.print(0 + "\t");
        
        }
        days++;
    }
    System.out.println("");
   }
    
    
    }
}