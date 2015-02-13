
public class GameRunner
	{
		public static boolean gameContinues= true;
		public static void main(String[] args)
			{
				Board.setUp();
				Board.displayBoard();
				Player.askPlayerName();
				Board.displayBoard();
				
				while (gameContinues)
					{

				PlayerMove.askForMove();
				Board.displayBoard();
				Board.gamewon();
				AI.easycomputermove();
				Board.displayBoard();
				Board.gamewon();
					}
			
			}
		

	}

