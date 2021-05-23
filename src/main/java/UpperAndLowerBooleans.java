public class UpperAndLowerBooleans {

  boolean anasUsername = true;

  boolean lukesUsername = false;




  //Lowercase Boolean

  public void accountCheck(/* boolean*/ Boolean thePersonsUsername) {

    if (thePersonsUsername == true) {
      System.out.println("connecting to database, loading your game...");
    }

    if (thePersonsUsername == false) {
      System.out.println("Your password was wrong, please retry again.");
    }


    if (thePersonsUsername == null) {
      System.out.println("You do not have an account. Please sign up.");
    }
    //Luke hasnt signed up to an account yet, so how do we know if his password was wrong or if he just doesnt have an account.
    //Lower case boolean produces the error [Operator '==' cannot be applied to 'boolean', 'null'] in the terminal. To fix this issue chage the boolean to a upper case boolean.

  }








  //Uppercase Boolean

}
