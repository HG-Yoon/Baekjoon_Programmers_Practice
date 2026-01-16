import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 배(0)와 등(1)
        // 도(배 한 개, 등 세 개), A
        // 개(배 두 개, 등 두 개), B
        // 걸(배 세 개, 등 한 개), C
        // 윷(배 네 개), D
        // 모(등 네 개) E
        int[] arr = new int[4];
        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int sum = 0;
            for (int j = 0; j < 4; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
                sum += arr[j];
            }
            switch (sum) {
                case 0:
                    bw.write("D\n");
                    break;
                case 1:
                    bw.write("C\n");
                    break;
                case 2:
                    bw.write("B\n");
                    break;
                case 3:
                    bw.write("A\n");
                    break;
                case 4:
                    bw.write("E\n");
                    break;
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}