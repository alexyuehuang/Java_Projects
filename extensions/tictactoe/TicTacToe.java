package tictactoe;

public class TicTacToe  {

	// avoids Javdoc entry: all methods for this work are static
	private TicTacToe() {

	}

	/**
	 * Generate an initial board
	 * @return a 3x3 String[][] array with each element set to a single blank string (" ").
	 */
	public static String[][] genBoard() {
		String[][]a = new String [3][3];
		for (int i=0; i<3; i++) {
			for (int j=0; j<3;j++) {
				a[i][j] = " ";
			}
		}
		return a;
	}

	/**
	 * Check that the specified player is "x" or "o" and throw an
	 *   IllegalArgumentException if it is not.
	 * @param player should be "x" or "o"
	 */
	public static void verifyValidPlayer(String player) {
		if (player.equals("x") || player.equals("o")) {
			return; // all is well
		}
		else {
			throw new IllegalArgumentException("Player must be a single x or o, but was instead " + player);
		}
	}

	/**
	 * Check that the row is between 0 and 2, inclusively, throwing IllegalArgumentException if not.
	 * @param row should be between 0 and 2, inclusively
	 */
	public static void verifyValidRow(int row) {
		if(row>=0&&row<3) {
			return;
		}
		else {
			throw new IllegalArgumentException("row must be 1 to 3, but was instead " +row);
		}
	}

	/**
	 * Check that the col is between 0 and 2, inclusively, throwing IllegalArgumentException if not.
	 * @param col should be between 0 and 2, inclusively
	 */
	public static void verifyValidCol(int col) {
		if(col>=0&&col<3) {
			return;
		}
		else {
			throw new IllegalArgumentException("row must be 1 to 3, but was instead " +col);
		}
	}


	/**
	 * Returns a standard view of the current board
	 * @param board the current 3x3 tic tac toe board
	 * @return a String that looks like a tic tac toe board
	 */
	public static String prettyString(String[][] board) {
		String ans = "";
		for (int r=0; r < board.length; ++r) {
			for (int c=0; c < board[r].length; ++c) {
				ans += "| " + board[r][c] + " ";
			}
			ans += "|\n";
		}
		return ans;
	}

	/**
	 * Record a move of the player at the row and column.  You must
	 * <UL>
	 *   <LI> Make sure the player is valid (call {@link #verifyValidPlayer(java.lang.String)})
	 *   <LI> Make sure the row and column are valid (call {@link #verifyValidRow(int)} and {@link #verifyValidCol(int)})
	 *   <LI> Make sure the board has no move at the row and column.  In other words,
	 *     it should have just a single space there.  If the board already
	 *     has a move there, return false.
	 *   <LI> Record the move at the row and column by storing the player
	 *     String at board[row][col], and return true.
	 * </UL>
	 * 
	 * @param player an "x" or an "o"
	 * @param board a 3x3 String[][] array
	 * @param row an integer between 0 and 2 inclusively
	 * @param col an integer between 0 and 2 inclusively
	 * @return true iff the move was successful
	 */
	public static boolean makeMove(String player, String[][] board, int row, int col) {
		verifyValidPlayer(player);
		verifyValidRow(row);
		verifyValidCol(col);
		if(board[row][col].equals(" ")){
			board[row][col] =player;
			return true;
		}
		else {
			return false; // FIXME
		}
	}

	/**
	 * Is the board completely full of x and o moves?
	 * @param board a 3x3 String[][] array
	 * @return true iff the board is full
	 */
	public static boolean boardFull(String[][] board) {
		int k=0;
		for (int r=0; r < board.length; ++r) {
			for (int c=0; c < board[r].length; ++c) {
				if(board[r][c].equals(" ")) {
				}
				else {
					k++;
				}
			}
		}
		if(k==9) {
			return true; 
		}
		else {
			return false;
		}
	}

	/**
	 * Does the board contain a win for the player?  If it does, this method must return true 
	 *   even if the board also contains a win for the other player.
	 * @param player An "x" or "o". Any other input should throw an IllegalArgumentException
	 * @param board A 3x3 String[][] array
	 * @return true iff the board contains some win for the specified player
	 */
	public static boolean winFor(String player, String[][] board) {
		verifyValidPlayer(player);
		boolean a = false;
		for (int r=0; r < board.length; ++r) {
			if(board[r][0].equals(board[r][1])&&board[r][1].equals(board[r][2])&&!board[r][1].equals(" ")) {
				a = true;
			}
			if(board[0][r].equals(board[1][r])&&board[1][r].equals(board[2][r])&&!board[1][r].equals(" ")) {
				a = true;
			}
			if(board[1][1].equals(board[2][2])&&board[0][0].equals(board[1][1])&&!board[1][1].equals(" ")) {
				a = true;
			}
			if(board[1][1].equals(board[0][2])&&board[2][0].equals(board[1][1])&&!board[1][1].equals(" ")) {
				a = true;
			}
		}
		return a; // FIXME
	}

}
