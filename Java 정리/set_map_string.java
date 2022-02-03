package grammar;

import java.util.*;

public class set_map_string {
    public static void main(String[] args) {

        /* Set */
        //값 넣기(add)
        Set<String> set = new HashSet<String>();
        set.add("a");

        //값 삭제(remove)
        set.remove("a");

        //Iterator
        //set의 값을 조회할 때 set명.iterator()를 사용해 반복자를 생성
        //반복자.hasNext() : 다음 값 존재하는지 확인
        //반복자.next() : 참조값 가져옴

        set.add("1");
        set.add("2");
        set.add("3");

        Iterator<String> iter = set.iterator();
        while(iter.hasNext()){
            String a = iter.next();
            System.out.println(a);
        }

        //size : set의 크기는 set명.size()
        System.out.println(set.size());

        /* Map */

        //값 넣기(put) : Map에 {key:value}값을 설정할 때 map명.put(key,value) 메소드 사용
        Map<String,Integer> map = new HashMap<>();
        map.put("first", 1);

        //값 가져오기(get) : {key:value}쌍의 value 값을 가져올 때, map명.get(key값) 메소드를 사용
        System.out.println(map.get("first"));

        //key값 존재 확인(containsKey) : map명.containsKey(key값)
        //존재하면 true, 그렇지 않으면 false 반환
        if(map.containsKey("first")){
            System.out.println(map.get("first"));
        }

        //Iterator :map명.keySet().iterator()를 사용해 반복자 생성
        //반복자.hasNext() 메소드로 다음 값이 존재하는지, 반복자.next()로 참조값 가져옴
        Iterator<String> it = map.keySet().iterator();
        while(it.hasNext()){
            String key = it.next();
            System.out.println(key);
            int value = map.get(key);
            System.out.println(value);
        }

        //size : map명.size()
        System.out.println(map.size());

        //String

        //대 -> 소문자 변경 : toLowerCase()
        String str = "ABC";
        str = str.toLowerCase();

        //소 -> 대문자 변경 : toUpperCase()
        str = str.toUpperCase();

        //!!!!! String to Array : 스트링명.split() !!!!!
        str = "가나다라마";
        String[] str_array = str.split("");
        System.out.println(Arrays.toString(str_array));
        System.out.println(str_array[0]);

        //문자열 자르기(substring) : 스트링명.substring()
        //스트링명.substring(index) : index를 포함한 위치부터 문자열 끝까지 추출
        //스트링명.substring(시작값, 끝 값) : 시작값부터 끝 값 - 1까지 추출
        str = "123456";
        String sub_str1 = str.substring(3);
        String sub_str2 = str.substring(2,4);
        System.out.println(sub_str1);
        System.out.println(sub_str2);

        //문자열 뒤집기 : StringBuilder(문자열).reverse().toString()
        str = "Reverse";
        str = new StringBuilder(str).reverse().toString();
        System.out.println(str);

        //length : 문자열명.length() -> array는 length로 차이가 있다.
        System.out.println(str.length());

        //문자 치환 : 문자열.replaceAll(변환대상, 변환할 문자)
        //replaceAll은 정규표현식 사용가능
        str = "abcde";
        System.out.println(str.replaceAll("a","b"));

        /*
        * 정규표현식
        * ^ : 문자열 시작
        * $ : 문자열 종료
        * . : 임의의 한 문자
        * * : 앞 문자가 없을 수도, 무한정 많을 수도 있음
        * + : 앞 문자가 하나 이상
        * ? : 앞 문자가 없거나 하나 있음
        * [] : 문자의 집합, 번위를 나타냄. 두 문자 사이는 -기호로 범위 표시. []내에서 ^가 선행하여 존재할 경우 not을 나타냄
        * {} : 횟수 또는 범위
        * | : 패턴 안에서 or 연산
        * */



    }
}
