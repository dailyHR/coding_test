import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        HashSet<String> set = new HashSet<String>();
        
        for(int i = 0 ; i < phone_book.length; i++){
            String temp = phone_book[i];
            set.add(temp);
        }
        
        for(int i = 0 ; i < phone_book.length; i++){
            String temp = phone_book[i];
            set.remove(temp);
            for(int j = 1 ; j < temp.length(); j++){
                String strTemp = temp.substring(0, j);
                if(set.contains(strTemp)){
                    answer = false;
                    break;
                }
            }

            set.add(temp);
        }
        
        
        return answer;
    }
}
