class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean result= false;
        Set<Integer> inputSet = new HashSet();
        for(int i=0; i<nums.length; i++){

            if(inputSet.contains(nums[i]))
            return true;

            inputSet.add(nums[i]);

        }
        return result;
    }
}