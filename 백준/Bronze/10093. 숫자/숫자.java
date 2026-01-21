import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        if (a > b) {
            bw.write(String.valueOf(a - b - 1) + "\n");
            for (long i = b + 1; i < a; i++) {
                bw.write(String.valueOf(i) + " ");
            }
        } else if (a < b) {
            bw.write(String.valueOf(b - a - 1) + "\n");
            for (long i = a + 1; i < b; i++) {
                bw.write(String.valueOf(i) + " ");
            }
        } else if (a == b) {
            bw.write("0" + "\n" + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}