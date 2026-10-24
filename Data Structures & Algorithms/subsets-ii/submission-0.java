class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList();
        List<Integer> sublist = new ArrayList();
        Arrays.sort(nums);
        backtrack(nums, 0, result, sublist);
        return result;
    }

    public void backtrack(int[] nums, int i, List<List<Integer>> result, List<Integer> sublist){

        if(i >= nums.length){
            result.add(new ArrayList(sublist));
            return;
        }
        sublist.add(nums[i]);
        backtrack(nums, i+1, result, sublist);
        sublist.remove(sublist.size()-1);
        while(i+1<nums.length && nums[i] == nums[i+1]){
            
                i++;
            
        }
        backtrack(nums, i+1, result, sublist);
    }
}
