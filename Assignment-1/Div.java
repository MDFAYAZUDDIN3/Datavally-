import java.util.Scanner;

public class Div{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the numerator: ");
        int num = scanner.nextInt();

        System.out.print("Enter the denominator: ");
        int dem = scanner.nextInt();

        try {
            divNumbers(num, dem);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }

        scanner.close();
    }

    public static void divNumbers(int num, int dem) {
        if (dem == 0) {
            throw new ArithmeticException("Division by zero");
        }

        int result = num / dem;
        System.out.println("Result of division: " + result);
    }
}
