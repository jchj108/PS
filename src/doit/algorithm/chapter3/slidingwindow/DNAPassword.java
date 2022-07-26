package doit.algorithm.chapter3.slidingwindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class DNAPassword {

    static int s;
    static int p;
    static int[] arr = new int[4];


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        s = Integer.parseInt(st.nextToken());
        p = Integer.parseInt(st.nextToken());

        String dnaString = br.readLine();
        // A C G T 의 개수

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int l = 0;
        int r = p;
        int res = 0;

        while (r <= dnaString.length()) {
            String subStr = dnaString.substring(l, r);
            int a = 0;
            int c = 0;
            int g = 0;
            int t = 0;

            for (int i = 0; i < subStr.length(); i++) {
                char ch = subStr.charAt(i);
                switch (ch) {
                    case 'A' : a++;break;
                    case 'C' : c++;break;
                    case 'G' : g++;break;
                    case 'T' : t++;break;
                }
            }
            if (a >= arr[0] && c >= arr[1] && g >= arr[2] && t >= arr[3]) {
                res++;
            }
            l++;
            r++;
        }
        System.out.println(res);
    }

}
