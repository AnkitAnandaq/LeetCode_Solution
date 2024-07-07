class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int totalLength=nums1.length+nums2.length;
        int[] newArr =new int[totalLength];
        int length=newArr.length;
        int c=0;
        for(int i=0;i<nums1.length;i++){
            newArr[c]=nums1[i];
            c++;
        }
        for(int i=0;i<nums2.length;i++){
            newArr[c]=nums2[i];
            c++;
        }

        Arrays.sort(newArr);
        if(newArr.length==1){
            double median = newArr[0];
            return median;
        }
        if(length%2 !=0){
            double median =newArr[(length/2)];
            return median;
        }
        else{
            int firstHalf =length/2;
            int secondHalf=firstHalf-1;
            double median =(newArr[firstHalf]+newArr[secondHalf]) / 2d;
            return median;
        }
    }
}