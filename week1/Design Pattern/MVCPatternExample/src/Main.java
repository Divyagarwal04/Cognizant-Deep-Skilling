public class Main {

    public static void main(String[] args) {

        Student model = new Student("Divya",101);

        StudentView view = new StudentView();

        StudentController controller =
                new StudentController(model,view);

        controller.updateView();

        controller.setStudentName("Rahul");

        controller.updateView();

    }

}