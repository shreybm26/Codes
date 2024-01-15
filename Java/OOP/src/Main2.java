import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Mixer mixer1 = new Mixer();
        System.out.println("Enter details for Array 1:");
        mixer1.accept();

        Mixer mixer2 = new Mixer();
        System.out.println("Enter details for Array 2:");
        mixer2.accept();

        Mixer mergedMixer = mixer1.mix(mixer2);

        System.out.println("\nMerged Array:");
        mergedMixer.display();
    }
}