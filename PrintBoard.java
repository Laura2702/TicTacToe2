//draws the board
public class PrintBoard {

	public static void printBoard(char[][] board) {
		board[0][0] = ' ';
		board[0][1] = '1';
		board[0][2] = '2';
		board[0][3] = '3';
		board[1][0] = '1';
		board[2][0] = '2';
		board[3][0] = '3';
	    for(int i = 0; i < 4; i++) {
	      for(int j = 0; j < 4; j++) {
	        System.out.print(board[i][j]);
	      }
	      System.out.println();
	    }

	  }
}
