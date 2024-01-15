public class Salesperson extends Employee {
    private int salesCount;

    public Salesperson(String name, int id, double salary, int salesCount) {
        super(name, id, salary);
        this.salesCount = salesCount;
    }

}
