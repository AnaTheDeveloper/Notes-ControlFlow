public class IfElseWithOr {

  // || means or
  //Either one or the other parameters has to be true

  public String heathenSubjects(String theSubjectYouStudy) {

    //make string all lowercase OR all uppercase

    if (theSubjectYouStudy.equals("Maths")  || theSubjectYouStudy.equals("Geography") || theSubjectYouStudy.equals("Chemistry")     ) {
      return "You are indeed a heathen";
    } else {
      return "nahh you valid";
    }





  }

}
