class Multiplication extends Thread{
    private int number;
    public Multiplication(int number){
        this.number=number;
    }
    @Override
    public void run(){
        System.out.println("Multiplication Table for "+number+" :");
        for(int i=1;i<=10;i++){
            System.out.println(number+" * "+i+" = "+(number*i));
        }
    }
}
