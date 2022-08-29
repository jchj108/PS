package study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Temp2 {

    static List<Long[]> list = new ArrayList<Long[]>();

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("1 4");
        list.add("2 3");
        list.add("4 1");

        long res = countMax(list);
        System.out.println(res);
    }


    public static long countMax(List<String> upRight) {

        StringTokenizer st = new StringTokenizer(upRight.get(0));
        long r = Integer.parseInt(st.nextToken());
        long c = Integer.parseInt(st.nextToken());

        list.add(new Long[]{r, c});

        for (int i = 1; i < upRight.size(); i++) {
            st = new StringTokenizer(upRight.get(i));
            long token1 = Integer.parseInt(st.nextToken());
            long token2 = Integer.parseInt(st.nextToken());
            long nr = token1 > r ? r : token1;
            long nc = token2 > c ? c : token2;

            list.add(new Long[]{nr, nc});


        }

        Long minR = Long.MAX_VALUE;
        Long minC = Long.MAX_VALUE;

        for(int i = 0; i < list.size(); i++) {
            Long[] arr = list.get(i);

            minR = Math.min(arr[0], minR);
            minC = Math.min(arr[1], minC);
        }

        return minC*minR;
    }

//    private static long getMax() {
//        long max = 0;
//        for(int i = 0; i < map.length; i++) {
//            for(int j = 0; j < map[i].length; j++) {
//                max = Math.max(map[i][j], max);
//            }
//        }
//        return max;
//    }
//
//    private static long getMaxCnt(long max) {
//        long cnt = 0;
//        for(int i = 0; i < map.length; i++) {
//            for(int j = 0; j < map[i].length; j++) {
//                if (map[i][j] == max) {
//                    cnt++;
//                }
//            }
//        }
//        return cnt;
//    }
}
