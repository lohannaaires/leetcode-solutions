class Solution {
    fun buildArray(nums: IntArray): IntArray {
        
        val ans = IntArray(nums.size){0}
        
        for(i in nums.indices) {
            ans[i] = nums[nums[i]]
        }
        
        return ans
    }
    
}