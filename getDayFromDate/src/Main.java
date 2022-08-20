import java.io.*;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        /*
            F=k+ [(13*m-1)/5] +D+ [D/4] +[C/4]-2*C where
            k is  the date of the month.
            m is the month number.(starting from march=1...till feb = 12)
            therefore subtract month with 2 to use in this formula
            D is the last two digits of the year.
            C is the first two digits of the year.
        */
        month = month-2 > 0 ? month-2 : month+10;

        int getDay = day + ((13*(month-1))) + year%2000 +
                ((year%2000)/4) + ((year/100)/4) - 2*(year/100);
        switch(getDay%7) {
            // case 1: return "SUNDAY " + getDay;
            // case 2: return "MONDAY " + getDay;
            // case 3: return "TUESDAY " + getDay;
            // case 4: return "WEDNESDAY " + getDay;
            // case 5: return "THURSDAY " + getDay;
            // case 6: return "FRIDAY " + getDay;
            // case 7: return "SATURDAY " + getDay;
            // default: return " " + getDay;
            case 1: return "SUNDAY";
            case 2: return "MONDAY";
            case 3: return "TUESDAY";
            case 4: return "WEDNESDAY";
            case 5: return "THURSDAY";
            case 6: return "FRIDAY";
            case 7: return "SATURDAY";
            default: return " " + getDay;
        }
    }

}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
