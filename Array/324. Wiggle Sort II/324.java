class Solution {
    public void wiggleSort(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int[] res= new int[nums.length];
        int l=(n-1)/2;
        int r=n-1;

        for(int i=0;i<n;i++){
            if(i%2==0){
                res[i]=nums[l];
                l--;
            }else{
                res[i]=nums[r];
                r--;
            }
        }

        for(int i=0;i<n;i++){
            nums[i]=res[i];
        }
        
    }
}