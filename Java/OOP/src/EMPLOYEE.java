import java.util.Scanner;
class EMPLOYEE {
    String Ename;
    int Eid;
    double Basic;
    double DA;
    double Gross_Sal;
    double Net_Sal;

    void read() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee name: ");
        Ename = scanner.nextLine();
        System.out.print("Enter employee ID: ");
        Eid = scanner.nextInt();
        System.out.print("Enter basic salary: ");
        Basic = scanner.nextDouble();
        scanner.nextLine();
        DA = 0.52 * Basic;
        Gross_Sal = Basic + DA;
        Net_Sal = Gross_Sal * 0.7;
    }
    void display() {
        System.out.println("Employee ID: " + Eid);
        System.out.println("Employee Name: " + Ename);
        System.out.println("Basic Salary: " + Basic);
        System.out.println("Dearness Allowance (DA): " + DA);
        System.out.println("Gross Salary: " + Gross_Sal);
        System.out.println("Net Salary: " + Net_Sal);
    }
}