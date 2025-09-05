import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken()); // 시
        int B = Integer.parseInt(st.nextToken()); // 분
        int C = Integer.parseInt(st.nextToken()); // 초
        int D = Integer.parseInt(br.readLine()); // 요리하는 데 필요한 시간

        C += D;
        if (C > 59) {
            B += C / 60;
            C = C % 60;
        }
        if (B > 59) {
            A += B / 60;
            B = B % 60;
        }
        if (A > 23) {
            A = A % 24;
        }
        bw.write(String.valueOf(A) + " " + String.valueOf(B) + " " + String.valueOf(C));
        
        bw.flush();
        bw.close();
        br.close();
    }
}
