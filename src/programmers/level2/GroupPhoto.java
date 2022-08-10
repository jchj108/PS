package programmers.level2;

import java.util.Arrays;

public class GroupPhoto {

    static char[] friends = {'A', 'C', 'F', 'J', 'M', 'N', 'R', 'T'};
    static Character[] res = new Character[8];
    static boolean[] visited = new boolean[8];
    static int cnt;
    static String[] d;

    public static void main(String[] args) {
        String[] data = {"N~F=0", "R~T>2"};
        solution(1, data);
    }

    public static int solution(int n, String[] data) {

        d = data;

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length(); j++) {
                char ch = data[i].charAt(j);
            }
        }
        dfs(0, 0);
        return cnt;
    }

    private static void dfs(int idx, int depth) {

        if (depth == friends.length) {
            if (validate()) {
                cnt++;
                for (char c : res) {
                    System.out.print(c);
                }
                System.out.println();
            }

            return;
        }
        for (int i = 0; i < friends.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                res[depth] = friends[i];
                dfs(i, depth + 1);
                visited[i] = false;
            }
        }
    }

    private static boolean validate() {
        char op;
        for (String s : d) {
            int a = Arrays.asList(res).indexOf(s.charAt(0));
            int b = Arrays.asList(res).indexOf(s.charAt(2));
            int val = s.charAt(4) - '0';
            int distance = Math.abs(a - b) - 1;
            op = s.charAt(3);

            if (op == '=') {
                if (distance != 0) {
                    return false;
                }
            } else if (op == '>') {
                if (distance <= val) {
                    return false;
                }
            } else {
                if (distance >= val) {
                    return false;
                }
            }
        }
        return true;
    }
}
