class Solution {
    fun countMatches(items: List<List<String>>, ruleKey: String, ruleValue: String): Int {
        
        var quantityItems = 0
        
        for((i, array) in items.withIndex()) {
            when {
                (ruleKey == "type" && ruleValue == array[0]) ||
                (ruleKey == "color" && ruleValue == array[1]) ||
                (ruleKey == "name" && ruleValue == array[2]) -> quantityItems++
            }
        }
        
        return quantityItems
    }
}