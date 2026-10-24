class Solution {
    public int search(int[] nums, int target) {

        int l = 0;
        int r = nums.length-1;

    return binarysearch(l,r,nums,target);
    }

    public int binarysearch(int l, int r, int[]nums, int target){
        int mid = l + (r-l)/2;
        if (l > r) return -1;
        if (nums[mid] == target) return mid;
        if(target<nums[mid]){
            return binarysearch(l, mid-1, nums, target);
        }else{
            return binarysearch(mid+1, r, nums, target);
        }
    }
}
