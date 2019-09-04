// Time Complexity : o(n)
// Space Complexity :o[n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No 


// Your code here along with comments explaining your approach

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> result = new ArrayList<>();
        if(matrix.length ==0) return result;
        int lc = 0;
        int rc = matrix[0].length-1;
        int top = 0;
        int bottom = matrix.length-1;
        //        lc        rc
        // top    1    2    3
        //        4    5    6
        // bot    7    8    9
        
        while(top<= bottom && lc<=rc){
            //go from left to right and print the top row ie: 1,2,3
            for(int i=lc;i<=rc;i++){
                result.add(matrix[top][i]);
            }
            //top comes to 2nd row
            top++;
            //right column from top to bottom ie:6,9
            for(int i =top;i<=bottom;i++){
                result.add(matrix[i][rc]);
            }
            //right column comes to 2nd column
            rc--;
            //print bottom row from right to left ie:8,9
            if(top<=bottom){
                for(int i =rc;i>=lc;i--){
                    result.add(matrix[bottom][i]);
                }
                //bottom wil go to 2nd row
                bottom--;
            }
            //print bottom to top column ie: 4,1
            if(lc <= rc){
                for(int i=bottom;i>=top;i--)
                    result.add(matrix[i][lc]);
            }
            lc++;
            
        }
        return result;
        
    }
}