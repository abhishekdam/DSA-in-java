import java.util.*;
import java.io.*;

class Main {

    public static int[] solve(int a[]) {
        int nge[] = new int[a.length];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for (int i = 1; i < a.length; i++) {
            while (st.size() > 0 && a[i] > a[st.peek()]) {
                int pos = st.peek();
                nge[pos] = a[i];
                st.pop();
            }
            st.push(i);
        }
        while (st.size() > 0) {
            int pos = st.peek();
            nge[pos] = -1;
            st.pop();
        }
        return nge;
    }

    public static void display(int nge[]) {
        for (int j = 0; j < nge.length; j++) {
            System.out.print(nge[j] + " ");
        }
    }

    // Driver code
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int a[] = new int[n];
        String s = br.readLine();
        String str[] = s.split(" ");
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(str[i]);
        }

        int nge[] = solve(a);
        display(nge);
    }
}