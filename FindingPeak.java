// Time Complexity:O(logn)
// Space Complexity:O(1)
class Solution {
    public int findPeakElement(int[] nums) {
        int n= nums.length;
        int low=0;
        int high =n-1;
        while(low<=high){
            int mid =low+(high-low)/2;
            if((mid==0||nums[mid-1]<nums[mid])&&(mid==n-1||nums[mid+1]<nums[mid])) return mid;
            else if (nums[mid+1]>nums[mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
}