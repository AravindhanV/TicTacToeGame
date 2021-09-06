package com.bridgelabz.tictactoegame;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToeGame {
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		char[] gameGrid = createGrid();
		char playerSymbol = chooseSymbol();
		char computerSymbol = playerSymbol == 'X' ? 'O' : 'X';
	}
	
	public static char chooseSymbol() {
		System.out.println("Which character you want to play as, X or O?");
		return scanner.next().toUpperCase().charAt(0);
	}	
	
	public static char[] createGrid() {
		char[] grid = new char[10];
		Arrays.fill(grid, ' ');
		grid[0] = '\u0000';
		return grid;
	}
}
