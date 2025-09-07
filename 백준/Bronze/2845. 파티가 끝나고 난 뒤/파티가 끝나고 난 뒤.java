import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int l = Integer.parseInt(st.nextToken()); // 1m^2당 사람의 수
        int p = Integer.parseInt(st.nextToken()); // 파티가 열렸던 곳의 넓이
        int[] arr = new int[5];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            bw.write(String.valueOf(arr[i] - (l * p)) + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
