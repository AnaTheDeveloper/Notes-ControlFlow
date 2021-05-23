public class TheIfElseIfElseStatement {

//We use .equals() on strings because they are objects not primatives. Strings are their own built in Java class.

//Lower case boolean is either true or false.
//Upper case Boolean can either be Booleantrue, Booleanfalse or Booleannull.  We use upper case Boolean to check against a boolean that is null.

  public String gradeResponse(char gradeReceived) {

    //Accounting for human error, what if they out in a lower case a, it would output the else statement tot he terminal instead of the first statement.
    //To solve this we made sure that whatever parameter the user inputted was automatically turned into upper case.
      char gradeInUpper = Character.toUpperCase(gradeReceived);


    if (gradeInUpper == 'A' ) {
      return "Well done! Good child! Now do better!!!";
    } else if(gradeInUpper == 'B') {
      return "You could of done better! Im disappointed >:(";
    } else {
      return "Absolute FAILURE of a human being!";
    }


  }






}
