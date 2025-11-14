import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int[] month_days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int totalDays = 0;
        for (int i = 0; i < x - 1; i++) {
            totalDays += month_days[i];
        }
        totalDays += (y - 1);
        String[] days = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        bw.write(days[totalDays % 7]);
        
        bw.flush();
        bw.close();
        br.close();
    }
}
