import java.io.IOException;
import java.util.*;

class Main {
	public static void main(String[] args)throws IOException{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		Stack<Character> st = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c == ')') {
				if (st.peek() == '(') {
					System.out.println(true);
					return;
				} else {
					while (st.peek() != '(') {
						st.pop();
					}
					st.pop();
				}
			} else {
				st.push(c);
			}
		} 
		System.out.println(false);
	}
}
