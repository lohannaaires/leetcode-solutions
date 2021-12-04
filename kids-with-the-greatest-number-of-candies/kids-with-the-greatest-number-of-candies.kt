class Solution {
    fun kidsWithCandies(candies: IntArray, extraCandies: Int): BooleanArray {
        
        var greatest = 0
        val result = BooleanArray(candies.size){false}
        
        for(i in candies.indices) {
            if(candies[i] > greatest) {
                greatest = candies[i]
            }
            
            candies[i] += extraCandies
        }
        
        for(i in candies.indices) {
            if(candies[i] >= greatest) {
                result[i] = true    
            }
        }
        
        return result
    }
}