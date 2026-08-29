class Solution {
    public int findMiddleIndex(int[] nums) {
     int sum=0;
     int leftsum=0;
     int rightsum=0;
     for(int i=0;i<nums.length;i++)
     {
        sum=sum+nums[i];
     } 
     for(int i=0;i<nums.length;i++)
     {
        if(leftsum==sum-leftsum-nums[i]){
            return i;
        }
        leftsum+=nums[i];
     }
     return -1;

     
    }
}