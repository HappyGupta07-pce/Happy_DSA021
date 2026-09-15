import java.util.*;
class Solution {
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < score.length; i++){
            pq.add(score[i]);
        }
        String ans[] = new String[score.length];
          int rank = 1;
        while (!pq.isEmpty()) {
            int currentScore = pq.poll();
            if (rank == 1) {
                ans[findIndex(score, currentScore)] = "Gold Medal";
            }
            else if (rank == 2) {
                ans[findIndex(score, currentScore)] = "Silver Medal";
            }
            else if (rank == 3) {
                ans[findIndex(score, currentScore)] = "Bronze Medal";
            }
            else {
                ans[findIndex(score, currentScore)] = String.valueOf(rank);
            }

            rank++;
        }

        return ans;
    }
     static int findIndex(int[] score, int value) {
        for (int i = 0; i < score.length; i++) {
            if (score[i] == value) {
                return i;
            }
        }
        return -1;
}
}