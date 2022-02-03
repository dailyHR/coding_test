import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<String,Integer>();
        for(int i = 0 ; i < participant.length; i++){
            if(!map.containsKey(participant[i])){
                map.put(participant[i], 1);
            }
            else{
                int value = map.get(participant[i]) + 1;
                map.put(participant[i], value);
            }
        }

        for(int i = 0 ; i < completion.length; i++){
            if(!(map.containsKey(completion[i]))){
                answer = completion[i];
            }
            else{
                int value = map.get(completion[i]) - 1;
                map.put(completion[i], value);
            }
        }
        
        if(answer.equals("")){
            Iterator<String> iter = map.keySet().iterator();
            while(iter.hasNext()){
                String key = iter.next();
                int value = map.get(key);
                if(value > 0){
                    answer = key;
                }
            }
        }
        return answer;
    }
}
