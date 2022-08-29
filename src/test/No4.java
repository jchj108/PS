package test;

import java.util.*;

public class No4 {

    private static boolean[] visited;
    private static List<String> friendsList;
    private static List<String> mutualList;
    private static Queue<String[]> queue = new LinkedList<>();
    private static List<Node> nodeList;

    static class Node {
        int cnt;
        String from;
        String to;

        public Node(int cnt, String from, String to) {
            this.cnt = cnt;
            this.from = from;
            this.to = to;
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
        visited = new boolean[friends.length];
        friendsList = new ArrayList<>();
        mutualList = new ArrayList<>();
        nodeList = new ArrayList<Node>();

        bfs(friends, user_id);

        mutualList.removeAll(friendsList);
        HashSet<String> set = new HashSet();
        for (String s : mutualList) {
            set.add(s);
        }

        for (String s : set) {
            System.out.println(s);
        }

        return set.toArray(new String[set.size()]);
    }

    private static void bfs(String[][] friends, String user_id) {
        visited = new boolean[friends.length];

        for (int i = 0; i < friends.length; i++) {
            if (friends[i][0].equals(user_id)) {
                queue.add(friends[i]);
                visited[i] = true;
                friendsList.add(friends[i][1]);
            }
        }

        while (!queue.isEmpty()) {
            String[] v = queue.poll();
            String name = v[1];

            int temp = 0;
            for(int i = 0; i < friends.length; i++) {
                if(!visited[i] && ( friends[i][0].equals(name) || friends[i][1].equals(name))) {
                    temp++;
                    mutualList.add(friends[i][0]);
                    mutualList.add(friends[i][1]);
                    nodeList.add(new Node(temp, friends[i][0], friends[i][1]));
                    visited[i] = true;
                }
            }
        }
    }
}
