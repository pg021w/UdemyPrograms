public class evenDigitSum {
    public static int getEvenDigitSum(int number) {
        if (number >= 0) {
            int num = number;
            int sum = 0;
            while (num > 1) {
                int eveorodd = num % 10;
                if ((eveorodd % 2) == 0) {
                    sum = sum + eveorodd;
                    System.out.println("Even found");
                }

                num = num / 10;
            }
            return sum;
        } else return -1;
    }

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(0));
    }
}
