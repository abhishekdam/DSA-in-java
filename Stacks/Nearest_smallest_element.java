import java.util.*;
import java.io.*;

class NSEL {

    public static int[] solve(int a[]) {
        int nse[] = new int[a.length];
        Stack<Integer> st = new Stack<>();
        for (int i = a.length; i >= 0; i++) {
            
        }
    }

    // Driver code
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        String str[] = s.split(" ");
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(str[i]);
        }

        int nse[] = solve(a);
        display(nse);
    }
}