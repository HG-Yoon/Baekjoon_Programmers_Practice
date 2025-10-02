import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum = Integer.parseInt(st.nextToken());
        int sub = Integer.parseInt(st.nextToken());
        int a = (sum + sub) / 2;
        int b = sum - a;
        if (sum < sub || (sum + sub) % 2 != 0) {
            bw.write("-1");
        } else {
            if (a > b) {
                bw.write(String.valueOf(a) + " " + String.valueOf(b));
            } else {
                bw.write(String.valueOf(b) + " " + String.valueOf(a));
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
