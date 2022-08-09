package programmers.level2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    public static void main(String[] args) {

        String[] phone_book = {"1", "12"};

        System.out.println(solution(phone_book));
    }

    public static boolean solution(String[] phone_book) {

        Map<String, String> map = new HashMap<>();

//        Arrays.sort(phone_book,
//                (o1, o2) -> o1.length() == o2.length() ? 0 : o1.length() > o2.length() ? 1 : -1);
        Arrays.sort(phone_book);

        for (String s : phone_book) {
            // 같은 전화번호가 없기 때문에 길이가 같으면 비교하지 않아도 된다.
            for (int j = 0; j < s.length(); j++) {
                String substr = s.substring(0, j + 1);

                if(map.get(substr) != null) {
                    return false;
                }
            }
            map.put(s, s);
        }
        return true;
    }
}
