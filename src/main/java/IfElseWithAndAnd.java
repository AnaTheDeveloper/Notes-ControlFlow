public class IfElseWithAndAnd {


  // With and all of the conditions have to be true or the code to run through it

  public String canBuyAlcoholChecker(int age, boolean haveIdOnThem, double moneyOnThem) {

    if (age > 18   && haveIdOnThem == true && moneyOnThem >= 10      ) {
      return "What alcohol would you like?";

    } else if (age > 18 && haveIdOnThem ==true) {
      return "You are eligible to buy alcohol, but you have no money!";

      //if returning then no void, if printing in method tis void because its not being called in the main




    }



    else {



      return "Sorry, you cannot buy alcohol.";
    }






  }

}
