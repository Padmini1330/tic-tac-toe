package com.bridgelabz.tictactoe;


import java.util.Scanner;

public class TicTacToeGame 
{
	public static char[] board= new char[10];
	
	public void createBoard()
	{
		for(int index=1;index<=9;index++)
		{
			board[index]=' ';
		}
	}
	
	public void getInput() 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Choose X or O");
		char playerMark=scanner.next().toUpperCase().charAt(0);
		char computerMark;
		if (playerMark=='X')
		{
			computerMark='O';
		}
		else
			computerMark='X';
		System.out.println("Player :" +playerMark+ " computer:" +computerMark);
		
		showBoard();
	}
	
	public void showBoard() 
	{
		int count=0;
		for(int index1=1;index1<=9;index1++)
		{
			System.out.print("|"+board[index1]+" ");
			count++;
			if(count==3)
			{
				System.out.println();
				count=0;
			}
			
		}
		
	}

	public static void main(String[] args) 
	{
		TicTacToeGame tictactoe=new TicTacToeGame();
		System.out.println("**Welcome to Tic-tac-toe game**");
		tictactoe.createBoard();
		tictactoe.getInput();
		
		
	}
	

}
