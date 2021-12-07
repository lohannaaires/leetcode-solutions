class Solution {
    fun arrayStringsAreEqual(word1: Array<String>, word2: Array<String>): Boolean {
        
        var result = false
        val string1 = concatenate(word1)
        val string2 = concatenate(word2)
        
        if(string1 == string2) {
          result = true
        }
        
        return result
    }
    
    fun concatenate(word: Array<String>): String {
        var result = ""
        
        word.forEach{value ->
            result += value
        }
        
        return result
    }
}