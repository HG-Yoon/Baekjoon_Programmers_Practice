import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int l = Integer.parseInt(br.readLine()); // 방학의 총 일수
        int a = Integer.parseInt(br.readLine()); // 국어 총 페이지
        int b = Integer.parseInt(br.readLine()); // 수학 총 페이지
        int c = Integer.parseInt(br.readLine()); // 하루에 풀 수 있는 최대 국어 페이지
        int d = Integer.parseInt(br.readLine()); // 하루에 풀 수 있는 최대 수학 페이지
        int korFin = a % c == 0 ? a / c : a / c + 1;
        int mathFin = b % d == 0 ? b / d : b / d + 1;
        if (korFin != mathFin) {
            bw.write(String.valueOf(l - Math.max(korFin, mathFin)));
        } else {
            bw.write(String.valueOf(l - korFin));
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
