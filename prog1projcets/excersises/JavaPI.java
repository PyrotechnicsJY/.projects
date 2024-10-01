import java.util.Scanner;
public class JavaPI{
   public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    String simonPattern;
    String userPattern;
    int userScore;
    int i;
    int stringLength;

 
    userScore = 0;
    System.out.println("Please input the character length of the words both must be the same length ");
    stringLength = scnr.nextInt();
    System.out.println("Enter the simonword and the input word ");
    simonPattern = scnr.next();
    userPattern  = scnr.next();

   
    for(i=0;i<stringLength;i++){
       if (simonPattern.charAt(i) == userPattern.charAt(i)) {
          ++userScore;
       }

    }

    System.out.println("userScore: " + userScore);
    System.out.println(simonPattern.charAt(4));

    return;
  
    
    }
}