public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(solve(4, "wlrb"));
    }

    public static int solve(int N, String s){
        String flag;
        String nextFlag;
        int count = 0;
        StringBuilder newString = new StringBuilder();
        // Code Here
        for(int i=0;i<N-1;i++) {
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') {
                flag = "vowel";
            } else {
                flag = "conso";
            }
            if(s.charAt(i+1)=='a' || s.charAt(i+1)=='e' || s.charAt(i+1)=='i' || s.charAt(i+1)=='o' || s.charAt(i+1)=='u') {
                nextFlag = "vowel";
            } else {
                nextFlag = "conso";
            }
            if(flag.equals("vowel") && nextFlag.equals("vowel")) {
                newString.append("b");
                count++;
            } else if(flag.equals("conso") && nextFlag.equals("conso")) {
                newString.append("a");
                count++;
            } else {
                newString.append(s.charAt(i));
            }
        }
        return count;
    }
}