public class Hello {
    public static void main (String[] args)
    {
      double v1= 20.00;
      double v2= 80.00;
      double result = (v1+v2) *100.00;
      double remainderFromResult = result % 40.00;
      boolean valueInStep5 = remainderFromResult==0 ?true :false;
      System.out.println(valueInStep5);
      if (valueInStep5==false)
      {
          System.out.println("Got some remainder");
      }

    }
}

