package com.snakeladder;

public class SnakeLadderGame {
	
	//player1 starting point
	private int player1 = 0;
	private final int NOPLAY = 1;
	private final int SNAKE = 2;
	private final int LADDER = 3;

	public void snakeLadder() {
		
		while (player1 < 100) {
			int playerPosition;
			
			//generating random value 1 to 6
			int dice = (int) ((Math.random() * 10) % 6);
			
			//generating random value to check
			int checkOption = (int) ((Math.random() * 10) % 3);
			switch (checkOption) {
			case NOPLAY:
				//no player
				playerPosition = player1;
				System.out.println("Player in same position " + playerPosition);
				break;
			case LADDER:
				//player move ahead
				playerPosition = player1 + dice;
				System.out.println("Player move ahead  in position " + playerPosition);
				break;
			case SNAKE:
				//player move behind
				playerPosition = player1 - dice;
				if (playerPosition < 0) {
					playerPosition = 0;
				}
				System.out.println("Player move behind in position " + playerPosition);
				break;
			}
		}
	}

	public static void main(String[] args) {
		SnakeLadderGame game = new SnakeLadderGame();
		game.snakeLadder();
	}
}
