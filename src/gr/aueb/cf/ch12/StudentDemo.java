package gr.aueb.cf.ch12;

public class StudentDemo {

    public static void main(String[] args) {
        Student student = new Student();                                     // Invoke Default Constructor
        Student bob = new Student(2, "Bob", "D.");      // Invoke Overloaded Constructor
                                                                            // and populate instance

//        student.id = 1;
//        student.firstname = "Alice";
//        student.lastname = "W.";

        student.setId(1);
        student.setFirstname("Alice");
        student.setLastname("W.");

        System.out.println("Id: " + student.getId());
        System.out.println("Fistname: " + student.getFirstname());
        System.out.println("Lastname: " + student.getLastname());

        System.out.println("Id: " + bob.getId());
        System.out.println("Fistname: " + bob.getFirstname());
        System.out.println("Lastname: " + bob.getLastname());

        System.out.println("Student instances' count: " + Student.getStudentsCount());

//        System.out.println("Id: " + student.id);
//        System.out.println("Firstname: " + student.firstname);
//        System.out.println("Lastname: " + student.lastname);
    }
}
