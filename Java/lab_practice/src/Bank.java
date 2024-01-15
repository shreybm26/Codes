import java.util.Scanner;
public class Bank {
    String dep_name;
    int ac_num;
    String ac_type;
    int balance;
    int rate=6;

    Bank(){
        dep_name="Default Depositor";
        ac_type="Savings";
        balance=0;
    }
    Bank(String name, String type, int bal){
        dep_name=name;
        ac_type=type;
        balance=bal;
    }

    Scanner sc=new Scanner(System.in);

    void read(){
        System.out.println("\nEnter the account holder's name: ");
        dep_name=sc.nextLine();
        System.out.println("Enter the account type(Savings/Current): ");
        ac_type=sc.nextLine();
        System.out.println("Enter the account number: ");
        ac_num=sc.nextInt();
        System.out.println("Enter the first deposit amount: ");
        balance=sc.nextInt();
    }

    void deposit(){
        System.out.println("Enter the deposition amount: ");
        int deposit=sc.nextInt();
        balance+=deposit;
        System.out.println("Amount of "+deposit+" deposited successfully");
        System.out.println("Updated Balance: "+balance);

    }
    void withdraw(){
        System.out.println("Enter the withdrawal amount: ");
        int withdrawal=sc.nextInt();
        if(balance<withdrawal){
            System.out.println("Insufficient Balance");
        }
        else{
            balance-=withdrawal;
            System.out.println("Amount of "+withdrawal+" withdrawn successfully");
            System.out.println("Updated Balance: "+balance);
        }
    }
    void display(){
        System.out.println("\nDepositor details: ");
        System.out.println("Depositor Name: "+dep_name);
        System.out.println("Account Type: "+ac_type);
        System.out.println("Account Number: "+ac_num);
        System.out.println("Rate of Interest: "+rate+"%");
    }
}
