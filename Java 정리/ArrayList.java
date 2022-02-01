//import java.util.*; -> 하나만 선언해도 대부분 라이브러리 사용 가능.

import java.util.*;

public class ArrayList_Test {
    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<Integer>();
        ArrayList<Integer> copy_array = new ArrayList<Integer>();
        array.add(5);
        array.add(2);
        //깊은 복사 : 리스트명.addAll()
        copy_array.addAll(array);

        //sort : 리스트명.sort()
        array.sort(null);
        System.out.print(array);

        //arrayList의 크기 : 리스트명.size()
        System.out.print(array.size());

        
        //set -> List 변경 : 생성자에 값을 넣어주면 set -> List 변경가능
        //Set과 List의 차이점 1. Set은 중복 값을 삽입할 수 없다. 2. Set은 특정한 순서를 가지고 있지 않다.
        Set<String> set = new HashSet<String>();
        set.add("가");
        set.add("나");
        System.out.println(set);
        List<String> list = new ArrayList<>(set);
        System.out.println(list);

        //Sort : Collections.sort(리스트명) -> 뒤에 s 잊지말것
        Collections.sort(list);

        //Add : 리스트명.add(넣을 값)
        list.add("가");
        System.out.println(list);

        //Remove : 리스트명.remove(index)
        list.remove(list.size()-1); //list의 마지막 값이 리스트에서 제거
        System.out.println(list);

        //Size : 리스트명.size()
        System.out.println(list.size());

        //Array

        //Sort : Arrays.sort(배열명) -> 마찬가지로 뒤에 s 잊지말것
        int[] intArray = new int[5];
        Arrays.sort(intArray);

        //length : 배열명.length
        int length = intArray.length;

        //!!!! String to Char Array : toCharArray() !!!!
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        char[] strToChar = new char[str.length()];
        strToChar = str.toCharArray();
        System.out.println(strToChar);

        //배열 특정 범위 자르기 : Arrays.copyOfRange(배열명,시작점,끝점)
        int[] ar = {1,2,3,4,5};
        int[] temp = Arrays.copyOfRange(ar,2,5);
        System.out.println(Arrays.toString(temp));

    }
}
