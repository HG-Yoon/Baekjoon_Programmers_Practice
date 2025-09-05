import java.io.*;

public class Main {
    static int solution(int[] a, int[] b) {
        int answer = 0;
        int minA = a[0], minB = b[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < minA) {
                minA = a[i];
            }
        }
        for (int i = 1; i < b.length; i++) {
            if (b[i] < minB) {
                minB = b[i];
            }
        }
        answer = minA + minB - 50;
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] hamburgers = new int[3];
        int[] drinks = new int[2];
        for (int i = 0; i < 3; i++) {
            hamburgers[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 0; i < 2; i++) {
            drinks[i] = Integer.parseInt(br.readLine());
        }
        bw.write(String.valueOf(solution(hamburgers, drinks)));
        
        bw.flush();
        bw.close();
        br.close();
    }
}
