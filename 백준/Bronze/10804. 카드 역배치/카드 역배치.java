import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[20];
        for (int i = 0; i < 20; i++) {
            arr[i] = i + 1;
        }
        for (int i = 0; i < 10; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            while (a < b) {
                int temp = arr[a - 1];
                arr[a - 1] = arr[b - 1];
                arr[b - 1] = temp;
                a++;
                b--;
            }
        }
        for (int n : arr) {
            bw.write(String.valueOf(n) + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}