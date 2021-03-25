import java.util.*;
import java.io.*;

class NGE {
    public static int[] findNGE(int[] arr) {
        int nge[] = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(arr[arr.length - 1]);
        nge[arr.length - 1] = -1;

        for (int i = arr.length - 2; i >= 0; i--) {
            while (st.size() > 0 && st.peek() <= arr[i]) {
                st.pop();
            }
            if (st.size() == 0) {
                nge[i] = -1;
            } else {
                nge[i] = st.peek();
            }
            st.push(arr[i]);
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

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }
        int nge[] = findNGE(a);
        display(nge);
    }
}


// 6 5 4 3 2 1 
// 1 2 3 4 5 6