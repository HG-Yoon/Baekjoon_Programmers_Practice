import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());
            if (a == 0 && b == 0) {
                break;
            }
            if (a > b) {
                bw.write("Yes\n");
            } else {
                bw.write("No\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
