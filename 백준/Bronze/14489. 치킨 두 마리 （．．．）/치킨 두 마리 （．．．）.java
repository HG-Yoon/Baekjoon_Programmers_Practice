import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(br.readLine());
        if (a + b >= 2 * c) {
            bw.write(String.valueOf((a + b) - 2 * c));
        } else {
            bw.write(String.valueOf(a + b));
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
