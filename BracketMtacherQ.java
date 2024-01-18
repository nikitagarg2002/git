import java.util.Scanner;
import java.util.Stack;

public class BracketMtacherQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); // USER INPUT
        System.out.println(BracketMatcher(str)); // CALLING THE FUCNTION
    }

    public static int BracketMatcher(String str) {
        Stack<Character> stack = new Stack();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c != '(' && c != ')')
                continue;

            if (stack.empty()) // IF STACK IS EMPTY
                stack.push(c); // INSERT THAT FIRST CHARACTER INTO THAT
            else if (stack.peek() == '(' && c == ')')
                stack.pop();
            else
                stack.push(c);
        }

        if (stack.empty())
            return 1;
        return 0;
    }
}