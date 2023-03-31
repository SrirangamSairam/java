public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(returnLen("aabbdaefg",0,9));
    }

    public void returnLead(int[] arr) {
        int lead = arr[arr.length-1];
        System.out.print(lead);
        for(int i = arr.length-2;i>=0;i--) {
            if(arr[i]>lead) {
                lead = arr[i];
                System.out.print(lead);
            }
        }
    }

    public static int returnLen(String name,int start, int end) {
        if(name.length()==0||name.length()==1) return 0;
        int mid = name.length()/2;
        String left = name.substring(0,mid);
        String right = name.substring(mid,name.length());
        int len = 0;
        int currLen = 0;
        int index = 0;
        for(int i=0;i<left.length();i++) {
            if(right.contains(left.substring(index,i+1))) {
                len++;
            } else {
                currLen = Math.max(len, currLen);
                len = 0;
                index = i+1;
            }
        }
        if(currLen==0&&len ==0) {
            return Math.max(returnLen(left,0,mid-1), returnLen(right,mid,name.length()));
        }
        return Math.max(len,currLen);
    }

}
//Input : aabcdaabc
//Output : 4
//The string "aabc" is the longest
//prefix which is also suffix.