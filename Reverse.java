/*
* The Reverse program implements an application that
* reverses a string.
*
* @author  Ben Whitten
* @version 1.1
* @since   2021-1-4
*/

///////////////////////////////////////////////////////////////////////////////

public class Reverse {

  /////////////////////////////////////////////////////////////////////////////
  /**
   * Reverse function.
   */
  public String reverseString(String someString) {

    if (someString.isEmpty()) {
      return someString;
    } else {
      return reverseString(someString.substring(1)) + someString.charAt(0);
    }
  }
}
