class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        dfs(root, "", result);
        return result;
    }

    private void dfs(TreeNode node, String path, List<String> result) {
        if (node == null) return;
        path += node.val;
        if (node.left == null && node.right == null) {
            result.add(path);
        } else {
            path += "->";
            dfs(node.left, path, result);
            dfs(node.right, path, result);
        }
    }
}
