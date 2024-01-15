import java.util.Scanner;

public class CustomException{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            int userInput = scanner.nextInt();

            if (userInput < 0) {
                throw new NegativeValueException("Input must be a non-negative integer.");
            }

            System.out.println("You entered: " + userInput);
        } catch (NegativeValueException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (java.util.InputMismatchException e) {
            System.err.println("Error: Input must be an integer.");
        } finally {
            scanner.close();
        }
    }
}
