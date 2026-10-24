class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList();
        List<Integer> sublist = new ArrayList();
        Arrays.sort(candidates);
         backtrack(candidates, target, 0, result, sublist, 0);
         return result;
    }

    public void backtrack(int[] nums, int target, int i, List<List<Integer>> result, List<Integer> sublist, int total){

        if(total == target){
            result.add(new ArrayList<>(sublist));
            return;
        }
        if(total> target || i == nums.length){
            return;
        }
        sublist.add(nums[i]);
        backtrack(nums, target, i+1, result, sublist, total+nums[i]);
        sublist.remove(sublist.size()-1);
        while(i+1 < nums.length && nums[i] == nums[i+1]){ i++;}
        backtrack(nums, target,i+1, result, sublist, total);
    }
}
