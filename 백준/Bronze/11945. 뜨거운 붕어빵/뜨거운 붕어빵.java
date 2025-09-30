import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        for (int i = 0; i < n; i++) {
            String originalLine = br.readLine();
            StringBuilder sb = new StringBuilder(originalLine);
            String flippedLine = sb.reverse().toString();
            bw.write(flippedLine + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
