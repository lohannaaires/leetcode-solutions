class Solution {
    fun shuffle(nums: IntArray, n: Int): IntArray {
        
        val numsResult = IntArray(nums.size){0}
        var j = n
        var k = 0
        
        for(i in nums.indices) {
            
            if(i % 2 == 1) {
                numsResult[i] = nums[j]
                j++
            } else {
                numsResult[i] = nums[k]
                k++
            }
            
        }
        
        return numsResult
        
    }
}

