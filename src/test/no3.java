package test;

import java.util.*;

public class no3 {

    static List<Node>[] adjList;
    static Integer[][] map;

    static class Node {
        int vertex;
        String name;

        public Node(int vertex, String name) {
            this.vertex = vertex;
            this.name = name;
        }
    }

    public static void main(String[] args) {

        String[][] friends =
                {
                        {"david", "frank"},
                        {"demi", "david"},
                        {"frank", "james"},
                        {"demi", "james"},
                        {"claire", "frank"}
                };
        String[] res = solution(friends, "david");
    }


    public static String[] solution(String[][] friends, String user_id) {
        Map<String, ArrayList<String>> map = new HashMap<>();

        for (int i = 0; i < friends.length; i++) {
            String[] s = friends[i];
            String from = s[0];
            String to = s[1];

            if (map.get(from) == null) {
                map.put(from, new ArrayList<>());
            }
            map.get(from).add(to);
        }

        adjList = new ArrayList[map.size()];

        int index = 0;
        for (Map.Entry<String, ArrayList<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            System.out.print("key = " + key);

            for(String s : entry.getValue()) {

            }
            System.out.println();
        }



//
//        for (int i = 0; i < friends.length; i++) {
//            adjList[i] = new ArrayList<>();
//        }
//
//        for (int i = 0; i < friends.length; i++) {
//            adjList[i] = new ArrayList<>();
//            String[] s = friends[i];
//            String from = s[0];
//            String to = s[1];
//
//
//        }
        return null;

    }


//    public static void bfs_array(String user_id, String[][] friends, boolean[] visited) {
//        Queue<String> queue = new LinkedList<>();
//        queue.add(user_id);
//
//        while (!queue.isEmpty()) {
//            String v = queue.poll();
//            String[] am = friends[v];
//
//        }
//
//
//
//    }
}
