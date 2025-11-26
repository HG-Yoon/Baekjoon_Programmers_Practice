import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input1 = br.readLine();
        String input2 = br.readLine();
        int cnt1 = 0, cnt2 = 0;
        for (int i = 0; i < input1.length(); i++) {
            char c = input1.charAt(i);
            if (c == 'a') {
                cnt1++;
            }
        }
        for (int i = 0; i < input2.length(); i++) {
            char c = input2.charAt(i);
            if (c == 'a') {
                cnt2++;
            }
        }
        if (cnt1 >= cnt2) {
            bw.write("go");
        } else {
            bw.write("no");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
