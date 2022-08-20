package programmers.level1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Mbti {

    static Character[] characters = {'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'};

    public static void main(String[] args) {

        String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
        int[] choices = {5, 3, 2, 7, 5};

        String s = solution(survey, choices);
        System.out.println(s);
    }

    public static String solution(String[] survey, int[] choices) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for (int i = 0; i < survey.length; i++) {
            String subject = survey[i];
            int choice = choices[i];

            Character negativeSubject = survey[i].charAt(0);
            Character positiveSubject = survey[i].charAt(1);

            switch (choice) {
                case 1 :
                    map.put(negativeSubject, 3);
                    break;
                case 2 :
                    map.put(negativeSubject, 2);
                    break;
                case 3 :
                    map.put(negativeSubject, 1);
                    break;
                case 5 :
                    map.put(positiveSubject, 1);
                    break;
                case 6 :
                    map.put(positiveSubject, 2);
                    break;
                case 7 :
                    map.put(positiveSubject, 3);
                    break;
            }
        }

        for (int i = 0; i < characters.length - 1; i+= 2) {
            System.out.println(map.get(characters[i]));

            Integer lv = map.get(characters[i]);
            Integer rv = map.get(characters[i + 1]);

            if (lv == null && rv == null) {
                sb.append(characters[i]);
            } else if (lv == null) {
                sb.append(characters[i + 1]);
            } else if (rv == null) {
                sb.append(characters[i]);
            } else if (lv >= rv) {
                sb.append(characters[i]);
            } else {
                sb.append(choices[i + 1]);
            }
        }
        return sb.toString();
    }

}

