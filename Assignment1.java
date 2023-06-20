/*
 Class: CMSC203 CRN 40398
 Program: Assignment #1
 Instructor: Eivazi 
 Summary of Description: Color picker game
 Due Date: 6/20/23
 Integrity Pledge: I pledge that I have completed the programming assignment independently.
 I have not copied the code from a student or any source.
 Shawn Parmhans
 */
import java.util.Scanner;
import java.util.Random;

public class Assignment1 
{
	public static void main(String[] args)
	{
		//declaration
		Random rand = new Random();
		Scanner keyboard = new Scanner(System.in);
		int num, guess, total = 0;
		String name, ID, description;
		//Get info from user
		System.out.print("Enter your name: ");
		name = keyboard.nextLine();
		System.out.print("Enter your MC M#: ");
		ID = keyboard.next();
		keyboard.nextLine();
		System.out.print("Describe yourself: ");
		description = keyboard.nextLine();
		
		System.out.println("CMSC203 Assignment1: Test your ESP skills");
		//All 10 matches
		for(int i = 1; i < 11; i++)
		{
			num = rand.nextInt(5);
			System.out.println("Round " + i + "\n");
			System.out.println("Is it Red, Green, Blue, Orange, or Yellow?");
			System.out.print("Enter your guess here: ");
			guess = keyboard.nextInt();
			if(guess == num)
				total++;
			if(num == 0)
				System.out.println("I was thinking of Red.");
			if(num == 1)
				System.out.println("I was thinking of Green.");
			if(num == 2)
				System.out.println("I was thinking of Blue.");
			if(num == 3)
				System.out.println("I was thinking of Orange.");
			if(num == 4)
				System.out.println("I was thinking of Yellow.");
		}
		System.out.println("Game Over \n");
		System.out.println("You guessed " + total + " out of 10 colors correctly.");
		System.out.println("User Name: " + name);
		System.out.println("Student MC ID: " + ID);
		System.out.println("User Description: " + description);
		
	}
}
