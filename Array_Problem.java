public class Array_Problem {

    // Subtraction of highest and lowest - from left of highest
    // {2,8,3,10,4,5,1}
    // Answer is 10-2 =8

    public static void main(String[] args) {
        int a[] = new int[] {8,2,3,10,4,5,1};
        int highest=a[0];
        int position = 0;
        for (int i=1;i<=a.length-1;i++)
        {
           if (a[i]>highest)
           {
               highest=a[i];
               position= i;
           }
        }
       // System.out.println(highest);
        //System.out.println(position);
        int smallest=a[0];
        for (int j=0;j<position;j++)
        {
            if (a[j]<smallest)
            {
                smallest=a[j];
            }
        }
       System.out.println(highest-smallest);
    }


}
