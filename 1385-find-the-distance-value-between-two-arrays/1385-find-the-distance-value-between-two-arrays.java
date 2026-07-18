class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        //int j=0;
        int n1 = arr1.length;
        int n2 = arr2.length;
        int a =0;
      /* while(i<n1 && j<n2){
        int k = 0;
        int count=0

       }*/
       for(int i=0;i<n1;i++){
        int c=0;
            for(int j=0;j<n2;j++){
                if(Math.abs(arr1[i]-arr2[j]) >d)c++;
                else break;
            }
            if(c == n2){
                a++;
            }
       }
       return a;
    }
}