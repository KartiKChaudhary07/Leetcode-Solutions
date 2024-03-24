class Solution07 {
    public boolean check(TreeNode n1 , TreeNode n2){
        if((n1 == null) && (n2 == null)){
            return true;
        }
        if(((n1 == null) && (n2 != null)) || ((n1 != null) && (n2 == null))){
            return false;
        }
        if(n1.val != n2.val){
            return false;
        }
        boolean left = check(n1.left , n2.left);
        boolean right= check(n1.right , n2.right);
        return (left && right);
    }

    public boolean isSameTree(TreeNode n1 , TreeNode n2){
        return check(n1 , n2);        
    }
}