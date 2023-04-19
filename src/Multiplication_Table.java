import java.util.Scanner;

public class Multiplication_Table {
    public static void main(String[] args) {
        //creating object for scanner class for utilizing input from user
        Scanner scanner = new Scanner(System.in);
        //acknowledge user what to enter
        System.out.println("Please enter the number:");
        //initialize n by using scanner object
        int n = scanner.nextInt();
        System.out.println("The multiplication table of number " + n + " is: ");
        //initialize & run loop until entered number for multiplication table
        int i = n;
        do {
            for (int j = 1; j <= 12; j++) {//
                // initialize,create boolean condition & iterate numbers from 1 upto 12
                System.out.println(i + " x " + j + " = " + i * j);//print out the final values in the form of multiplication table
            }
            i++;
        } while (i <= n);

    }
}



