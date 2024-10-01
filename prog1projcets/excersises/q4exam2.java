public class q4exam2 {
   public static void main(string[] args){
   System.out.println("Select a color: \n 0 red \n 1 Green \n 2 blue \n");
   Scanner scnr = new Scanner(System.in);
   int userColor = new scnr.nextInt();
   While ((userColor < 0)|| (userColor>2)){
    System.out.print("Please choose a valid number");
    System.out.println("Select a color: \n 0 red \n 1 Green \n 2 Blue \n ");
    userColor = scnr.nextInt();

   }
   System.out.println("Congrats your color is number:" + userColor);




   } 
}
