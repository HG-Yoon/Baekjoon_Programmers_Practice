import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        char c = s.charAt(0);
        int result = c - '가' + 1;
        bw.write(String.valueOf(result));
        
        bw.flush();
        bw.close();
        br.close();
    }
}
