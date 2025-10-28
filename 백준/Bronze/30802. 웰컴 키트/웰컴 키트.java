import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] sizes = new int[6];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < sizes.length; i++) {
            sizes[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        double ans1 = 0;
        for (int i = 0; i < sizes.length; i++) {
            ans1 += Math.ceil((double) sizes[i] / t);
        }
        int ans2 = n / p;
        int ans3 = n % p;
        bw.write(String.valueOf((int) ans1) + "\n" + String.valueOf(ans2) + " " + String.valueOf(ans3));

        bw.flush();
        bw.close();
        br.close();
    }
}
