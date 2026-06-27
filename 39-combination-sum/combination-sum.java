class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = candidates.length;
        findCombination( 0, candidates, target, n, ans, new ArrayList<>() );
        return ans;
    }

    public void findCombination( int ind, int arr[], int target, int n, List<List<Integer>> ans, List<Integer> ds ) {
        if( ind == n ) {
            if( target == 0) {
                ans.add( new ArrayList<>(ds));
            }
            return;
        }
        if( arr[ind] <= target ) {
            ds.add( arr[ind] );
            findCombination( ind, arr, target - arr[ind], n, ans, ds );
            ds.remove( ds.size() - 1 );
        }
        findCombination( ind+1, arr, target, n, ans, ds );
    }
}