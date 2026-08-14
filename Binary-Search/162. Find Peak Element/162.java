class Solution {
    public int findPeakElement(int[] nums) {
        int low=0;
        int high=nums.length-1;


        //low<=high -> searching for specific target n in end u need to check final element
        //low<high -> when u narrowing range until last element remains 
        while(low<high){
            int mid=low+(high-low)/2;

            if(nums[mid]<nums[mid+1]){ // upward
                low=mid+1;
            }else{
                high=mid;
            }
        }
        return low;
    }
}