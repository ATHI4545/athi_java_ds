class Solution {
    public int search(int[] nums, int target) {
        int pos=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
            else{
                pos=-1;;
            }
        }
        return pos;
    }
}