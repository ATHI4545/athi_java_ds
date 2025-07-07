class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        int[] sample=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return nums;        
    }
}
