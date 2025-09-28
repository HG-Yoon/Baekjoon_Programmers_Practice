import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int l = Integer.parseInt(br.readLine());
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());
        int korEnd = a % c == 0 ? a / c : a / c + 1;
        int mathEnd = b % d == 0 ? b / d : b / d + 1;
        if (korEnd > mathEnd || korEnd == mathEnd) {
            bw.write(String.valueOf(l - korEnd));
        } else {
            bw.write(String.valueOf(l - mathEnd));
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
