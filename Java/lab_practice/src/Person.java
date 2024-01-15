import java.util.Date;
public class Person {
    private String name;
    private Date birthDate;

    public Person(String name, Date birthDate){
        this.name=name;
        this.birthDate=birthDate;
    }
    public String getName(){
        return name;
    }
    public Date getBirthDate(){
        return birthDate;
    }

}
class CollegeGraduate extends Person{
    private double GPA;
    private int graduationYear;

    public CollegeGraduate(String name, Date birthDate, double GPA, int graduationYear){
        super(name,birthDate);
        this.GPA=GPA;
        this.graduationYear=graduationYear;
    }
    public double getGPA(){
        return GPA;
    }
    public int getGraduationYear(){
        return graduationYear;
    }
}
