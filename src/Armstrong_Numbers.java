import java.util.Scanner;

public class Armstrong_Numbers {
    public static void main(String[] args) {

//creating instance of Scanner class for user input
        Scanner scanner = new Scanner(System.in);
        //initialize the number entered
        System.out.println("Enter the number:");
        int num = scanner.nextInt();
        int temp1 = num;//assigning number value to temporary number so doesn't get altered
        int length = 0;
        int arm = 0;
        //start loop until input value reaches zero
        while (temp1 > 0) {
            length = length + 1;
            temp1 = temp1 / 10;//removes last digit

            int temp2 = num;
            int r;
            arm = 0;
            while (temp2 > 0) {
                int mult = 1;
                r = temp2 % 10;// determines last digit from the number
                for (int i = 1; i <= length; i++) {
                    mult = mult * r;
                }
                    arm = arm + mult;
                    temp2 = temp2 / 10;
                }
            }
        System.out.println("The number of digits: " + length);
          //compare the entered number  with execuetd armstrong number
            if (num == arm) {
                System.out.println(num + " is Armstrong Number");
            } else {
                System.out.println(num + " is NOT Armstrong Number");
            }
        }
}