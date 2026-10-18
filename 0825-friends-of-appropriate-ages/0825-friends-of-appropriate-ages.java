class Solution {
    private static final int MAX_AGE = 120;
    public int numFriendRequests(int[] ages) {
        int[] ageFreq = new int[MAX_AGE + 1];
        for (int age : ages) {
            ageFreq[age]++;
        }
        int[] prefixSums = new int[MAX_AGE + 1];
        prefixSums[0] = ageFreq[0];
        for (int i = 1; i <= MAX_AGE; i++) {
            prefixSums[i] = prefixSums[i - 1] + ageFreq[i];
        }
        int requestCount = 0;
        for (int age : ages) {
        
            int minAge = age / 2 + 7;
            if (minAge < age) {
                requestCount += prefixSums[age] - prefixSums[minAge] - 1;
            }
        }
        return requestCount;
    }
}