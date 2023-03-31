public class Main {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{2,6,8,5}));//3
        System.out.println(solution(new int[]{1,5,5,2,7}));//4
        System.out.println(solution(new int[]{2,3,4,5,6,7,8}));//7
        System.out.println(solution(new int[]{10,7,4,1,2,3,4,5,6}));//9
        System.out.println(solution(new int[]{1,1}));//9
    }

    public static int solution(int[] blocks) {
        int count = 1;
        int finalCount = 1;
        for(int i=0;i<blocks.length;i++) {
            for(int j=i+1;j<blocks.length;j++) {
                if(blocks[j] >= blocks[j-1]) {
                    count++;
                } else {
                    break;
                }
            }
            for(int k=i;k>0;k--) {
                if(blocks[k-1] >= blocks[k]) {
                    count++;
                } else {
                    break;
                }
            }
            finalCount = Math.max(count, finalCount);
            count = 1;
        }
        return finalCount;
    }
}