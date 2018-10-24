class Solution {
    public int firstMissingPositive(int[] nums) {
        int min=1;
        List<Integer> ar=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            ar.add(nums[i]);
        }
        for(int i=0;i<ar.size();i++){
            if(ar.contains(min))
                min=min+1;
        }
        return min;
    }
}
