class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] leftprefix = new int[nums.length];
        int[] rightprefix = new int[nums.length];
        int[] result = new int[nums.length];
        
        leftprefix[0] = 1;
        rightprefix[nums.length-1]=1;

        for(int i=1; i<nums.length;i++){
            leftprefix[i]= nums[i-1]*leftprefix[i-1];
        }

        for(int i=nums.length-2; i>=0;i--){
            rightprefix[i]= nums[i+1]*rightprefix[i+1];
        }

        for(int i=0; i<nums.length;i++){
            result[i]= leftprefix[i]*rightprefix[i];
        }
        return result;
    }
}  
