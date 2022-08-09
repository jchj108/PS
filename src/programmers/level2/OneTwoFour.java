package programmers.level2;

public class OneTwoFour {

    public static void main(String[] args) {

        // 4진법, 3 - > 4
        System.out.println(10/3);
        String res = solution(10);
        System.out.println(res);

    }

    public static String solution(int n) {
        String[] numbers = {"4", "1", "2"};
        String answer = "";

        int num = n;

        while(num > 0){
            int remainder = num % 3;
            num /= 3;

            if(remainder == 0) num--;

            answer = numbers[remainder] + answer;
        }

        return answer;
    }
}
