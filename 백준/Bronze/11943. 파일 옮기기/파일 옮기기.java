import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        // 첫 번째 바구니: 사과 a개, 오렌지 b개
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        // 두 번째 바구니: 사과 c개, 오렌지 d개
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        // 경우 1: 바구니 1을 사과만, 바구니 2를 오렌지만
        // b개의 오렌지를 바구니 2로 + c개의 사과를 바구니 1로
        int case1 = b + c;

        // 경우 2: 바구니1을 오렌지만, 바구니 2를 사과만
        // a개의 사과를 바구니 2로 + d개의 오렌지를 바구니 1로
        int case2 = a + d;

        // 두 경우 중 최솟값 출력
        bw.write(String.valueOf(Math.min(case1, case2)));
        
        bw.flush();
        bw.close();
        br.close();
    }
}
