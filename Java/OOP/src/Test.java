import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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
        }
    }
}