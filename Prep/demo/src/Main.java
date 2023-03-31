public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        sumOfEle(new int[]{23,14,135,12,2,78,95});
    }

    public static void sumOfEle(int[] arr) {
        if(arr.length==0) {
            System.out.println("Array is empty");
            return;
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int j : arr) {
            sum += j;
            min = Math.min(min, j);
            max = Math.max(max, j);
        }
        System.out.println("Max sum of n-1 elements " + (sum-min));
        System.out.println("Min sum of n-1 elements " + (sum-max));
    }


}

//arr[5]

/*
1.Add root to queue
2.check if the queue is not empty(while(queue)
3.curr = rootNode (peek)
4.Add curr.left and curr.right
5.queue.pop;


 */





// binary







/*

1. curr = root
2. add root to queue
3. while queue is not empty
4. before popping add both left and right to queue
5. node = pop from queue
6. createTree(node , position)

 */



        0
    1        2
3      4   5     6
  7

        0
    1       2
4     3  5      6
    7





