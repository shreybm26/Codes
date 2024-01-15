import java.util.Calendar;
import java.util.Date;
public class Person_main {
    public static void main(String[] args){
        Date birthDate=new Date(2004, Calendar.MAY,26);
        Person person=new Person("Shrey Bhardwaj", birthDate);
        System.out.println("The name of the person: "+person.getName());
        System.out.println("The birth date of the person is: "+person.getBirthDate());

        CollegeGraduate college=new CollegeGraduate("Shrey Bhardwaj", birthDate, 8.19, 2026);
        System.out.println("The name of the person: "+college.getName());
        System.out.println("The birth date of the person is: "+college.getBirthDate());
        System.out.println("The GPA of the person: "+college.getGPA());
        System.out.println("The graduation year of the person is: "+college.getGraduationYear());

    }
}
