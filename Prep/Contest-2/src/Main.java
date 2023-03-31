import java.util.ArrayList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(3);
        arr.add(4);
        arr.add(1);
        arr.add(3);
        arr.add(8);
        System.out.println(closestFriends(arr));
    }

    public static ArrayList<Integer> closestFriends(ArrayList<Integer>arr){
        // code here
        Stack<Integer> integers = new Stack<>();
        integers.addAll(arr);
        ArrayList<Integer> out = new ArrayList<>();



        return out;
    }
}

