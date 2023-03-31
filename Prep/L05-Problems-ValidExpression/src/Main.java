import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println(valid("{()}"));
    }

    public static boolean valid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{') {
                stack.add(s.charAt(i));
            } else if (s.charAt(i)==')') {
                if(stack.size()>0 && stack.peek()=='(') {
                    stack.pop();
                } else {
                    return false;
                }
            } else if (s.charAt(i)==']') {
                if(stack.size()>0 && stack.peek()=='[') {
                    stack.pop();
                } else {
                    return false;
                }
            } else if (s.charAt(i)=='}') {
                if(stack.size()>0 && stack.peek()=='{') {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return stack.size()==0;
    }
}