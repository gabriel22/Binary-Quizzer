import java.util.ArrayList;
import java.lang.Math;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;


public class Quizzer
	{
	static ArrayList myArray = new ArrayList();
	static int number=0;
	static int target;
	static int targetNumber = 0;


	public static void main(String[] args)
		{
		fillArray();
		getTarget();
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
	
	public static int binarySearch(int[] elements, int target)
		{
		int left = 0;
		int right = elements.length - 1;
		
			int middle = (left + right)/2;
			if(target <elements[middle])
				{
				right = middle - 1;
				}
			else if(target > elements[middle])
				{
				left = middle + 1;
				}
			else
				{
				return middle;
				}	
		}
	
	public static void correctRight()
		{
		
		}

	}
