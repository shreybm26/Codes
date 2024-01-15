import java.util.Scanner;
public class EMPLOYEE_main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        EMPLOYEE employee=new EMPLOYEE();
        employee.display();

        System.out.print("Enter the number of employees: ");
        int N = scanner.nextInt();

        EMPLOYEE[] employees = new EMPLOYEE[N];

        for (int i = 0; i < N; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1) + ":");
            employees[i] = new EMPLOYEE();
            employees[i].read();
        }

        System.out.println("\nEmployee Details:");
        for (int i = 0; i < N; i++) {
            System.out.println("\nEmployee " + (i + 1) + " Details:");
            employees[i].display();
            String formatted = employees[i].formatName();
            System.out.println("Formatted Employee Name: " + formatted);
            System.out.println("The email of the employee is: ");
            employees[i].generate_email();
        }
    }
}