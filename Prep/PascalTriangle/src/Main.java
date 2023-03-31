import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(generate(15));
//        int fact13 = factorial(13);
//        System.out.println(fact13);
//        int fact12 = factorial(12);
//        System.out.println(fact12);
//        int fact1 = factorial(1);
//        System.out.println(fact1);
//        int result = fact12 * fact1;
//        int finalResult = fact13/result;
//        System.out.println(finalResult);
    }

    public static List<List<Integer>> generate(int numRows) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> wholeList = new ArrayList<>();
        int sum=0;
        for(int j=0;j<numRows;j++) {
            list = new ArrayList<>();
            for (int i = 0; i <= j; i++) {
                sum =(int) (factorial(j) / (factorial(j - i) * factorial(i)));
                list.add(sum);
            }
            System.out.println(list);
            wholeList.add(list);
        }
        return wholeList;
    }

    private static long factorial(int n) {
        if(n==0 || n==1 ) return 1;
        return n * factorial(n-1);
    }
}