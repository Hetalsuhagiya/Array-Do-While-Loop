import java.util.Scanner;

public class Reverse_Number {
    public static void main(String[] args) {


        //creating object of scanner class for user input
        Scanner scanner = new Scanner(System.in);
        int reversen1 = 0;//declare variable
        System.out.println("Enter the 5 digits numbers: ");
        int n = scanner.nextInt();//initialize n variable using scanner class object
        //run loop to initialize number until it is not equal to zero
        int i = n;
        do {
            int m = i % 10; //assigning remainder value to m
            i = i / 10;//removing last digit
            //multiplying reversed number by 10 and then adding remainder to assign new value to reversed numbers
            reversen1 = reversen1 * 10 + m;
        }
        while (i != 0);
        System.out.println("Numbers in reverse order are: " + reversen1);

    }
}

