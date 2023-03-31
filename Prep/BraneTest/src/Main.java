import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//
//        String var = "abcd 1234 efgh";
//
//        Stack<Character> characters = new Stack<>();

//        for(int i=0;i<var.length();i++) {
//            if(var.charAt(i)!=' ') {
//                characters.push(var.charAt(i));
//            }
//            if((var.charAt(i)==' '&&characters.size()!=0) || i==var.length()-1) {
//                while (!characters.isEmpty()) {
//                    System.out.print(characters.pop());
//                }
//                System.out.print(" ");
//            }
//        }
        String input = "cAT i am Krishna";
        List<String> forbiddenWords = Arrays.asList("cat", "dog", "hello");

//        forbiddenWords.stream().
        System.out.println(forbiddenWords.stream().anyMatch(input.toLowerCase()::contains));

    }
}


//public static void main(String[] args) {
//        String input = "parrot i am Krishna";
//        List<String> forbiddenWords = Arrays.asList("cat", "dog", "hello");
//        //If forbidden word found, print true. else false.
//        boolean foundWord = false;
//        for(int i=0; i<forbiddenWords.size(); i++) {
//            if(input.toLowerCase().contains(forbiddenWords.get(i).toLowerCase())) {
//                foundWord = true;
//            }
//        }
//        System.out.println(foundWord);
//        //
//    }




//[9:31 AM] Krishna Prasad Vadakkal Krishna Kumar
//      String str = "abcd 1234 efgh";
//        //logic
////        output : dcba 4321 hgfe
//        // StringBuilder/StringBuilder

