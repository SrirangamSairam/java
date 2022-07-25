import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrList = new ArrayList<String>();
        arrList.add("aaa");
        arrList.add("bbb");
        arrList.add("ccc");
        arrList.add("ddd");
        System.out.println(arrList);
        //String[] arr = new String[arrList.size()];
//        arr = arrList.toArray(arr);
        Object[] arr = arrList.toArray();
        for (Object s : arr) {
            System.out.println(s);
        }
    }
}