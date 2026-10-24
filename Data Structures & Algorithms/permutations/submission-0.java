class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList();
        List<Integer> sublist = new ArrayList();
        boolean[] flag = new boolean[nums.length];

        backtrack(nums, result, sublist, flag);
        return result;
    }

    public void backtrack(int[] nums, List<List<Integer>> result, List<Integer> sublist, boolean[] flag){

        if(sublist.size() == nums.length){
            result.add(new ArrayList(sublist));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
        if(!flag[i]){
        sublist.add(nums[i]);
        flag[i] = true;
        backtrack(nums, result, sublist, flag);
        sublist.remove(sublist.size()-1);
        flag[i] = false;
        }
        }
    }
}
