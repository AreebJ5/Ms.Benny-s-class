import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  int[] numSeats = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
 String[] studentNames = new String[15];
 //This is where my scanner is 
 Scanner scan = new Scanner(System.in);
 //This is where my for loop is 
 for (int i = 0; i < studentNames.length; i++)
 {
 System.out.println("Enter your name below.");
 //Program so students can add their names
 studentNames [i] = scan.next();
 }
 int i = 0;
 //Added a while loop
 while (numSeats [i] <= studentNames.length) 
   {
 //Prints out the Students names with their seat number    
 System.out.println( studentNames [i] + " please sit in seat " + numSeats [i]);
 i++;
   }
  }
}






