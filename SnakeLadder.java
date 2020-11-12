package com.snakeladder;

public class SnakeLaddereGame {
	private int player1;

	 //player1 starting position
	public int snakeLadder() {
		player1 = 0;
		return player1;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Snake Ladder Game");
		SnakeLaddereGame game = new SnakeLaddereGame();
		System.out.println(game.snakeLadder());
	}
}
