class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {

        List<List<Integer>> result = new ArrayList();
        List<Integer> sublist = new ArrayList();

        backtrack(nums, target, 0, result, sublist);
        return result;
        
    }

    public void backtrack(int[] nums, int target, int i, List<List<Integer>> result, List<Integer> sublist){

        if(target == 0){
            result.add(new ArrayList(sublist));
            return;
        }
        if(target<0 || i>= nums.length){
            return;
        }
        sublist.add(nums[i]);
        backtrack(nums, target-nums[i], i, result, sublist);
        sublist.remove(sublist.size()-1);
        backtrack(nums, target, i+1, result, sublist);
    }
}
