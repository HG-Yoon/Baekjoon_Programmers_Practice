import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = "WelcomeToSMUPC"; // 14
        int n = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(s.charAt((n - 1) % 14)));

        bw.flush();
        bw.close();
        br.close();
    }
}
