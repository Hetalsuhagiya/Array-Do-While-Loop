import java.util.Arrays;
import java.util.Scanner;

public class Check_Array_Equality {
    public static void main(String[] args) {
//create an instance of Scanner class for user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of first array: ");
        int size = scanner.nextInt();//initialize the size variable using scanner object
        int[] array1 = new int[size];//declaring and initstantiating first array
        System.out.println("Enter " + size + " Elements: ");
        //loop to print entered elments until specified array size
        for (int i = 0; i < size; i++) {
            array1[i] = scanner.nextInt();//initializing first array using scanner object
        }
        System.out.println("Printing the elements in array");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println("");//next line

        System.out.println("Enter the size of second array: ");
        size = scanner.nextInt();
        int[] array2 = new int[size];//declaring and initstantiating second array
        for (int i = 0; i < size; i++) {
            System.out.println("Enter " + size + " Elements");
            for (i = 0; i < size; i++) {
                array2[i] = scanner.nextInt();//initializing second array using scanner object
            }
            System.out.println("Printing the elements in array");
            for (i = 0; i < array2.length; i++) {
                System.out.print(array2[i] + " ");
            }
        }
        System.out.println();//next line
        //check equality of first and second array & print result
                if (Arrays.equals(array1,array2)) {
                    System.out.println("Arrays are Equal");
                }
                else {
                    System.out.println("Arrays are Not Equal");
                }

            }
        }





