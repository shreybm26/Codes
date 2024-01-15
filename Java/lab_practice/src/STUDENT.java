import java.util.Scanner;
public class STUDENT {
    String sname;
    int[] marks_array=new int[5];
    int total;
    double avg;

    STUDENT(){
        sname="Default Student";
        for(int i=0;i< marks_array.length;i++){
            marks_array[i]=0;
        }
    }
    STUDENT(String name, int[] marks){
        sname=name;
        marks_array=marks;
    }
    void assign(String name, int[] marks){
        sname=name;
        marks_array=marks;
    }
    void compute(){
        total=0;
        for(int i=0;i< marks_array.length;i++){
            total+=marks_array[i];
        }
        avg=(double) total/ marks_array.length;
    }
    void display(){
        System.out.println("Student name: "+sname);
        System.out.println("Marks of the student: ");
        for(int i=0;i< marks_array.length;i++){
            System.out.println(marks_array[i]+"\t");
        }
        System.out.println("Total Marks: "+total);
        System.out.println("Average Marks: "+avg);
    }
}

class ScienceStudent extends STUDENT{
    private int practical_marks;
    ScienceStudent(String name, int[] marks, int practicalmarks){
        super(name,marks);
        this.practical_marks=practicalmarks;
    }
    @Override
    void compute(){
        super.compute();
        total+=practical_marks;
        avg=(double)total/(marks_array.length+1);
    }
    void displaypractical(){
        System.out.println("Practical Marks: "+practical_marks);
    }
}

class ArtsStudent extends STUDENT{
    private String elective;
    ArtsStudent(String name, int[] marks, String elective){
        super(name,marks);
        this.elective=elective;
    }
    void display_elective(){
        System.out.println("The Elective Subject of the student is: "+elective);
    }
}
