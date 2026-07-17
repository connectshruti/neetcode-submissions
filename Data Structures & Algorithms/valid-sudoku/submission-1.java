class Solution {
    public boolean isValidSudoku(char[][] board) {
        for( int row=0;row<9;row++){
            HashSet<Integer>hs=new HashSet();
            for( int col=0;col<9;col++){
                
                if(board[row][col]=='.'){
                    continue;
                }
                Integer num=board[row][col]-'0';
                if(hs.contains(num)){
                    return false;
                }
                hs.add(num);

            }
        }
        
        for(int col=0;col<9;col++){
            HashSet<Integer>hs=new HashSet();
            for(int row=0;row<9;row++){
                
                if(board[row][col]=='.'){
                    continue;
                }
                Integer num= board[row][col]-'0';
                if(hs.contains(num)){
                    return false;
                }
                hs.add(num);
            }
        }

        for(int row=0;row<9;row+=3){
            for(int col=0;col<9;col+=3){
                HashSet<Integer>hs=new HashSet();
                for (int i =row; i<row+3;i++){
                    for(int j=col;j<col+3;j++){
                        
                        if(board[i][j]=='.'){
                            continue;

                        }
                        Integer num=board[i][j]-'0';
                        if( hs.contains(num)){
                            return false;
                        }
                        hs.add(num);
                    }
                }
            }
        }

return true;
    }
}
