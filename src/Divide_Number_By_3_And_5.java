import java.util.Scanner;

public class Divide_Number_By_3_And_5 {
    public static void main(String[] args) {
        //creating object for scanner class for user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number between 1 and 100:");//acknowledge user what to enter
        int number = scanner.nextInt();//initialize number using scanner object
        if (number >= 1 && number <= 100) {//verifying condition of number between 1 and 100
            System.out.println("The numbers divisible by 3 upto number " + number + " are as below:");

            // iterating value upto the entered number
            // for (int i = 1; i <= number; i++) {
            int i = 1;
            do {
                i++;
                //verifying if number is divisible by 3
                if (i % 3 == 0) {
                    System.out.println("The number divisible by 3 is : " + i);
                }
            } while (i <= number);

            System.out.println("The numbers divisible by 5 upto number " + number + " are as below:");

        }int i = 1;
        do {
            i++;
            //verifying if number is divisible by 5
            if (i % 5 == 0) {
                System.out.println("The number divisible by 5 is : " + i);
            }
        } while (i <= number);
            //verifying number is not greater than 100

            }
        }



