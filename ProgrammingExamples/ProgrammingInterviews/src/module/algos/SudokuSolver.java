package module.algos;

public class SudokuSolver {
	
		static boolean[] getCandidate(char[][] board, int row, int column){
			boolean[] result = new boolean[9];
			for(int i=0; i<result.length; i++){
				result[i] = true;
			}
			
			for(int i=0; i<board.length; i++){
				if(board[row][i] != '.'){
					int no = Character.getNumericValue(board[row][i]);
						result[no]=false;
				}
			}
			
			for(int i=0; i<board.length; i++){
				if(board[i][column] != '.'){
					int no = Character.getNumericValue(board[i][column]);
					result[no]=false;
				}
			}
			
			int subBoardRow = row/3;
			int subBoardCol = column/3;
			
			for(int i=3*subBoardRow; i< (3*subBoardRow)+3 ; i++){
				for(int j=3*subBoardCol; j< (3*subBoardCol)+3;j++){
					if(board[i][j] != '.'){
						int no = Character.getNumericValue(board[i][j]);
						result[no] = false;
					}
				}
			}
			
			return result;
		}
		
		static boolean checkBoard(char[][] board){
			for(int i=0; i< board.length; i++){
				for(int j=0; j< board[i]. length; j++){
					if(board[i][j] == '.'){
						return false;
					}
				}
			}
			return true;
		}

		  static boolean sudokuSolve(char[][] board) {
			for(int i=0; i< board.length; i++){
				for(int j=0; j< board[i].length; j++){
					if(board[i][j] == '.'){
						boolean[] candidates = getCandidate(board, i, j);
						for(int k=0; k< candidates.length; k++){
							if(candidates[k]){
								board[i][j] = (char)k;
								if(checkBoard(board)){
									return true;
								}else{
									sudokuSolve(board);
								}
							}
						}
						return false;
					}
				}
			}
			  
			  
		   return false;
		  }

		  public static void main(String[] args) {
			  char[][] board = new char[9][9];
			  
			  board[0] = {''}
			  
			  
		  }
}


