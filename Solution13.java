class Solution {
    public boolean areOccurrencesEqual(String s) {
        int n=s.length();
        int count=0;
        for(int i=0;i<n;i++)
        {
            int countemp=0;
            for(int j=0;j<n;j++)
            {
                if(s.charAt(i)==s.charAt(j))
                countemp++;
            }
            if(i==0) count=countemp;
            if(count!=countemp) return false;
        }
        return true;
    }
}
