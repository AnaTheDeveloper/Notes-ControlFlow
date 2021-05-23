public class Switch {

  public String courseChanger(String courseToChangeTo) {

    String course = courseToChangeTo;

    switch(course){

      case "Maths":
        return "Your new course is Maths!";
      case "Physics":
        return "Your new course is Physics!";
      case "Biology":
        return "Your new course is Biology!";
      default:
        return "I am sorry to inform you but we cannot find your course.";
    }








  }

}
