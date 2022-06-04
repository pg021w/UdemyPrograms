public class isTeen {
    public static boolean isTeen (int num1)
    {
        if ((num1>=13 && num1<=19))
        {
            return true;
        }
        else
            return false;
    }
    public static void main(String[] args) {
        System.out.println(isTeen(7));
    }
}
