class Solution {
    public double averageWaitingTime(int[][] customers) {
        int n = customers.length;
        double totalWaitingTime = 0;
        int finishedPrev = 0;

        for (int i = 0; i < n; ++i) {
            int arriveTime = customers[i][0];
            int cookTime = customers[i][1];

            int startCookTime = Math.max(arriveTime, finishedPrev);
            int endTime = startCookTime + cookTime;
            finishedPrev = endTime;

            totalWaitingTime += endTime - arriveTime;
        }

        return totalWaitingTime / n;
    }
}
