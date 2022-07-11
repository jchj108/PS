package baekjoon;import java.io.*;import java.util.StringTokenizer;public class prefixSum5 {    public static void main(String[] args) throws IOException {        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        StringTokenizer st = new StringTokenizer(br.readLine());        int N = Integer.parseInt(st.nextToken());        int M = Integer.parseInt(st.nextToken());        long[][] nums = new long[N+1][N+1];        long[][] sums = new long[N+1][N+1];        for (int i = 1; i <= N; i++) {            st = new StringTokenizer(br.readLine());            for (int j = 1; j <= N; j++) {                nums[i][j] = Integer.parseInt(st.nextToken());                sums[i][j] = sums[i - 1][j] + sums[i][j - 1] + nums[i][j] - sums[i - 1][j - 1];            }        }        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));        for (int i = 0; i < M; i++) {            st = new StringTokenizer(br.readLine());            int stRow = Integer.parseInt(st.nextToken());            int stCol = Integer.parseInt(st.nextToken());            int endRow = Integer.parseInt(st.nextToken());            int endCol = Integer.parseInt(st.nextToken());            System.out.println(sums[endRow][endCol] - sums[stRow-1][endCol] - sums[endRow][stCol-1] + sums[stRow-1][stCol-1]);        }        br.close();    }}