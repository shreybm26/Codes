public class Tables{
    public static void main(String[] args) throws InterruptedException {
        Multiplication t1=new Multiplication(5);
        Multiplication t2=new Multiplication(7);
        t1.start();
        Thread.sleep(1000);
        t2.start();
    }
}