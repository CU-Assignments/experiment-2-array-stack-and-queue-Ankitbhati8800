class Solution {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>map=new HashMap<>();
        Integer a = 0;
        Integer b = 0;
        int []ans = {-1, -1};
        for(int i=0;i<nums.length;i++){
            int compliment=target-nums[i];
            if(map.containsKey(compliment)){
                // return new int[]{
                //    a = map.get(compliment);
                   ans[1] = i;
                   ans[0] = map.get(compliment);
                // }
            }
                map.put(nums[i],i);
            // return null;
        }
        return ans;
    }
}
