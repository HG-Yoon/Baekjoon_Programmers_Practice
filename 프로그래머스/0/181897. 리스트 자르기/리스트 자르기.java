import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        List<Integer>list=Arrays.stream(answer).boxed().collect(Collectors.toList());
        if(n==1){
            for(int i=0;i<=slicer[1];i++){
                list.add(num_list[i]);
            }
        }else if(n==2){
            for(int i=slicer[0];i<=num_list.length-1;i++){
                list.add(num_list[i]);
            }
        }else if(n==3){
            for(int i=slicer[0];i<=slicer[1];i++){
                list.add(num_list[i]);
            }
        }else if(n==4){
            for(int i=slicer[0];i<=slicer[1];i+=slicer[2]){
                list.add(num_list[i]);
            }
        }
        answer=list.stream().mapToInt(i->i).toArray();
        return answer;
    }
}