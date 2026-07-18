class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int n1 = nums1.length;
        int n2 = nums2.length;
        ArrayList<Integer> l = new ArrayList<>();
        int i=0,j=0;
        while(i<n1 && j < n2){
            if(nums1[i] > nums2[j]){
                j++;
            }else if(nums1[i] < nums2[j]){
                i++;
            }else{
                if(l.size() ==0 ||l.get(l.size() -1) != nums1[i]){
                    l.add(nums1[i]);
                }
                i++;
                j++;
            }
        }
        int[] ans = new int[l.size()];
        for(int k=0;k<l.size();k++){
            ans[k]= l.get(k); 
        }
        return ans;
    }
}