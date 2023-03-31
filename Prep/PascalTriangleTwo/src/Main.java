import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(getRow(4));
    }

    public static List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<rowIndex+1;i++) {
            list.add( (int) (factorial(rowIndex) / (factorial(rowIndex - i) * factorial(i))));
        }
        return list;
    }

    private static long factorial(int n) {
        if(n==0 || n==1 ) return 1;
        return n * factorial(n-1);
    }
}