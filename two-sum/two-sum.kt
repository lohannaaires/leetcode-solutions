class Solution {
    
    fun twoSum(nums: IntArray, target: Int): IntArray {
        
        lateinit var result: IntArray
        
        for (i in nums.indices) {
            for (j in i+1..(nums.size-1)) {
                if((nums[i] + nums[j]) == target){
                    result = intArrayOf(i, j)
                    return result
                }
            }
        }
        
        return result
        
    }
}