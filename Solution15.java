class Solution {
    public int maxDepth(String s) {
        int maximum=Integer.MIN_VALUE;
        int res=0;
        for(int i=0;i<s.length();i++){
            int ch=s.charAt(i);
            if(ch=='('){
                res++;
            }
            else if(ch==')'){
                res--;
            }
            maximum=Math.max(maximum,res);
        }
        return maximum;   
      
    }
}
