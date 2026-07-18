class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n1 =nums1.length;
        int n2 = nums2.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0,j=0;
        ArrayList<Integer> l= new ArrayList<>();
        while(i<n1 && j<n2){
            if(nums1[i] < nums2[j]){
                i++;// no longer the nums[i] occurss in nums2
            }
            else if(nums2[j] < nums1[i]){
                j++;
            }else{
                if(l.size()==0 || l.get(l.size()-1) != nums1[i] || l.get(l.size()-1) == nums1[i]){
                    l.add(nums1[i]);
                }
                
                i++;
                j++;
            }
        }
        int[] ans = new int[l.size()];
        for(int k=0;k<l.size();k++){
            ans[k] = l.get(k);
        }
        return ans;
    }
}