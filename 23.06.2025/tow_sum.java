class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int com=target-nums[i];

            if(map.containsKey(com)){
                return new int[] {map.get(com),i};
            }
            else{
                 map.put(nums[i],i);
            }
        }
        throw new IllegalArgumentException("No Match"); 
    }
}