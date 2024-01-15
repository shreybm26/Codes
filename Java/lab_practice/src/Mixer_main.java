import java.util.Scanner;
public class Mixer_main {
    public static void main(String[] args){
        Mixer mixer1=new Mixer();
        System.out.println("Enter the details for array 1: ");
        mixer1.accept();

        Mixer mixer2=new Mixer();
        System.out.println("Enter the details for array 2: ");
        mixer2.accept();

        Mixer merged=mixer1.mix(mixer2);
        System.out.println("The merged array is: ");
        merged.display();
    }
}
