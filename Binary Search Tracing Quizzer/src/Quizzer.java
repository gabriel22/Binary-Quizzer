import java.util.ArrayList;
import java.lang.Math;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;


public class Quizzer
	{
	static ArrayList myArray = new ArrayList();
	static int number=0;
	static Scanner guess = new Scanner(System.in);
	static int target;
	static int targetNumber = 0;
	static int counter =0;
	static int total;
	static int pass;


	public static void main(String[] args)
		{
		fillArray();
		getTarget();
		quiz();
		}
	
	public static void fillArray()
		{
		do 
			{
			System.out.println("Please enter numbers 1-20 to fill your array. When you are satisfied enter -1.");
			Scanner userInput = new Scanner(System.in);
			number = userInput.nextInt();
			if(number==-1)
				{
				break;
				}
			if(number<=0)
				{
				System.out.println("Please try again. Number was below 1.");
				}
			if(number>=21)
				{
				System.out.println("Please try again. Number was above 20.");
				}
			else
				{
				myArray.add(number);
				}
			}
		while(number!=-1);
		Collections.sort(myArray);
		System.out.println("Here is your array: " + myArray);
		}
	
	public static void getTarget()
		{	
		target = (int) (Math.random() * myArray.size());
		target = (int) myArray.get(target);
		System.out.println("The target is " + target);
		}
	
	 public static void quiz()
	 {
	 	int left = 0; 
	 	int right = myArray.size() -1;
	 	
	 	while(left <= right) 
	 		{ 
	 		int middle = (left +  right)/2; 
	 		System.out.println("What is the left position?"); 
	 		int inputLeft = guess.nextInt(); 
	 		if(inputLeft == left) 
	 		{ 
	 		System.out.println("Great! That is correct!"); 
	 		counter ++; 
	 		total ++; 
	 		} 
	 		else 
	 			{ 
	 			System.out.println("Incorrectt, the left is  " + left + "."); 
	 			total ++; 
	 			} 
	 		 
	 		System.out.println("What is the right position?"); 
	 		int inputRight = guess.nextInt(); 
	 		if(inputRight == right) 
	 		{ 
	 		System.out.println("Great! That is correct!"); 
	 		counter ++; 
	 		total ++; 
	 		} 
	 		else 
	 			{ 
	 			System.out.println("Incorrect, the right is " + right + "."); 
	 			total ++; 
				} 
	 
	 
	 		System.out.println("What is the middle position?"); 
	 		int inputMiddle = guess.nextInt(); 
	 		if(inputMiddle == middle) 
	 		{ 
	 		System.out.println("Great! That is correct!"); 
			counter ++; 
	 		total ++; 
	 		} 
	 		else 
	 			{ 
	 			System.out.println("Incorrect, the middle is " + middle + "."); 
	 			total ++; 
	 			} 
	 		 
	 		System.out.println("What is the int at the middle position?"); 
	 		int inputMiddleValue = guess.nextInt(); 
	 		if(inputMiddleValue == (int) myArray.get(middle)) 
	 		{ 
	 		System.out.println("Great! That is correct!"); 
	 		counter ++; 
	 		total ++; 
			} 
	 		else 
	 			{ 
	 			System.out.println("Incorrect, the middle value is " + myArray.get(middle) + "."); 
	 			total ++; 
	 			} 
	 		 
	 		 
	 		if(target < (int) myArray.get(middle)) 
	 			{ 
	 			right = middle - 1; 
	 			pass++; 
	 			System.out.println("This is the end of pass " + pass + "."); 
	 			System.out.println(); 
	 			} 
	 		else if(target > (int) myArray.get(middle)) 
	 			{ 
	 			left = middle + 1; 
	 			pass++; 
	 			System.out.println("This is the end of pass " + pass + "."); 
	 			System.out.println(); 
	 			} 
	 		else 
	 			{ 
	 			System.out.println(middle); 
	 			System.out.println("Your score is " + counter + " out of " + total +  " points from this quizzer!"); 
			break; 
	 			} 
	 
	 
	 		}


	}
}

