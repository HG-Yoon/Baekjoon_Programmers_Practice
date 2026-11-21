import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int caseNum = 0;

        while (true) {
            int n0 = Integer.parseInt(br.readLine());

            if (n0 == 0) {
                break;
            }

            int n1 = 3 * n0;
            caseNum++;
            if (n1 % 2 == 0) {
                int n2 = n1 / 2;
                int n3 = 3 * n2;
                int n4 = n3 / 9;
                bw.write(Integer.toString(caseNum) + ". " + "even " + Integer.toString(n4) + "\n");
            } else {
                int n2 = (n1 + 1) / 2;
                int n3 = 3 * n2;
                int n4 = n3 / 9;
                bw.write(Integer.toString(caseNum) + ". " + "odd " + Integer.toString(n4) + "\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}