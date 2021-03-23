import java.util.*;

public class Main {
    public static boolean chackIf(Stack<Character> st, char ch) {
        if (st.size() == 0) {
            return false;
        } else if (st.peek() != ch) {
            return false;
        } else {
            st.pop();
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else if (ch == ')') {
                boolean val = chackIf(st, '(');
                if (val == false) {
                    System.out.println(val);
                    return;
                }
            } else if (ch == ']') {
                chackIf(st, '[');
                boolean val = chackIf(st, '(');
                if (val == false) {
                    System.out.println(val);
                    return;
                }
            } else if (ch == '}') {
                chackIf(st, '{');
                boolean val = chackIf(st, '(');
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