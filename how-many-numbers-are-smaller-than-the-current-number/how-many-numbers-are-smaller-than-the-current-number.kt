class Solution {
    fun smallerNumbersThanCurrent(nums: IntArray): IntArray {
        
        val sum = IntArray(nums.size)
        
        for(i in nums.indices) {
            for(j in nums.indices) {
                if(i != j && nums[j] < nums[i]) {
                   sum[i]++ 
                }
            }
        }
        
        return sum
    }
}