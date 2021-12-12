class Solution {
    fun countKDifference(nums: IntArray, k: Int): Int {
        
        var arrayIndices = nums.size - 1
        var sub = 0
        var result = 0
        
        for(i in nums.indices) {
            for(j in i..arrayIndices) {
                sub = when {
                    nums[i] < nums[j] -> nums[j] - nums[i]    
                    else -> nums[i] - nums[j]
                }
                
                if(sub == k) {
                    result++
                }
            }
        }
        
        return result
    }
}