public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//        Queue<Integer> integers = new LinkedList<>();
//        integers.add(1);
//        integers.add(2);
//        integers.add(3);
//        integers.add(4);
//        integers.add(5);
//        integers.offer(2);
//        integers.element();
//        integers.remove();
//        Stack<Integer> integers1 = new Stack<>();
//        integers1.add(4);
//        integers1.peek();
//        System.out.println(integers1.get(3));
//
        int[] chars = new int[26];
//        System.out.println('s'-'a');
        chars[18]++;
//        System.out.println('a'-'a');
        chars[0]++;
//        System.out.println('i'-'a');
        chars[8]++;
//        System.out.println('r'-'a');
        chars[17]++;
//        System.out.println('a'-'a');
        chars[0]++;
//        System.out.println('m'-'a');
        chars[12]++;
        for(int num: chars)System.out.println(num);

    }
}