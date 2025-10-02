import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        if (n % 8 == 1) {
            bw.write("1");
        } else if (n % 8 == 0 || n % 8 == 2) {
            bw.write("2");
        } else if (n % 8 == 3 || n % 8 == 7) {
            bw.write("3");
        } else if (n % 8 == 4 || n % 8 == 6) {
            bw.write("4");
        } else if (n % 8 == 5) {
            bw.write("5");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}
