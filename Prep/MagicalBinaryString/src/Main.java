public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String name = "";
        if(name.length()==0) {
            System.out.println(false);
            return;
        }
        int count0 = 0;
        int count1 = 0;
        for(int i=0;i<name.length();i++) {
            if(name.charAt(i)=='0') {
                count0++;
            } else if(name.charAt(i)=='1') {
                count1++;
            }
            if(count0>count1) {
                break;
            }
        }
        System.out.println(count0==count1);
        System.out.println(count0+","+count1);
    }
}