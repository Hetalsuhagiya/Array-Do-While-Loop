import java.util.Arrays;
import java.util.Scanner;

public class String_Array_Common_Elements {
    public static void main(String[] args) {
        //creating scanner class object for user input
        Scanner scanner = new Scanner(System.in);
        //initializing length of first array by using scanner object
        System.out.println("Enter the first array's length: ");
        int length1 = scanner.nextInt();
        String[] array1 = new String[length1];//instatiating elements as String
        //print all entered elements by executing loop
        System.out.println("Enter the first array elements: ");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = scanner.next();
        }
        //creating second array
        System.out.println("Enter the second array's length: ");
        int length2 = scanner.nextInt();
        String[] array2 = new String[length2];
        System.out.println("Enter the second array elements: ");
        for (int i = 0; i < array2.length; i++) {
            array2[i] = scanner.next();
        }
        //printing the string representation of both arrays
        System.out.println("First array elements: " + Arrays.toString(array1));
        System.out.println("Second array elements: " + Arrays.toString(array2));
        //code to find common elements between the arrays
        System.out.println("Common elements are: ");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i].equals(array2[j])) {
                    System.out.print(array1[i] + " ");
                }
            }
        }
    }
}
