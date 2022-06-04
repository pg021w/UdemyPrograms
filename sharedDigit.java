public class sharedDigit {
    public static boolean hasSharedDigit(int num1, int num2) {
        if (((num1 >= 10) && (num1 <= 999)) && ((num2 >= 10) && (num2 <= 999))) {
            int numm2 = num2;
            boolean value = false;
            while (num1 >= 1) {

                int shared1 = num1 % 10;
                {
                    while (numm2 >= 1) {

                        int shared2 = numm2 % 10;
                        if (shared1 == shared2) {
                            value = true;
                            break;
                        }
                        numm2 = numm2 / 10;

                    }
                    if ((num1>9)&& numm2==0)
                    {
                        numm2=num2;
                    }

                }
                num1 = num1 / 10;

            }
            return value;
        } else return false;
    }

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(222, 123));
    }
}

