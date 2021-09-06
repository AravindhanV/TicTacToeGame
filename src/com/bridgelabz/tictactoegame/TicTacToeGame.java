package com.bridgelabz.tictactoegame;

import java.util.Arrays;

public class TicTacToeGame {
	public static void main(String[] args) {
		char[] gameGrid = createGrid();
	}
	
	public static char[] createGrid() {
		char[] grid = new char[10];
		Arrays.fill(grid, ' ');
		return grid;
	}
}
