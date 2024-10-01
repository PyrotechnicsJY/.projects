import java.util.Scanner;
public class Main1{
   public static void main(String[] args) {
    double pi = 0.0 ;
    int i;
    int sign = 1;
    
    for (i=1;i<1000;i+=2) {
        if (i>2) {
            sign = (-1) * sign;
         pi = pi+sign*((double)4/i);
         if(pi>=3.1459 && pi<3.141591);
         break;

        }

     }
    }
}