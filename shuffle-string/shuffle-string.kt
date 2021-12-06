class Solution {
    
    fun restoreString(s: String, indices: IntArray): String {
        
        val sArray = CharArray(s.length)
        
        for((i, value) in indices.withIndex()) {
            sArray[value] = s[i]
        }
        
        return String(sArray)
        
    }                                                                                
}