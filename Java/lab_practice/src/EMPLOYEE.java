import java.util.Scanner;
public class EMPLOYEE {
    String Ename;
    int Eid;
    double Basic;
    double DA;
    double Gross_Sal;
    double Net_Sal;

    EMPLOYEE(){
        Ename="Default Employee";
        Eid=0;
        Basic=0;
    }

    EMPLOYEE(String name, int id, double base){
        Ename=name;
        Eid=id;
        Basic=base;
    }

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
    String formatName(){
        String[] words=Ename.split(" ");
        StringBuilder formatted=new StringBuilder();
        for(String word:words){
            if(!word.isEmpty()){
                if(formatted.length()>0){
                    formatted.append(" ");
                }
                formatted.append(Character.toUpperCase(word.charAt(0)));
                formatted.append(word.substring(1).toLowerCase());
            }
        }
        return formatted.toString();
    }

    void generate_email(){
        String[] parts=Ename.split(" ");
        String firstname=parts[0].toLowerCase();
        String lastname=parts[1].toLowerCase();
        String email=firstname.charAt(0)+lastname+"@gmail.com";

        System.out.println(email);
    }
    void display() {
        System.out.println("Employee ID: " + Eid);
        System.out.println("Employee Name: " +Ename);
        System.out.println("Basic Salary: " + Basic);
        System.out.println("Dearness Allowance (DA): " + DA);
        System.out.println("Gross Salary: " + Gross_Sal);
        System.out.println("Net Salary: " + Net_Sal);
    }
}