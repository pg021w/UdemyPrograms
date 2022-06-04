public class isLeapYear {
    public static boolean isLeapYear(int year) {
        if ((year <= 1) || (year >= 9999)) {
            return false;
        } else if (((year % 4) == 0 && (year % 100 != 0)) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year) {
        if ((month < 1 || month > 12) || ((year <= 1) || (year >= 9999))) {
            return -1;
        } else {
            int numberofDays = 0;
            switch (month) {
                case 1:
                    numberofDays = 31;
                    break;

                case 2:
                    if (isLeapYear(year)==true)
                    {
                        numberofDays= 29;
                    }
                    else
                    {
                        numberofDays= 28;
                    }
                    break;

                case 3:
                    numberofDays = 30;
                    break;
            }
            return numberofDays;
        }
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(2017));
        System.out.println(getDaysInMonth(2,2018));
    }
}
