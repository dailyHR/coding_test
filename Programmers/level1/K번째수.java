import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int m = 0; m < commands.length ; m++){
            //ArrayList<Integer> temp = new ArrayList<Integer>();

            int i = commands[m][0];
            int j = commands[m][1];
            int k = commands[m][2];
            
            int[] temp = Arrays.copyOfRange(array, i-1, j);
            Arrays.sort(temp);
            int number = temp[k-1];
            answer[m] = number;
            
            
            // for(int g = i-1; g < j ; g++){
            //     temp.add(array[g]);
            // }
            
            // temp.sort(null);
            // int number = temp.get(k-1);
            // System.out.println(number);
            
            //answer[m] = number;
        }
        
        return answer;
    }
}
