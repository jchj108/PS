package base;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class findPrime {
    static int N;
    static int cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        int[] values = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        int i = 0;
        while (st.hasMoreTokens()) {
            values[i++] = Integer.parseInt(st.nextToken());
        }

        for (int j = 0; j < values.length; j++) {
            isPrime(values[j]);
        }
        System.out.println(cnt);

    }

    private static void isPrime(int j) {
        if(j < 2) {
            return;
        }

        for (int i = 2; i < j; i++) {
            if (j % i == 0) {
                return;
            }
        }
        cnt++;
    }
}
