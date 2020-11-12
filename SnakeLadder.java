package com.snakeladder;

public class SnakeLadderGameUC2 {
	private int player1;
	public void snakeLadder()
	{
		player1=0;
		player1= (int)((Math.random()*10)%6);
		 System.out.println("after rolling dice random value " + player1);
	}
    public static void main(String[] args) {
		System.out.println("Welcome to Snake Ladder Game");
		SnakeLadderGameUC2 game = new SnakeLadderGameUC2();
	      game.snakeLadder();
	}
}
