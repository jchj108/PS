package leetcode.leetcode75one;

import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.List;

public class TreePreorderTraversal {
    public static List<Integer> list = new ArrayList<>();

    static class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };

    public static void main(String[] args) {

        ArrayList<Node> nodes = new ArrayList<>();
        nodes.add(new Node(3));
        nodes.add(new Node(3));

        Node node = new Node(0, nodes);

    }
    public static List<Integer> preorder(Node root) {
            if (root == null)
                return list;

            list.add(root.val);
            for(Node node: root.children)
                preorder(node);

            return list;

    }
}
