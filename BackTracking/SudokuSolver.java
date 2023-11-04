package BackTracking;

public class SudokuSolver {
    public static void main(String[] args) {
        int sudoku[][]=	{
         {0,0,0,0,0,0,0,5,4},
         {1,5,9,4,3,0,7,2,6},
         {8,4,6,5,0,2,0,0,0},
         {0,3,2,9,6,1,5,8,7},
         {9,6,5,7,8,0,0,0,0},
         {0,0,0,0,0,0,0,0,3},
         {0,9,1,8,0,0,4,7,0},
         {0,0,7,0,9,4,6,1,0},
         {0,0,0,0,0,0,3,9,5}
    };
        if(sudoku(sudoku,0,0)){
            System.out.println("Solution Exist");
            printSudoku(sudoku);
        }else {
            System.out.println("Solution Doesn't Exist");
        }
    }
    public static void printSudoku(int sudoku[][]){
        int count=0;
        for (int i = 0; i < sudoku.length; i++) {
            if((i+1)%3==1){
                System.out.println("__________________________");
            }
            for (int j = 0; j < sudoku.length; j++) {
                System.out.print(sudoku[i][j]+" ");
                count++;
                if(count==3){
                    System.out.print(" | ");
                    count=0;
                }
            }
            System.out.println();

        }
        System.out.println("__________________________");
    }
    public static boolean sudoku(int sudoku[][],int row,int col){
        //base case
        if(row==9 && col==0){
            return true;
        }
        //kaam
        int nextRow=row ,nextCol=col+1;
        if(col+1==9){
            nextRow=row+1;
            nextCol=0;
        }

        if(sudoku[row][col]!=0){
            return sudoku(sudoku,nextRow,nextCol);
        }
        for (int digit=1;digit<=9;digit++){
            if (isSafe(sudoku,row,col,digit)){
                sudoku[row][col]=digit;
                if(sudoku(sudoku,nextRow,nextCol)){
                    return true;
                }
                sudoku[row][col]=0;
            }
        }
        return false;
    }
    public static boolean isSafe(int sudoku[][],int row,int col,int digit){
        //column
        for (int i = 0; i <9; i++) {
            if(sudoku[i][col]==digit){
                return false;
            }
        }
        //row
        for (int i = 0; i <9; i++) {
            if(sudoku[row][i]==digit){
                return false;
            }
        }
        //grid
        int sr=(row/3)*3;
        int sc=(col/3)*3;
        for (int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(sudoku[i][j]==digit){
                    return false;
                }
            }
        }
        return true;
    }
}
