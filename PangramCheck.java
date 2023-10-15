import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PangramCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine().toLowerCase();
        
        Set<Character> alphabetSet = new HashSet<>();
        for (char c = 'a'; c <= 'z'; c++) {
            alphabetSet.add(c);
        }

        for (char c : input.toCharArray()) {
            alphabetSet.remove(c);
        }

        if (alphabetSet.isEmpty()) {
            System.out.println("The input is a Pangram.");
        } else {
            System.out.println("The input is not a Pangram.");
        }
    }
}
