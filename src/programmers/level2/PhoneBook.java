package programmers.level2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class PhoneBook {

    public static void main(String[] args) {
        String[] phone_book = {"119", "97674223", "1195524421"};
        boolean result = solution(phone_book);
        System.out.println(result);
    }

    public static boolean solution(String[] phoneBook) {
        Arrays.sort(phoneBook);
        for (int i = 0; i < phoneBook.length - 1; i++) {
            if (phoneBook[i + 1].startsWith(phoneBook[i])) return false;
        }
        return true;
    }
}
