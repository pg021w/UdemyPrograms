import java.util.Scanner;

public class inputThenPrintSumAndAverage {

    // Write your code here
    public static void inputThenPrintSumAndAverage() {
    }


    public static void main(String[] args) {
        System.out.println("Print numbers");
        int sum = 0;
        int average = 0;
        int counter = 0;
        Scanner scn = new Scanner(System.in);
        boolean isAnInt = scn.hasNextInt();

        counter++;
        if (isAnInt == false && counter > 0) {
            int num = scn.nextInt();
            sum = sum + num;
            average = sum / counter;
            System.out.println("SUM = " + sum + "AVG = " + average);
        } else if (isAnInt == false && counter == 0) {
            System.out.println("SUM = 0 AVG = 0");

//        inputThenPrintSumAndAverage();
        }
    }
}

