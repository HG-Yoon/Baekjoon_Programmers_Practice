import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[42];
        int x;
        int cnt = 0;
        for (int i = 0; i < 10; i++) {
            x = Integer.parseInt(br.readLine());
            arr[x % 42] = 1;
        }
        for (int i = 0; i < 42; i++) {
            cnt += arr[i];
        }
        bw.write(Integer.toString(cnt));

        bw.flush();
        bw.close();
        br.close();
    }
}
