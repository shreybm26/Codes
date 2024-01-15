import java.util.Scanner;

public class Student {
    private int registrationNumber;
    private String fullName;
    private String dateOfJoining;
    private short semester;
    private float gpa;
    private float cgpa;

    // Parameterized constructor
    public Student(int yearOfJoining, int studentNumber, String fullName, String dateOfJoining, short semester, float gpa, float cgpa) {
        this.registrationNumber = yearOfJoining * 100 + studentNumber;
        this.fullName = fullName;
        this.dateOfJoining = dateOfJoining;
        this.semester = semester;
        this.gpa = gpa;
        this.cgpa = cgpa;
    }

    // Display method
    public void display() {
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Full Name: " + fullName);
        System.out.println("Date of Joining: " + dateOfJoining);
        System.out.println("Semester: " + semester);
        System.out.println("GPA: " + gpa);
        System.out.println("CGPA: " + cgpa);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array to store student records
        Student[] students = new Student[1];

        // Input records and display them
        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter details for student " + (i + 1));

            System.out.print("Full Name: ");
            String fullName = scanner.nextLine();

            System.out.print("Date of Joining: ");
            String dateOfJoining = scanner.nextLine();

            System.out.print("Semester: ");
            short semester = scanner.nextShort();

            System.out.print("GPA: ");
            float gpa = scanner.nextFloat();

            System.out.print("CGPA: ");
            float cgpa = scanner.nextFloat();

            // Assuming 2012 as the year of joining for all students in this example
            students[i] = new Student(2012, i + 1, fullName, dateOfJoining, semester, gpa, cgpa);

            // Consume the newline character left in the buffer after reading float values
            scanner.nextLine();
        }

        // Display all student records
        System.out.println("Student Records:");
        for (Student student : students) {
            student.display();
        }

        scanner.close();
    }
}
