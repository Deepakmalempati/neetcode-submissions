class Solution {

    public int binary(int l, int r, int target, int[] nums){

        int mid = l+ (r-l)/2;
        if(l>r) return -1;

        if(nums[mid] == target) return mid;
        if(nums[mid] < target){
            return binary(mid+1, r, target, nums);
        }
        else{
            return binary(l, mid-1, target, nums);
        }
    }
    public int search(int[] nums, int target) {
        return binary(0, nums.length-1, target, nums);
    }
}
