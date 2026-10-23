class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();

        Arrays.sort(nums);

        int n = nums.length;
        int subsets = (1<<n);
        for(int i=0;i<subsets;i++){
            List<Integer> subset = new ArrayList<>();
            for(int j=0;j<n;j++){
                if(check(i,j)){
                    subset.add(nums[j]);
                }
            }
            set.add(subset);
        }
      //  list.addAll(set);
      for(List<Integer> subset :set){
        list.add(subset);
      }
        return list;
    }
    public boolean check(int n, int k){
        int ans = (n>>k);
        int kth = ans&1;
        return kth==1;
    }
}