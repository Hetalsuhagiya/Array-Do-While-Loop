import java.util.Scanner;

public class Transpose_Matrix {
    public static void main(String[] args) {
        //creating instance of Scanner class for user input
        Scanner scanner = new Scanner(System.in);
        //initialize rows using scanner object
        System.out.println("Enter total rows: ");
        int row = scanner.nextInt();
        //initialize columns using scanner object
        System.out.println("Enter total columns: ");
        int column = scanner.nextInt();
        //declaring and instantiating array
        int[][] array = new int[row][column];
        //Matrix initialization
        System.out.println("Enter elements of Matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array[i][j] = scanner.nextInt();// initializing array using scanner object
                System.out.println();//new  line
            }
        }
        //printing current Matrix before transpose
        System.out.println("The Matrix before Transpose is: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }
        //transpose Matrix by changing condition of row and column in for loop
        System.out.println("The Matrix after Transpose is: ");
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(array[j][i] + " ");
            }
            System.out.println(" ");// new line

        }

    }

}











