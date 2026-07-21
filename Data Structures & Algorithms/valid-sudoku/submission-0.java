class Solution {
    public boolean isValidSudoku(char[][] board) {
        /*

        - hashmap for row, column, and 3x3 box
        - at each index, check if number is in row, column, or 3x3 already
        - if not, add to all of them
        - 3x3 hashmap will be key = (row / 3), (index of row / 3),
           0   1   2   3   4   5  6    7   8
        0[["5","3",".",".","7",".",".",".","."]
        1,["6",".",".","1","9","5",".",".","."]
        2 [".","9","8",".",".",".",".","6","."]
        3 ["8",".",".",".","6",".",".",".","3"]
        4 ["4",".",".","8",".","3",".",".","1"]
        5 ["7",".",".",".","2",".",".",".","6"]
        6 [".","6",".",".",".",".","2","8","."]
        7 [".",".",".","4","1","9",".",".","5"]
        8 [".",".",".",".","8",".",".","7","9"]]
        
        */

        Map<Integer, Set<Integer>> rows = new HashMap<>();
        Map<Integer, Set<Integer>> columns = new HashMap<>();
        Map<String, Set<Integer>> box = new HashMap<>();

        for(int i = 0; i < board.length; i++){

            if(!rows.containsKey(i)){
                rows.put(i, new HashSet<>());
            }

            for(int j = 0; j < board[i].length; j++){

                if(rows.get(i).contains(Character.getNumericValue(board[i][j]))){
                   return false; 
                } else if(board[i][j] != '.'){
                    rows.get(i).add(Character.getNumericValue(board[i][j]));
                }

                if(!columns.containsKey(j)){
                    columns.put(j, new HashSet<>());
                }

                if(columns.get(j).contains(Character.getNumericValue(board[i][j]))){
                    return false;
                } else if(board[i][j] != '.') {
                    columns.get(j).add(Character.getNumericValue(board[i][j]));
                }

                String boxCoordinate = (i/3) + "," + (j/3);

                if(!box.containsKey(boxCoordinate)){
                    box.put(boxCoordinate, new HashSet<>());
                }

                if(box.get(boxCoordinate).contains(Character.getNumericValue(board[i][j]))){
                    return false;
                } else if(board[i][j] != '.'){
                    box.get(boxCoordinate).add(Character.getNumericValue(board[i][j]));
                }

            }
        }

        return true;
    }
}
