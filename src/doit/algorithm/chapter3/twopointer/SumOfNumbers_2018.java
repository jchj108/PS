package doit.algorithm.chapter3.twopointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfNumbers_2018 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int l = 1;
        int r = 1;
        int cnt = 1;
        int sum = 1;
        while (r < N) {
            if (sum == N) {
                cnt++;
                r++;
                sum += r;
            } else if (sum > N) {
                sum -= l;
                l++;
            } else {
                r++;
                sum += r;
            }
        }
        System.out.println(cnt);


    }
}
