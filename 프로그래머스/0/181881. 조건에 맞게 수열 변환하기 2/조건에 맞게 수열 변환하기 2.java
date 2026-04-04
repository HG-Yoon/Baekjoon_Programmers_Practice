import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int count = 0;
        int[] newArr = new int[arr.length];
        while (true) {
            System.arraycopy(arr, 0, newArr, 0, newArr.length);
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] /= 2;
                } else if (arr[i] < 50 && arr[i] % 2 != 0) {
                    arr[i] = arr[i] * 2 + 1;
                }
            }
            if (Arrays.equals(arr, newArr)) {
                answer = count;
                break;
            } else {
                count++;
            }
        }
        return answer;
    }
}