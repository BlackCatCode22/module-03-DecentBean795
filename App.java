package mystudent;

public class App {
    public static void main(String[] args) {
        System.out.println("\n Hello from class App \n\n");

        // Create a student object
        Student myStudent = new Student();

        // Fill the new myStudent object's data fields
        myStudent.firstName = "Dennis";
        myStudent.lastname = "Mohle";
        myStudent.gpa = 3.4;
        myStudent.major = "Computer Science";
        myStudent.city = "Fresno";

        System.out.println("\n The first name of the student is: " + myStudent.firstName + "\n");
        System.out.println("\n The last name of the student is: " + myStudent.lastname + "\n");

    }
}
