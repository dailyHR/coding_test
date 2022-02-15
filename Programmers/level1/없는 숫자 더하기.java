class Solution {
    public int solution(int[] numbers) {
        int answer = -1;
        boolean[] array = new boolean[10];
        for(int i = 0 ; i < numbers.length; i++){
            array[numbers[i]] = true;
        }
        
        int sum = 0;
        for(int i = 0 ; i < array.length; i++){
            if(array[i] == false){
                sum += i;
            }
        }
        
        answer = sum;
        return answer;
    }
}
