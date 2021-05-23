public class ControlFlowThrow {


  public int divisionCalculatorVersionTwo(int a, int b) throws Exception {

      if (b == 0) {
        throw new Exception("You cannot divide by zero");
      } else {
        return a/b;
      }







  }

}
