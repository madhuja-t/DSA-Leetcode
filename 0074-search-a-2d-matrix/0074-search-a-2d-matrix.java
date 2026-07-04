class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r= matrix.length, c = matrix[0].length;
        int[] a = new int[r*c];
        int k=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[k++] = matrix[i][j];
            }
        }
        int low =0,high = r*c-1;
        boolean ans = false;
        while(low<= high){
            int mid = low+(high-low)/2;
            if(a[mid] == target){
                ans = true;
                break;
            }else if(a[mid] > target){
                    high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
}