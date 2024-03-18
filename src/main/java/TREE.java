import javax.swing.tree.TreeNode;

class TREE {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return task(0, nums.length - 1, nums);
    }

    static TreeNode task(int low, int high, int[] nums) {
        if(low > high) return null;
        int max = -1, maxInd = 0;

        for(int i = low; i <= high; i++) {
            if(nums[i] > max) {
                max = nums[i];
                maxInd = i;
            }
        }

        TreeNode node = new TreeNode(max);

        node.left = task(low, maxInd - 1, nums);
        node.right = task(maxInd + 1, high, nums);

        return node;
    }
}