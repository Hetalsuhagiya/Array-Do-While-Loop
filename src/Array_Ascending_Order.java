import java.util.Scanner;

public class Array_Ascending_Order {
    public static void main(String[] args) {
        int temp= 0;// declaring temporary variables
        Scanner scanner = new Scanner(System.in);//instance of Scanner class for user input
        System.out.println("Enter the size of the array");
        int size = scanner.nextInt();//storing size in variable using scanner object
        int[] array = new int[size];
        System.out.println("Enter " + size + " the Elements");
        //run loop to take user input elements and initialize using scanner object
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        //displaying elements of array in original order
        System.out.println("Printing the elements in array");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        //sorting array in ascending order assigning value to temporary variable
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i]>array[j]){
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        //displaying elements of array after sorting
        System.out.println("\n" + "Elements of array in ascending order: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
    }
}