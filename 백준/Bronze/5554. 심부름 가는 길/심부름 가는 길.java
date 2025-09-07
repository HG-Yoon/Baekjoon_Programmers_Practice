import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine()); // 집에서 학교까지의 이동 시간
        int b = Integer.parseInt(br.readLine()); // 학교에서 PC방까지의 이동 시간
        int c = Integer.parseInt(br.readLine()); // PC방에서 학원까지의 이동 시간
        int d = Integer.parseInt(br.readLine()); // 학원에서 집까지의 이동 시간
        int sum = a + b + c + d;
        int x = sum / 60;
        int y = sum % 60;
        bw.write(String.valueOf(x) + "\n" + String.valueOf(y));

        bw.flush();
        bw.close();
        br.close();
    }
}
