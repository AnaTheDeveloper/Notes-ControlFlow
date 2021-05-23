public class IfElseWithOrAndAnd {


  public String doesChildDeserveIceCream(boolean haveTheyBeenKind, boolean haveTheyGotGoodGrades, boolean haveTheyDoneChores) {



    if ( haveTheyBeenKind == true && (haveTheyGotGoodGrades == true || haveTheyDoneChores == true) ) {

      return "You do get ice cream!";
    } else {

      return "You do NOT get ice cream";
    }









  }

}
