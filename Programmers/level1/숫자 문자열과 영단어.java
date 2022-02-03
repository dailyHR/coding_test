class Solution {
    public int solution(String s) {
        int answer = 0;
        /* 본인 풀이 */

        String temp = s;
        String word = "";
        String[] table = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String tempAnswer = "";
        String num = "0123456789";
        
        for(int i = 0 ; i < temp.length(); i++){
            if('a' <= temp.charAt(i) && temp.charAt(i) <= 'z'){
                word += temp.charAt(i);
                // System.out.print(word);
                for(int j = 0 ; j < table.length; j++){
                    if(word.equals(table[j])){
                        tempAnswer += num.charAt(j);
                        word = "";
                    }
                }
            }
            else{
                tempAnswer += temp.charAt(i);
            }
        }
        answer = Integer.parseInt(tempAnswer);
        
        /* replaceAll 이용한 풀이 */
        // String[] num_table = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        // String[] digit_table = {"0", "1", "2", "3", "4", "5","6","7","8","9"};
        // for(int i = 0 ; i<10 ; i++){
        //     s = s.replaceAll(num_table[i] , digit_table[i]);
        // }
        // answer = Integer.parseInt(s);
        return answer;
    }
}
