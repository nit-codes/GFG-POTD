class Solution {
	int countPairsWithDiffK (int[] A, int k) {
		int n = A.length;
		int result = 0;
		for(int i = 0; i < n; i++) {
			for(int j = i + 1; j < n; j++) {
				if(Math.abs(A[i] - A[j]) == k) {
					result++;
				}
			}
		}
		return result;
	}
}
