class Solution {
    fun finalValueAfterOperations(operations: Array<String>): Int {
        var X = 0
        
        operations.forEach { operation ->
           when(operation) {
               "++X" -> ++X
               "X++" -> X++
               "--X" -> --X
               "X--" -> X--
           }
        }
        
        return X
    }
}