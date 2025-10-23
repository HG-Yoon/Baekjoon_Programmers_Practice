import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        for(int i=1;i<=n;i++){
            String s= br.readLine();
            StringBuilder sb=new StringBuilder(s);
            bw.write(sb.reverse().toString()+"\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
