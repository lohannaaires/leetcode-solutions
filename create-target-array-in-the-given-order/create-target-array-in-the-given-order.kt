class Solution {
    fun createTargetArray(nums: IntArray, index: IntArray): IntArray {
        val target = IntArray(nums.size){0}
        val length = index.size-1
        
        for(i in index.indices) {
            
            for(j in length.downTo(index[i]+1)) {
                target[j] = target[j-1]
            }
            
            target[index[i]] = nums[i]
            
        }
        
        return target
    }
}