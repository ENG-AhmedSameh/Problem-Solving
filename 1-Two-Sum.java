class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> numsComp = new HashMap<>();
        int comp = 0;
        for(int i = 0; i<nums.length; i++){
            comp = target - nums[i];
            if(numsComp.containsKey(comp))
                return new int[]{numsComp.get(comp),i};
            else
                numsComp.put(nums[i],i);
        }
        return null;
    }
    
}