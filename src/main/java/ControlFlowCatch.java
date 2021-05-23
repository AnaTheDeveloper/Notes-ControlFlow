import java.io.PrintStream;

public class ControlFlowCatch {
//Handling Errors

  //Error:This pops up BEFORE programme is run. Programme cannot run without it being fixed.

  //Exception: This pops up WHILE the programme us running and will CRASH the programme unless it is caught/thrown.




  public void divisionCalculator( int a, int b) {

    try {
      System.out.println("The division of your two numbers is equal to: "+ a/b);
      //other catches are written here before you get to exception e
    } catch (Exception e) {
      System.out.println("You cannot not divide by zero dummy!");
    }

  }

//Its called Exception e because its a more general exception. but i different exceptions require different catches.


}
