public class Engineer extends Employee {
    private String specialization;

    public Engineer(String name, int id, double salary, String specialization) {
        super(name, id, salary);
        this.specialization = specialization;
    }

}
