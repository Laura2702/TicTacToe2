import java.util.Scanner;

public class tictactoe {

	
	public static void main(String[] args) {
		
		String player1name;
		String player2name;
		Scanner in;
		
		//who's turn
	    boolean isP1 = true;
	    boolean gameEnded = false;
	    
	    
		in = new Scanner(System.in);

	    System.out.println("Player 1, please enter your name: ");
	    player1name = in.nextLine();
	    System.out.println("Player 2, please enter your name: ");
	    player2name = in.nextLine();

	     
	    char[][] board = new char[4][4];

	    //- indicates/draws empty space in board
	    for(int i = 1; i < 4; i++) {
	      for(int j = 1; j < 4; j++) {
	        board[i][j] = '-';
	      }
	    }

	    
	    //gameloop
	    while(!gameEnded) {
		    PrintBoard.printBoard(board);
		    
	
		    
		    //keeps track of symbol belonging to player
		    //x game symbol of player 1
		    //o game symbol of player 2
		    
		    char symbol = ' ';
		    if(isP1) {
		    	symbol = 'x';
		    } else {
		    	symbol = 'o';
		    }
		    
		    
		    if(isP1) {
		    	System.out.println(player1name + "'s turn (x)");
		    } else {
		    	System.out.println(player2name + "'s turn (o)");
		    }
		    
		    //sets initial values of row and column
		    int row = 1;
		    int column = 1;
		    
		    while(true) {
			    System.out.println("Please enter a row (1, 2, or 3): ");
			    row = in.nextInt();
			    System.out.println("Enter a column (1, 2, 3): ");
			    column = in.nextInt();
			    
			    if(utility.outOfBounds(row, column)) {
			    	System.out.println("Out of bounds. Please try again");
			    } else if (board[row][column] != '-') {
			    	System.out.println("can't place, field already taken");
			    } else {
			    	//valid
			    	break;
			    }
		    }
	
		    utility.writeInBoard(board, row, column, symbol);
		    
		    //Win Check
		    if(utility.hasWon(board) == 'x') {
		    	System.out.println(player1name + " has won!");
		    	gameEnded = true;
		    } else if (utility.hasWon(board) == 'o') {
		    	System.out.println(player2name + " has won!");
		    	gameEnded = true;
		    } else {
		    	
		    	if(utility.hasTie(board)) {
		    		System.out.println("Tie! No Winner!");
		    		gameEnded = true;
		    	} else {
		    		//continue game and toggles turn
		    		isP1 = !isP1;
		    		
		    	}
		    }
	    }	
	    in.close();
	    PrintBoard.printBoard(board);
	}
}
