class Solution {
    public List<List<Integer>> combine(int n, int k) {
        if (k > n || k == 0) return new LinkedList<>();
        List<List<Integer>> ans = combine(n - 1, k - 1);
        if (ans.size() == 0) ans.add(new LinkedList<>(Arrays.asList(n)));
        else ans.forEach(e-> e.add(n));
        ans.addAll(combine(n - 1, k)); 
        return ans;
    }
}