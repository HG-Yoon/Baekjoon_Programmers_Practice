class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int[] count = new int[1001];
        int maxCount = 0;
        int mod = 0;
        int modCount = 0;
        for (int i = 0; i < array.length; i++) {
            count[array[i]]++;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] > maxCount) {
                maxCount = count[i];
                mod = i;
            }
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] == maxCount) {
                modCount++;
            }
        }
        if (modCount >= 2) {
            answer = -1;
        } else {
            answer = mod;
        }
        return answer;
    }
}