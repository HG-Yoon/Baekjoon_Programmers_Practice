import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String s = br.readLine();
            String answer = s.charAt(0) + "" + s.charAt(s.length() - 1);
            bw.write(answer + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
