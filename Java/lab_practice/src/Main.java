import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: \n");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array\n");
        for(int i=0;i<n;i++){
            int num=sc.nextInt();
            arr[i]=num;
        }
        System.out.println("\nThe original array is: \n");
        for(int i=0;i<n;i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println("\nThe prime numbers in the array are: \n");
        for(int i=0;i<n;i++){
            if(arr[n-1]%arr[i]!=0){
                System.out.println(arr[i]);
            }
        }


    }
}