class Solution {
    public int trap(int[] height) {
        int l=0;
        int r=height.length-1;
        int result=0;
        int leftmax=height[l];
        int rightmax=height[r];

        while(l<r){
            if(leftmax< rightmax){
                l++;
        leftmax=Math.max(leftmax,height[l]);
        result+= leftmax - height[l];
            }else{
                r--;
        rightmax=Math.max(rightmax,height[r]);
        result += rightmax - height[r];
            }
    
        
        }
        return result;
    }
}
