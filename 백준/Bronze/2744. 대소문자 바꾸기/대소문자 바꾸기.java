import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        String str=br.readLine();

        char[]charArray=str.toCharArray();

        StringBuilder sb= new StringBuilder();

        for(int i=0;i<charArray.length;i++){
            if('A'<=charArray[i]&&charArray[i]<='Z'){
                charArray[i]=(char)(charArray[i]+32);
            }else if('a'<=charArray[i]&&charArray[i]<='z'){
                charArray[i]=(char)(charArray[i]-32);
            }
            sb.append(charArray[i]);
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
