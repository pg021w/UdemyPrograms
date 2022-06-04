import java.util.Scanner;

public class Pattern1 {

//    1
//    22
//    333
//    4444
public static void main(String[] args) {
    Scanner scr= new Scanner(System.in);

     int n=scr.nextInt();
    for (int r=1;r<=n;r++)
    {
        for (int c=1;c<=r;c++)
        {
            System.out.print(r);
        }
        System.out.println();
    }
}

}
