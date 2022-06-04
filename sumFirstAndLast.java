public class sumFirstAndLast {

    public static int sumFirstAndLastDigit(int number) {
        int first = 0;
        if (number >= 0) {
            int num = number;
            if (num > 9) {
                while (num > 9) {
                    num = num / 10;
                }
                first = num;
            } else {
                first = num;

            }
            System.out.println("First: "+first);
            int last = number % 10;
            System.out.println(last);
            int sum = first + last;
            return sum;
        } else return -1;
    }

    public static void main(String[] args) {
        sumFirstAndLastDigit(257);
    }
}
