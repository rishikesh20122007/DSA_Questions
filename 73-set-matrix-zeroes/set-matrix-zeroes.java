class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;              //getting dimension through constraints
        int n = matrix[0].length;           //getting dimension through constraints
        
        boolean firstrowzero = false;
        boolean firstcolumnzero = false;

        //first check that row has any zero or not
        for(int j = 0 ; j < n ; j++){
            if(matrix[0][j]==0){
                firstrowzero = true;
                break;
            }
        }
        //checking colums have any zero or not
        for (int i = 0; i < m; i++){
            if(matrix[i][0]== 0){
                firstcolumnzero = true;
                break;
            }
        }
        for(int i = 1; i < m ; i++){   // markers of rows and columns
            for(int j = 1; j < n; j++){
                if(matrix[i][j]==0){
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                }
            }
        }
        for(int i = 1; i < m; i++){    //set cells  to zero based on markers
            for(int j = 1; j < n ; j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] =0;
                }
            }
        }
        if(firstrowzero){   //zero the first row if needed
            for(int j=0 ; j < n; j++ ){
                matrix[0][j] = 0;
            }
        }
        if(firstcolumnzero){   //zero the first columns if needed
            for(int i = 0; i < m; i++){
                matrix[i][0] = 0;
            }
        }
    }
}