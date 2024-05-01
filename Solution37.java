
class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int countBlank = 0;
        int sum = 0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i) == 'L'){
                sum++;
            }
            else if(moves.charAt(i) == 'R'){
                sum--;
            }
            else{
                countBlank++;
            }
        }
        return Math.abs(sum) + countBlank;
        
    }
}
