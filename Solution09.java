class Solution {
    public static int maximumNumberOfStringPairs(String[] words) {
        int ans=0;
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                if(words[i].equals(reverse(words[j]))){
                    ans++;
                }
            }
        }
        return ans;
    }
    public static String  reverse(String str) {
        String ans="";
        ans+=str.charAt(1);
        ans+=str.charAt(0);
        return ans;
    }
}
