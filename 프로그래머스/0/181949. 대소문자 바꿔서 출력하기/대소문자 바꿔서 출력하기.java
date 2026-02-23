import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] strArr = str.toCharArray();
        for (int i = 0; i < strArr.length; i++) {
            if (Character.isUpperCase(strArr[i])) {
                strArr[i] = Character.toLowerCase(strArr[i]);
            } else {
                strArr[i] = Character.toUpperCase(strArr[i]);
            }
        }
        System.out.println(strArr);
    }
}