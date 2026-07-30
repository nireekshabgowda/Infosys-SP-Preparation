
import java.io.*;
import java.util.*;
public class FindLeader {
    public static ArrayList<Integer> findLeaders(int n, int[] arr) {
        ArrayList<Integer> Leaders =  new ArrayList<>();
        int maxFromRight = arr[n - 1];
        Leaders.add(maxFromRight);
        for (int i = n - 2; i >= 0; i--){
            if (arr[i] >= maxFromRight) {
                maxFromRight = arr[i];
                Leaders.add(maxFromRight);
            }
        }
        Collections.reverse(Leaders);
        return Leaders;
    }
public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);

        int n = fs.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = fs.nextInt();
        }

        ArrayList<Integer> result = findLeaders(n, arr);

        for (int i = 0; i < result.size(); i++) {
            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print(result.get(i));
        }
    }

    static class FastScanner {
        private final InputStream in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;

        FastScanner(InputStream is) {
            in = is;
        }

        private int read() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;

                if (len <= 0) {
                    return -1;
                }
            }

            return buffer[ptr++];
        }

        int nextInt() throws IOException {
            int c;

            do {
                c = read();
            } while (c <= ' ' && c != -1);

            int sign = 1;

            if (c == '-') {
                sign = -1;
                c = read();
            }

            int val = 0;

            while (c > ' ') {
                val = val * 10 + (c - '0');
                c = read();
            }

            return val * sign;
        }
    }
    
}
