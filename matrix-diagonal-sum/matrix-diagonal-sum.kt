class Solution {
    fun diagonalSum(mat: Array<IntArray>): Int {
        
        var primaryDiagonal = 0
        var secondaryDiagonal = 0
        var sum = 0
        var length = mat.size - 1
        
        for(i in 0..length) {
            
            primaryDiagonal += mat[i][i]
            
            if(length - i != i){
                secondaryDiagonal += mat[i][length - i]    
            }
            
        }
        
        sum = primaryDiagonal + secondaryDiagonal
        
        return sum
    }
}