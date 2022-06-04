public class decimalUptoThree {
    public static boolean areEqualByThreeDecimalPlaces (double num1, double num2)
    {
        long a= (long)(num1*1000);
        long b= (long)(num2*1000);
        System.out.println(a);
        System.out.println(b);
        if (a==b)
        {
            return true;
        }
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(3.1756, 3.175));
    }
}
