class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0)return null;
        return f(nums,0,nums.length-1);
    }
    public TreeNode f(int nums[],int l,int h){
        if(l>h)return null;
        int mid=(l+h)/2;
        TreeNode node=new TreeNode(nums[mid]);
        node.left=f(nums,l,mid-1);
        node.right=f(nums,mid+1,h);
        return node;
    }
}
