import java.util.Scanner;

/**
 * Greets the user and calculates their approximate age based on their birth year
 * @author Neil Fischer
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input 
    Scanner input = new Scanner(System.in);
    
    // Ask the user for their name 
    System.out.println("Please enter your name:"); 

    // Declare a variable to store the name of the user 
    String name; 

    // get input fot the users name 
    name = input.nextLine(); 

    // Grett the user 

    System.out.println("Hello " + name + "!");

    // declare and initialize the current year constant 

    final int CUREENT_YEAR = 2020; 

    // Prompt the user to enter their birth year 

    System.out.println("Please enter the year you were born:"); 

    // get the users birth year 

    int birthYear = input.nextInt(); 

    // Calculate the approximate age   

    int age = CUREENT_YEAR - birthYear; 

    //Tell the user their approximate age 

    System.out.println("You are " + age + " years old.");
    
  }
}
