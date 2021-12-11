class Solution {
    fun decompressRLElist(nums: IntArray): IntArray {
        var freq = 0
        var j = 0
        var k = 0
        
        for(i in nums.indices) {
            if(i % 2 == 0) {
                freq += nums[i]    
            }
        }
        
        val array = IntArray(freq)
        
        for(i in nums.indices) {
            if(i % 2 == 0) {
                do {
                    array[j] = nums[i+1]
                    j++
                    k++
                } while(k <= nums[i]-1)
                
                k = 0    
            }
            
        }
        
        return array
    }
}