class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        /*

        use binary search on the rows first, then when we get the row we need, use binary search on the row 

        [1, 2, 4,  8]
        [10,11,12,13]
        [14,20,30,40]

        0 + 2 2/2 = 1
        [8, 13, 40]
        int[i][matrix[i].length - 1]

        int left = 0
        int right = matrix.length - 1
        int rowToSearch = 0

        while(left <= right){
            int midpoint = (left + right) / 2;
            if(matrix[midpoint][matrix[midpoint].length - 1] > target){
                right = midpoint - 1;
            } else if (midpoint < target){
                left = midpoint + 1;
            } else {
                rowToSearch = midpoint;
                break;
            }
        }

        if rowToSearch == 0 and matrix.length > 1:
            rowToSearch = left;
        

        left = 0
        right = matrix[rowToSearch][matrix[rowToSearch].length - 1];

        */


        int left = 0;
        int right = matrix.length - 1;

        int rowToSearch = 0;
        int lastNumInRow = matrix[0].length - 1;

        
        if(matrix.length != 1){
            while(left <= right){
                int midpoint = (left + right) / 2;

                if(matrix[midpoint][lastNumInRow] > target){
                    rowToSearch = midpoint;
                    right = midpoint - 1;
                } else if (matrix[midpoint][lastNumInRow] < target){
                    left = midpoint + 1;
                    rowToSearch = left;
                } else {
                    return true;
                }
            }
        } else {
            rowToSearch = 0;
        }

        if (rowToSearch >= matrix.length) return false;

        left = 0;
        right = lastNumInRow;

        while(left <= right){
            int midpoint = (left + right) / 2;

            if(matrix[rowToSearch][midpoint] > target){
                right = midpoint - 1;
            } else if (matrix[rowToSearch][midpoint] < target){
                left = midpoint + 1;
            } else {
                return true;
            }
        }

        return false;


    }
}