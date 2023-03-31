public class Main {
    public static void main(String[] args) {
//        Drawable drawable = new Drawable() {
//            @Override
//            public Static draw() {
//                System.out.println("Drawing");
//                  return "draw";
//            }
//        };
//        Drawable drawable = () -> {
//            return "drawing";
//        };
        Drawable drawable = () -> "drawing";
        System.out.println(drawable.draw());
//        Printable printable = (msg) -> msg.toLowerCase();
        Printable printable = String::toLowerCase;
        System.out.println(printable.msg("Hello World"));
        Addable addable = (a,b) -> a+b;
        System.out.println(addable.sum(4,5));

        IAverage average = (arr) -> {
            int sum = 0;
            for (int j : arr) {
                sum += j;
            }
            return sum/arr.length;
        };
        System.out.println(average.avg(new int[]{12,12,13,1,41,224,5}));
    }
}

interface Drawable {
    String draw();
}

interface Printable {
    String msg(String msg);
}

interface Addable {
    int sum(int a, int b);
}

interface IAverage {
    int avg(int[] nums);
}