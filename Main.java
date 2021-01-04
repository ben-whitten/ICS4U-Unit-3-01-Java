/*
* The Main program implements an application that
* can reverse a string.
*
* @author  Ben Whitten
* @version 1.1
* @since   2021-1-4
*/

import java.util.Scanner;  // Import the Scanner class

///////////////////////////////////////////////////////////////////////////////

class Main {

  /////////////////////////////////////////////////////////////////////////////

  /**
   * This function handles all the inputs and outputs.
   */
  public static void main(String[] args) {

    Reverse reverse = new Reverse();

    // Creating a scanner.
    Scanner scanString = new Scanner(System.in);
    
    System.out.println("Input a string you would like to reverse:");

    String chosenString = scanString.nextLine();

    System.out.println("The reversed string is: "
                       + reverse.reverseString(chosenString));

  }

  /////////////////////////////////////////////////////////////////////////////
}
