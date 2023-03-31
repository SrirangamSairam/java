import java.util.HashMap;
import java.util.Map;

public class Main {
    static Map<Integer,Integer> map = new HashMap<>();
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(sumFun(20,100,15,map));
//        for(int ele: map.keySet()) {
//            System.out.print(ele+" ");
//        }
//        System.out.println();
//        System.out.print(map.size());
    }
    public static int weirdFunc(int a, int b, int c, int n, Map<Integer,Integer> map) {
        int total;
        if(n>b) {
            map.put(n,n-c);
            return n-c;
        }
        else {
            total = weirdFunc(a,b,c,a+weirdFunc(a,b,c,a+weirdFunc(a,b,c,a + weirdFunc(a,b,c,a+n,map),map),map),map);
            map.put(n,total);
            return total;
        }
    }
    public static int sumFun(int a, int b, int c, Map<Integer,Integer> map) {
        int sum = 0;
        int n = 0;
        while (n<=b) {
            if(map.containsKey(n)) {
                sum+=map.get(n);
                System.out.print(n+" ");
            }
            else sum += weirdFunc(a, b, c, n, map);
            n++;
        }
        return sum;
    }
}