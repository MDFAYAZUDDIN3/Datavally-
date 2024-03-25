import java.util.Scanner;

public class CountConsoVowl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine().toLowerCase(); 
        int vC = 0;
        int cC = 0;
        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vC++;
                } else {
                    cC++;
                }
            }
        }
        System.out.println("Number of vowels: " + vC);
        System.out.println("Number of consonants: " + cC);
        
        scanner.close();
    }
}
