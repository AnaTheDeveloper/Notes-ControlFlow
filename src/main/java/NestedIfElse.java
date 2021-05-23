public class NestedIfElse {

  public String nestedIfElse(int speedOfCar) {
    //speed of carr is in mph

    if (speedOfCar >= 60) {

      if ( speedOfCar >= 150) {
        return "You are banned from driving!";
      }

      else {
        return "You have a formal warning. Stay under 60 MPH!";
      }


    } else {

      return "You are under the speed limit";
    }





  }

}
