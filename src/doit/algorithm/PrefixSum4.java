package doit.algorithm;import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.util.StringTokenizer;public class PrefixSum4 {    public static void main(String[] args) throws IOException {        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        StringTokenizer st = new StringTokenizer(br.readLine());        int N = Integer.parseInt(st.nextToken());        int M = Integer.parseInt(st.nextToken());        int[] nums = new int[N];        int[] sums = new int[N];        st = new StringTokenizer(br.readLine());        for(int i = 0; i < nums.length; i++) {            nums[i] = Integer.parseInt(st.nextToken());        }        for (int i = 0; i < sums.length; i++) {        }    }}