public class secondsAndMinutesChallenge {

    public static void main(String[] args) {
        System.out.println( getDurationString(3660));
    }
    public static String getDurationString(long minutes,long seconds) {
        if ((minutes>=0) && (seconds>=0 &&seconds<=59))
        {
            long hours;
//            1hr = 60 min or 3600 sec
//            1 min = 60 sec

            hours= (minutes)/60;
            long remminutes=minutes%60;

            return (hours+"h "+remminutes+"m "+seconds+"s");

        }
        else
        return "Invalid Value";
    }
    public static String getDurationString(long seconds) {
        if (seconds>=0)
        {
            long minutes;
            long remseconds;
            minutes = seconds/60;
            remseconds = seconds%60;
            return getDurationString(minutes,remseconds);
        }
        else
            return "Invalid Value";
    }

}
