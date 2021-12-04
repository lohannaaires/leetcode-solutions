class Solution {
    fun numIdenticalPairs(nums: IntArray): Int {
        
        var goodPairs = 0
        
        for(i in nums.indices) {
            for(j in 1 until nums.size) {
                if(nums[i] == nums[j] && i < j) {
                    goodPairs++
                }
            }
        }
        
        return goodPairs
        
    }
}