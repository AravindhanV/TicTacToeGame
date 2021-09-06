package com.bridgelabz.tictactoegame;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToeGame {
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		char[] gameGrid = createGrid();
		char playerSymbol = chooseSymbol();
		char computerSymbol = playerSymbol == 'X' ? 'O' : 'X';
		printGrid(gameGrid);
		playUserTurn(gameGrid, playerSymbol);
	}
	
	public static void playUserTurn(char[] gameGrid, char playerSymbol) {
		System.out.println("Enter location of next move (1-9)");
		int nextMove;
		while(true) {
			nextMove = Integer.parseInt(scanner.nextLine());
			if(gameGrid[nextMove]==' ') {
				break;
			} else {
				System.out.println("That spot is taken. Please re-enter choice");
			}
		}
		gameGrid[nextMove] = playerSymbol;
	}
	
	public static char chooseSymbol() {
		System.out.println("Which character you want to play as, X or O?");
		return scanner.nextLine().toUpperCase().charAt(0);
	}	
	
	public static char[] createGrid() {
		char[] grid = new char[10];
		Arrays.fill(grid, ' ');
		grid[0] = '\u0000';
		return grid;
	}
	
	public static void printGrid(char[] gameGrid) {
		for(int index=1;index<gameGrid.length;index++) {
			if(gameGrid[index]!=' ') {
				System.out.print(gameGrid[index]+"\t");
			} else {
				System.out.print("_\t");
			}

			if(index%3==0) {
				System.out.println();
			}
		}
	}
}
