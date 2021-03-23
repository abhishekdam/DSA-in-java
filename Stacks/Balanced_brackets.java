import java.util.*;
import java.io.*;

class BB {

    public static boolean check(Stack<Character> st, char closingChar) {
        if (st.size() == 0) {
            return false;
        } else if (st.peek() != closingChar) {
            return false;
        } else {
            st.pop();
            return true;
        }
    }

    // Driver code
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                st.push(ch);
            } else if (ch == ')') {
                boolean val = check(st, '(');
                if (val == false) {
                    System.out.println(val);
                    return;
                }
            } else if (ch == ']') {
                boolean val = check(st, '[');
                if (val == false) {
                    System.out.println(val);
                    return;
                }
            } else if (ch == '}') {
                boolean val = check(st, '{');
                if (val == false) {
                    System.out.println(val);
                    return;
                }
            }
        }
        if (st.size() == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}