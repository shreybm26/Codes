import java.util.Scanner;
class Mixer {
    int arr[];
    int size;

    void accept() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        size = scanner.nextInt();
        arr = new int[size];
        System.out.println("Enter elements in ascending order without duplicates:");
        arr[0] = scanner.nextInt();
        for (int i = 1; i < size; i++) {
            int element = scanner.nextInt();
            if (element > arr[i - 1]) {
                arr[i] = element;
            } else {
                System.out.println("Element must be greater than " + arr[i - 1]);
                i--;
            }
        }
    }
    Mixer mix(Mixer A) {
        Mixer result = new Mixer();
        result.size = size + A.size;
        result.arr = new int[result.size];

        int i = 0, j = 0, k = 0;

        while (i < size && j < A.size) {
            if (arr[i] < A.arr[j]) {
                result.arr[k++] = arr[i++];
            } else {
                result.arr[k++] = A.arr[j++];
            }
        }

        while (i < size) {
            result.arr[k++] = arr[i++];
        }

        while (j < A.size) {
            result.arr[k++] = A.arr[j++];
        }

        return result;
    }

    void display() {
        System.out.print("Merged Array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}