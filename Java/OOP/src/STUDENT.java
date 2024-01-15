import java.util.Scanner;
class STUDENT {
    String sname;
    int[] marks_array = new int[5];
    int total;
    double avg;
    void assign(String name, int[] marks) {
        sname = name;
        marks_array = marks;
    }
    void compute() {
        total = 0;
        for (int mark : marks_array) {
            total += mark;
        }
        avg = (double) total / marks_array.length;
    }
    void display() {
        System.out.println("Student Name: " + sname);
        System.out.print("Marks: ");
        for (int mark : marks_array) {
            System.out.print(mark + " ");
        }
        System.out.println("\nTotal Marks: " + total);
        System.out.println("Average Marks: " + avg);
    }
}