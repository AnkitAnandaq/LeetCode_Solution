class Solution {
    public int[] rearrangeArray(int[] nums) {
        int pIndex=0;
        int nIndex=1;
        int[] ans =new int[nums.length];
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                ans[pIndex] =nums[i];
                pIndex +=2;
            }
            else{
                ans[nIndex] =nums[i];
                nIndex +=2;
            }
        }
        return ans;
    }
}