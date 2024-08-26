class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        // Traverse all the children using a simple for loop
        for (int i = 0; i < root.children.size(); i++) {
            list.addAll(postorder(root.children.get(i)));
        }
        // Visit the root node
        list.add(root.val);
        return list;
    }
}
