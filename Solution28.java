class Solution {
    public String generateTheString(int n) {
        String s="";
        if(n%2!=0){
            for(int i=0;i<n;i++){
                s=s+'a';
            }
            return s;
        }
        
        for(int i=0;i<n-1;i++){
            s=s+'x';
        }
        int x=n-s.length();
        for(int i=0;i<x;i++){
            s=s+'y';
        }
        return s;
    }
}
