package com.bridgelabz.tictactoegame;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToeGame {
	public static Scanner scanner = new Scanner(System.in);
	public static char[] gameGrid = createGrid();
	public static int nextMove;
	public static int currentPlayer;

	public static void main(String[] args) {
		char playerSymbol = chooseSymbol();
		char computerSymbol = playerSymbol == 'X' ? 'O' : 'X';
		currentPlayer = decideFirstPlayer();
		printGrid(gameGrid);
		playUserTurn(gameGrid, playerSymbol);
		checkWinner(playerSymbol);
	}

	public static int decideFirstPlayer() {
		int firstPlayer = (int) Math.floor(Math.random() * 2);
		String firstPlayerName = firstPlayer == 0 ? "Player" : "Computer";
		System.out.println(firstPlayerName + " will play first");
		return firstPlayer;
	}

	public static void playUserTurn(char[] gameGrid, char playerSymbol) {
		System.out.println("Enter location of next move (1-9)");
		while (true) {
			nextMove = Integer.parseInt(scanner.nextLine());
			if (gameGrid[nextMove] == ' ') {
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

	public static boolean checkDraw() {
		for (int index = 0; index < gameGrid[index]; index++) {
			if (gameGrid[index] != ' ') {
				return false;
			}
		}
		return true;
	}

	public static boolean checkWinOrBlockMove(char player) {
		if (gameGrid[1] == player && gameGrid[2] == player && gameGrid[3] == ' ') {
			nextMove = 3;
			return true;
		}
		if (gameGrid[1] == player && gameGrid[3] == player && gameGrid[2] == ' ') {
			nextMove = 2;
			return true;
		}
		if (gameGrid[3] == player && gameGrid[2] == player && gameGrid[1] == ' ') {
			nextMove = 1;
			return true;
		}
		if (gameGrid[4] == player && gameGrid[5] == player && gameGrid[6] == ' ') {
			nextMove = 6;
			return true;
		}
		if (gameGrid[4] == player && gameGrid[6] == player && gameGrid[5] == ' ') {
			nextMove = 5;
			return true;
		}
		if (gameGrid[6] == player && gameGrid[5] == player && gameGrid[4] == ' ') {
			nextMove = 4;
			return true;
		}
		if (gameGrid[7] == player && gameGrid[8] == player && gameGrid[9] == ' ') {
			nextMove = 9;
			return true;
		}
		if (gameGrid[7] == player && gameGrid[9] == player && gameGrid[8] == ' ') {
			nextMove = 8;
			return true;
		}
		if (gameGrid[9] == player && gameGrid[8] == player && gameGrid[7] == ' ') {
			nextMove = 7;
			return true;
		}
		if (gameGrid[1] == player && gameGrid[4] == player && gameGrid[7] == ' ') {
			nextMove = 7;
			return true;
		}
		if (gameGrid[1] == player && gameGrid[7] == player && gameGrid[4] == ' ') {
			nextMove = 4;
			return true;
		}
		if (gameGrid[7] == player && gameGrid[4] == player && gameGrid[1] == ' ') {
			nextMove = 1;
			return true;
		}
		if (gameGrid[2] == player && gameGrid[5] == player && gameGrid[8] == ' ') {
			nextMove = 8;
			return true;
		}
		if (gameGrid[2] == player && gameGrid[8] == player && gameGrid[5] == ' ') {
			nextMove = 5;
			return true;
		}
		if (gameGrid[8] == player && gameGrid[5] == player && gameGrid[2] == ' ') {
			nextMove = 2;
			return true;
		}
		if (gameGrid[3] == player && gameGrid[6] == player && gameGrid[9] == ' ') {
			nextMove = 9;
			return true;
		}
		if (gameGrid[3] == player && gameGrid[9] == player && gameGrid[6] == ' ') {
			nextMove = 6;
			return true;
		}
		if (gameGrid[9] == player && gameGrid[6] == player && gameGrid[3] == ' ') {
			nextMove = 3;
			return true;
		}
		if (gameGrid[1] == player && gameGrid[5] == player && gameGrid[9] == ' ') {
			nextMove = 9;
			return true;
		}
		if (gameGrid[1] == player && gameGrid[9] == player && gameGrid[5] == ' ') {
			nextMove = 5;
			return true;
		}
		if (gameGrid[9] == player && gameGrid[5] == player && gameGrid[1] == ' ') {
			nextMove = 1;
			return true;
		}
		if (gameGrid[3] == player && gameGrid[5] == player && gameGrid[7] == ' ') {
			nextMove = 7;
			return true;
		}
		if (gameGrid[3] == player && gameGrid[7] == player && gameGrid[5] == ' ') {
			nextMove = 5;
			return true;
		}
		if (gameGrid[7] == player && gameGrid[5] == player && gameGrid[3] == ' ') {
			nextMove = 3;
			return true;
		} else
			return false;
	}

	public static boolean checkWinner(char player) {
		if (gameGrid[1] == player && gameGrid[2] == player && gameGrid[3] == player)
			return true;
		if (gameGrid[4] == player && gameGrid[5] == player && gameGrid[6] == player)
			return true;
		if (gameGrid[7] == player && gameGrid[8] == player && gameGrid[9] == player)
			return true;
		if (gameGrid[1] == player && gameGrid[4] == player && gameGrid[7] == player)
			return true;
		if (gameGrid[2] == player && gameGrid[5] == player && gameGrid[8] == player)
			return true;
		if (gameGrid[3] == player && gameGrid[6] == player && gameGrid[9] == player)
			return true;
		if (gameGrid[1] == player && gameGrid[5] == player && gameGrid[9] == player)
			return true;
		if (gameGrid[3] == player && gameGrid[5] == player && gameGrid[7] == player)
			return true;
		return false;

	}

	public static char[] createGrid() {
		char[] grid = new char[10];
		Arrays.fill(grid, ' ');
		grid[0] = '\u0000';
		return grid;
	}

	public static void printGrid(char[] gameGrid) {
		for (int index = 1; index < gameGrid.length; index++) {
			if (gameGrid[index] != ' ') {
				System.out.print(gameGrid[index] + "\t");
			} else {
				System.out.print("_\t");
			}

			if (index % 3 == 0) {
				System.out.println();
			}
		}
	}
}
