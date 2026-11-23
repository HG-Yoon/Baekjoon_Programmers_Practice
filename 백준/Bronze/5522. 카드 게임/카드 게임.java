import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] score = new int[5];
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            score[i] = Integer.parseInt(br.readLine());
            sum += score[i];
        }
        bw.write(Integer.toString(sum));


        br.close();
        bw.flush();
        bw.close();
    }
}