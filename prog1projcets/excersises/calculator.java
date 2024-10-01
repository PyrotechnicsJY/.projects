import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    int userChoice, num1, num2;
    int sum, diff, mult;
    System.out.println("Please enter two integers:");
    num1 = scnr.nextInt();
    num2 = scnr.nextInt();
    while(true){
        System.out.println("Enter 1 to add \nEnter 2 to subtract\nEnter3 to multiple \nEnter 4 to quit");
        userChoice = scnr.nextInt();
        if((userChoice<1) || (userChoice>4)){ 
            System.out.println("Enter a valid choice between 1 to 4:");
            continue; } 
        if (userChoice == 4)  break;
        if (userChoice == 1) {
            System.out.println("Addition of your numbers is " + (num1+num2)); 
        }
        else if (userChoice == 2)
        System.out.println("Subtraction of your numbers is " + (num1-num2));
        else if (userChoice == 3) {
            System.out.println("Multiplication of your numbers is " + (num1*num2));
        }
        System.out.println("Please enter your next choice ");
    }
    System.out.println("Thanks for using our caculator");
}
}