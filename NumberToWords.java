public class NumberToWords {

    public static int reverse(int number) {
        int reverse = 0;
       if (number<0)
       {
           number=number*-1;
       }
        while (number>0)
        {
            reverse=reverse*10+number%10;
            number=number/10;

        }
        return reverse;

    }

    public static int count(int number) {
        int count = 0;
        int num2 = number;
        if (number < 0) {
            return -1;
        } else {
            while (num2 > 0) {
                if (num2 % 10 >= 0) {
                    count++;
                    num2 = num2 / 10;
                }
            }
            return count;
        }
    }
    public static void main(String[] args) {
        System.out.println("You are in main");
        numberToWords(5432);

    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
//            String numberToWords ="";
            int reverseNum = reverse(number);
            if (count(reverseNum)==count(number)) {
                int num2;
                while (reverseNum > 0) {
                    num2 = reverseNum % 10;
                    switch (num2) {
                        case 0:
                            System.out.print("Zero ");
                            break;
                        case 1:
                            System.out.print("One ");
                            break;
                        case 2:
                            System.out.print("Two ");
                            break;
                        case 3:
                            System.out.print("Three ");
                            break;
                        case 4:
                            System.out.print("Four ");
                            break;
                        case 5:
                            System.out.print("Five ");
                            break;
                        case 6:
                            System.out.print("Six ");
                            break;
                        case 7:
                            System.out.print("Seven ");
                            break;
                        case 8:
                            System.out.print("Eight ");
                            break;
                        case 9:
                            System.out.print("Nine ");
                            break;
                    }
                    reverseNum = reverseNum / 10;
                }
            }
                else {
                    int countnormal = count(reverseNum);
                int countReverse =count(number);
                for (int i=0;i<countnormal-countReverse;i++)
                {
                    
                }
            }
                    int num2;
                    while (reverseNum > 0) {
                        num2 = reverseNum % 10;
                        switch (num2) {
                            case 0:
                                System.out.print("Zero ");
                                break;
                            case 1:
                                System.out.print("One ");
                                break;
                            case 2:
                                System.out.print("Two ");
                                break;
                            case 3:
                                System.out.print("Three ");
                                break;
                            case 4:
                                System.out.print("Four ");
                                break;
                            case 5:
                                System.out.print("Five ");
                                break;
                            case 6:
                                System.out.print("Six ");
                                break;
                            case 7:
                                System.out.print("Seven ");
                                break;
                            case 8:
                                System.out.print("Eight ");
                                break;
                            case 9:
                                System.out.print("Nine ");
                                break;
                        }
                        reverseNum=reverseNum/10;
                    }


        }
    }


}
