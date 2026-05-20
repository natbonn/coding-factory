package gr.aueb.cf.ch11;

public class Main {

    public static void main(String[] args) {
        Student alice = new Student();    //Default Constructor - παίρνουν default τιμές // είναι μέθοδος και δεν παίρνει παράμετρο - μας το δίνει η java
        Student bob = new Student();
        Student student = new Student();

        System.out.println("Student instances count: "+ Student.getStudentCount());

        Student student2 = new Student(4, "Dennis", "D.");
        Student student3 = new Student(5, "Eva", "P.");


        //Set values
        alice.setId(1);
        alice.setFirstname("Alice");
        alice.setLastname("W.");

        bob.setId(2);
        bob.setFirstname("Bob");
        bob.setLastname("J.");

        student.setId(3);
        student.setFirstname("Student");
        student.setLastname("K.");

        //Get values
        System.out.println("Alice Id: " + alice.getId());
        System.out.println("Alice Firstname: " + alice.getFirstname());
        System.out.println("Alice Lastname: " + alice.getLastname());

        System.out.println("Bob Id: " + bob.getId());
        System.out.println("Bob Firstname: " + bob.getFirstname());
        System.out.println("Bob Lastname: " + bob.getLastname());

        System.out.println("Student Id: " + student.getId());
        System.out.println("Student Firstname: " + student.getFirstname());
        System.out.println("Student Lastname: " + student.getLastname());



    }
}
