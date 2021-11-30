class Solution {
    fun runningSum(nums: IntArray): IntArray {
        
        val runningSum = IntArray(nums.size){0}
        var sum = 0
        
        for(i in nums.indices) {
            sum += nums[i]
            runningSum[i] = sum
        }
        
        return runningSum
        
    }
}