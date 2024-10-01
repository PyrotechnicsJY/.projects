import java.util.Scanner;
public class Cyclone{ // global array, scanner object, and
     static final int gMAX_CYCLONES = 50;
     static Scanner gCONSOLE = new Scanner(System.in);
     static int gDatabasesize = 1;
     static int[] gWindSpeed= new int[gMAX_CYCLONES];
    
public static void addUpdCyclone (){
    int index = getValidatedValue("Enter the index (0 to " + (gDatabasesize-1) + " ): ", (gDatabasesize-1));
    System.out.println("The current wind speed at the cyclone at "+ index + " is: " + gWindSpeed[index]);
    int windspeed = getValidatedValue("Enter the new windspeed (0-1000): ", 1000);
    gWindSpeed[index] = windspeed;
    System.out.println();
}
public static void Summary(){
    System.out.println("Cyclones' Classification Sumamary");
    getCyclonesbyClass();
    System.out.println();
}
public static void getCyclonesbyClass() {
int depression0 =0,storm1 = 0, hurcat1 =0, hurcat2 =0,  hurcat3 =0, hurcat4 =0, hurcat5 =0;
for(int i = 0;i<(gDatabasesize -1);i++){
    if(gWindSpeed[i] < 38 && gWindSpeed[i] > 0){
        depression0++; 
    }
    if(gWindSpeed[i] < 73 && gWindSpeed[i] > 39){
        storm1++;
    }
    if(gWindSpeed[i] <= 95 && gWindSpeed[i] > 74){
        hurcat1++;
    }
    if(gWindSpeed[i] <= 110 && gWindSpeed[i] > 96){
        hurcat2++;    
    }
    if(gWindSpeed[i] <= 129 && gWindSpeed[i] > 111){
        hurcat3++;
    }
    if(gWindSpeed[i] <= 156 && gWindSpeed[i] > 130){
        hurcat4++;
    }
    if(gWindSpeed[i] <= 1000 && gWindSpeed[i] >= 157){
        hurcat5++;
    }
    
}
    System.out.println("Tropical Depression  : " + depression0);
    System.out.println("Tropical Storm       : "+ storm1);
    System.out.println("Hurricane Category 1 : "+ hurcat1);
    System.out.println("Hurricane Category 2 : "+ hurcat2);
    System.out.println("Hurricane Category 3 : "+ hurcat3);
    System.out.println("Hurricane Category 4 : "+ hurcat4);
    System.out.println("Hurricane Category 5 : "+ hurcat5);

}
public static void clearDatabase(){
    // sets 0 for every element in the array 
    for(int i =0;i<gDatabasesize-1;i++){
        gWindSpeed[i]=0;
    } 
    System.out.println();
}

public static int getValidatedValue(String options, int max){ 
    // validates a user's input along with the the text the program requires 
    int input;
    int count = 0;
    do{
        System.out.print(options + " ");
        input = gCONSOLE.nextInt();
        if(input < 0 || input > max){
            System.out.println("Invalid value, please try again. ");
        } 
        if(input >= 0 && input <=max){
        count++;
        }
    }
    while(count != 1);
    return input;
}
public static void showCyclones(){
    System.out.println("List Of Cyclones' Windspeed");
    for(int i =0; i < gDatabasesize;i++){
        System.out.println("Cyclone[" + i +"] : " + gWindSpeed[i]);
    }
    System.out.println();
}
public static void swapCyclones(){
boolean validIndex = false;    
int idxFrom = getValidatedValue("Enter the posistion from 0 to " + (gDatabasesize-1) + ") : ", gDatabasesize);
int idxTo;
do{
    idxTo = getValidatedValue("Enter the posistion to change to (0 to " + (gDatabasesize-1) +") that is not " + idxFrom + ": ", gDatabasesize);
    if ( (idxFrom != idxTo) ){
        validIndex = true;
    }
}
while(!validIndex);
swapValues(idxFrom,idxTo);
System.out.println();
}
public static void swapValues(int idxFrom, int idxTo){
    int temp =0;
    temp = gWindSpeed[idxFrom]; 
    gWindSpeed[idxFrom] = gWindSpeed[idxTo];
    gWindSpeed[idxTo] = temp;
}
public static void main(String[] args){
    int menuNum; 
    String menuString = "MAIN MENU\n 0 - Exit, 1 - Add/Update a cyclone, 2 - Summary, 3 - Clear Database, 4 - Show Cyclones, 5 - Swap Cyclones";
        
    System.out.println("Fall2023 - UTSA - CS1083 - Section 001 - Project 2 - Cyclone - written by Christopher Delgado\n");
    gDatabasesize = getValidatedValue("Please enter the number of cyclones in the database (Max 50): ",gMAX_CYCLONES);

do{
    System.out.println(menuString);
    menuNum = getValidatedValue("Select an option:", 5);
    if (menuNum == 1){
        addUpdCyclone();
    }
    if (menuNum == 2 ){
       Summary();
    }
    if(menuNum == 3 ){
        clearDatabase();
    }
    if(menuNum == 4){
        showCyclones();
    }
    if(menuNum == 5){
        swapCyclones();
    }
}
while (menuNum != 0);

System.out.print("Thank you for using the Cyclone Database Program!");
 
}
}
