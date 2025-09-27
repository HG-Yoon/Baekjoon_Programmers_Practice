import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(br.readLine());
        int totalSeconds = a * 3600 + b * 60 + c + d;
        int h = (totalSeconds / 3600) % 24;
        int m = (totalSeconds % 3600) / 60;
        int s = totalSeconds % 60;
        bw.write(String.valueOf(h) + " " + String.valueOf(m) + " " + String.valueOf(s));

        bw.flush();
        bw.close();
        br.close();
    }
}
