public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(2%4);
        System.out.println(number(7));
    }
    public static int number(int n) {
        int total = 2;
        for(int i=2;i<n;i++) {
            for(int j=2; j<n;j++) {
                if(j/i !=j || i/j!=0) {
                    total++;
                }
            }
        }
        total += ((n-1)*2)-1;
        return total;
    }
}