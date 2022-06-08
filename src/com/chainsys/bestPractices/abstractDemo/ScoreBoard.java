package com.chainsys.bestPractices.abstractDemo;

public class ScoreBoard {
	public int TargetScore= 235;
	private ScoreBoard() {
		System.out.println("Object Created for scoreboard");
	}
	public static ScoreBoard createObject() {
		return new ScoreBoard();
	}
}