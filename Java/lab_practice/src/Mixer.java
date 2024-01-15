import java.util.Scanner;
public class Mixer {
    int[] arr;
    int size;

    void accept(){
        System.out.println("Enter the size of the array: ");
        Scanner sc=new Scanner(System.in);
        size=sc.nextInt();
        arr=new int[size];
        System.out.println("Enter the elements: ");
        arr[0]=sc.nextInt();
        for(int i=1;i<size;i++){
            int ele=sc.nextInt();
            if(ele>arr[i-1]){
                arr[i]=ele;
            }
            else{
                System.out.println("Enter the elements in ascending order: ");
            }
        }

    }
    Mixer mix(Mixer A){
        Mixer result=new Mixer();
        result.size=size +A.size;
        result.arr=new int[result.size];

        int i=0,j=0,k=0;
        while(i< size&&j< A.size){
            if(arr[i]<A.arr[j]){
                result.arr[k++]=arr[i++];
            }else{
                result.arr[k++]=A.arr[j++];
            }
        }
        while(i<size){
            result.arr[k++]=arr[i++];
        }
        while(j<A.size){
            result.arr[k++]=A.arr[j++];
        }
        return result;

    }
    void display(){
        System.out.println("The merged array is: ");
        for(int i=0;i<size;i++){
            System.out.println(arr[i]+"\t");
        }
    }

}
