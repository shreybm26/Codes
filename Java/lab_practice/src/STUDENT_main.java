import java.util.Scanner;
public class STUDENT_main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

//        STUDENT student1=new STUDENT();
//        student1.compute();
//        student1.display();

        System.out.println("Enter the Science student name: ");
        String name=sc.nextLine();
        System.out.println("Enter the number of subjects: ");
        int n=sc.nextInt();
        System.out.println("Enter the marks: ");
        int[] marks=new int[n];
        for(int i=0;i<n;i++){
            marks[i]=sc.nextInt();
        }
        System.out.println("Enter the practical marks: ");
        int practical_marks=sc.nextInt();

        ScienceStudent science_student=new ScienceStudent(name,marks,practical_marks);
        science_student.compute();
        science_student.display();
    }
}
