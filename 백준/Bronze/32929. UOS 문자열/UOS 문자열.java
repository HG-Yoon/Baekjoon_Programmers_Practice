import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Long x = Long.parseLong(br.readLine());
        if (x % 3 == 1) {
            bw.write("U");
        } else if (x % 3 == 2) {
            bw.write("O");
        } else {
            bw.write("S");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
