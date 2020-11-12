package com.snakeladder;

public class SnakeLadderGame {
	private int player1;
	private int diceCount;
	private final int NOPLAY = 1;
	private final int SNAKE = 2;
	private final int LADDER = 3;

	public void snakeLadder() {
		//player starting position
		player1 = 0;
		
		//generating random value 1 to 6
		player1 = (int) ((Math.random() * 10) % 6);
		System.out.println("after rolling dice random value " + player1);
		int position=0;
		
		//generating random value to check
		int option = (int) ((Math.random() * 10) % 3);
		switch (option) {
		case NOPLAY:
			//no player
			position = player1;
			System.out.println("Player in same position " + position);
			break;
		case LADDER:
			//player move ahead
			position = player1 + diceCount;
			System.out.println("Player move ahead  in position " + position);
			break;
		case SNAKE:
			//player move behind
			position = player1 - diceCount;
			System.out.println("Player move behind in position " + position);
			break;
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Snake Ladder Game");
		SnakeLadderGame game = new SnakeLadderGameUC3();
		game.snakeLadder();
	}
}
