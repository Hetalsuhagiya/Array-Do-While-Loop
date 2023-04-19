import java.util.Arrays;
import java.util.Scanner;

public class String_Value_Common_Elements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first string:");
        String a = scanner.nextLine();
        String[] s1 = a.split("");
        System.out.println("Please enter second string:");
        String b = scanner.nextLine();
        String[] s2 = b.split("");
        System.out.println("The common elements are: ");
        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < s2.length; j++) {
                if (s1[i].equals(s2[j])) {
                    System.out.print(s1[i]);
                }

            }

        }

    }
}
