public class Bank_Main {
    public static void main(String[] args){

        System.out.println("Defaults: ");
        Bank dep=new Bank();
        dep.display();

        Bank dep2=new Bank();
        dep2.read();
        dep2.deposit();
        dep2.withdraw();
        dep2.display();

    }
}
