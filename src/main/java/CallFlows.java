public class CallFlows {

  public static void main(String[] args) {


  //if else
/*Non-Static example  */  TheIfStatement theIfStatement = new TheIfStatement();
                        System.out.println(theIfStatement.weatherCheck(false));



//Static Example of how to call a static method  System.out.println(TheIfStatement.weatherCheck(true));


  //if , else if , else
/*TheIfElseIfElseStatement ifElseIfElseMethodCall = new TheIfElseIfElseStatement();
    System.out.println(ifElseIfElseMethodCall.gradeResponse('F'));

 */


  //nested if/else
/*NestedIfElse nestedIfElse = new NestedIfElse();
    System.out.println(nestedIfElse.nestedIfElse(250));

 */


  //switch

   /* Switch changeSubject = new Switch();
    System.out.println(changeSubject.courseChanger("Geography"));

    */

  //if else with ||

  /*IfElseWithOr ifElseWithOr = new IfElseWithOr();
    System.out.println(ifElseWithOr.heathenSubjects("Photography"));

   */

  //if else with &&

    /*IfElseWithAndAnd ifElseWithAndAnd = new IfElseWithAndAnd();
    System.out.println(ifElseWithAndAnd.canBuyAlcoholChecker(21, true, 9));

     */

  //if else with || and &&

    IfElseWithOrAndAnd ifElseWithOrAndAnd = new IfElseWithOrAndAnd();
    System.out.println(ifElseWithOrAndAnd.doesChildDeserveIceCream(true, true, false));

  //if else with !

    IfElseExclamationMark ifElseExclamationMark = new IfElseExclamationMark();
    System.out.println(ifElseExclamationMark.isItRaining(false));

  //try catch
ControlFlowCatch controlFlowCatch = new ControlFlowCatch();


controlFlowCatch.divisionCalculator(10,0);




  //try throw
 ControlFlowThrow controlFlowThrow = new ControlFlowThrow();

 try {
   System.out.println(controlFlowThrow.divisionCalculatorVersionTwo(2,0));
 } catch (Exception e){
   System.out.println("You are trying to divide by zero THE SECOND MSG");
 }


}
}
