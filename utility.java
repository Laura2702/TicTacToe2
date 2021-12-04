
public class utility {

	public static char hasWon(char[][] board) {
		  //row
		for(int i = 1; i < 4; i++) {
			if(winCheckRow(board, i)){
			  return board[i][1];
				  
			}
		}
		  
		  //Column
		  for(int j = 1; j < 4; j++) {
			  if(winCheckColumn(board, j)){
				return board[1][j];  
			  }
		  }
		  
		  //diagonale
		  if(winCheckDiagonalDescend(board)) {
			  return board[1][1];
		  }
		  
		  if(winCheckDiagonalAscend(board)) {
			  return board[3][1];
		  }
	  
		  //nobody has won
		  return '-';
	  }
	
	
	private static boolean winCheckRow (char[][] board, int i) {
		return board[i][1] == board[i][2] && board[i][2] == board[i][3] && board[i][1] != '-';
	}
	
	
	private static boolean winCheckColumn (char[][] board, int j) {
		return board[1][j] == board[2][j] && board[2][j] == board[3][j] && board[1][j] != '-';
	}
	
	
	private static boolean winCheckDiagonalDescend (char[][] board) {
		return board[1][1] == board[2][2] && board[2][2] == board[3][3] && board[1][1] != '-';
	}
	
	
	private static boolean winCheckDiagonalAscend (char[][] board) {
		return board[3][1] == board[2][2] && board[2][2] == board[1][3] && board[3][1] != '-';
	}
	
	
	
	//checks if game is tied
		public static boolean hasTie(char[][] board) {
			for(int i = 1; i < 4; i++) {
				for(int j = 1; j < 4; j++) {
					if(board[i][j] == '-') {
						return false;
					}
				}
			}
			return true;
		}
		
		
		public static boolean outOfBounds(int row, int column) {
		
			if(row < 1 || column < 1 || row > 3 || column > 3) {
			return true;
			}
			
			return false;
		}
		
		
		public static char writeInBoard(char[][] board, int row, int column, char symbol) {
			board[row][column] = symbol;
			return board[row][column];
		}
}
