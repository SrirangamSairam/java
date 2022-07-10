public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(getDurationString(1211,55));
        System.out.println(getDurationString(1,-55));
        System.out.println(getDurationString(55555));
        System.out.println(getDurationString(-132));
    }
    public static String getDurationString(int mins, int secs) {
        if(mins<=0 || (secs <=0 || secs>59)) {
            return "Invalid value";
        }
        int remainingHours = mins/60;
        int remainingMinutes = mins%60;
        String remainingHoursString = returnHoursAndMinutesString(remainingHours);
        String remainingMinutesString = returnHoursAndMinutesString(remainingMinutes);
        String remainingSecondsString = returnHoursAndMinutesString(secs);
        return remainingHoursString + "h " + remainingMinutesString + "m " + remainingSecondsString +"s";
//        else if (mins>=60 && mins<70) {
//            return "0" + mins/60 + "h 0" + mins%60 + "m " + secs +"s";
//        } else if (mins>=70 && mins<120) {
//            return "0" + mins/60 + "h " + mins%60 + "m " + secs +"s";
//        } else {
////            int hours = mins/60;
////            mins = mins%60;
//            return mins/60 + "h " + mins%60 + "m " + secs +"s";
//        }
    }
    public static String returnHoursAndMinutesString(int time){
        if(time<10) {
            return "0" + time;
        }
        return "" + time;
    }
    public static String getDurationString(int secs) {
        if(secs <=0) {
            return "Invalid value";
        } else {
            return getDurationString(secs/60,secs%60);
        }
    }
}