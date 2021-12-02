class Solution {
    fun maximumWealth(accounts: Array<IntArray>): Int {
        
        var wealth = 0
        var previous = 0
        
        for(i in accounts.indices) {
            
            var arrayLength = accounts[i]?.size
            
            for(j in 0 until arrayLength) {
                previous += accounts[i][j]   
            }
            
            if(previous > wealth) {
                wealth = previous
            }
            
            previous = 0
            
        }
        
        return wealth
        
    }
}