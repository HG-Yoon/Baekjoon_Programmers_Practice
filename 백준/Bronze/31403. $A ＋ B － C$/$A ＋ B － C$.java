import java.io.*;
import java.util.*;

public class Main {
    static int sol1(int a, int b, int c) {
        return a + b - c;
    }

    static int sol2(int a, int b, int c) {
        return Integer.parseInt(String.valueOf(a) + String.valueOf(b)) - c;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        bw.write(String.valueOf(sol1(a, b, c)) + "\n" + String.valueOf(sol2(a, b, c)));

        bw.flush();
        bw.close();
        br.close();
    }
}
