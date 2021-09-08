import java.util.Scanner;
import java.util.*;
import java.util.Arrays;


public class Project2
{
	public static void main(String[] args) 
	{
		
		
		getStudentInfo();
		
		
		
	}
	
	static void getStudentInfo()
	
	{

		 Scanner sc = new Scanner(System.in);

		    String [] Name = new String[5];

		    for(int i = 0; i < Name.length; i++) {

		        System.out.print("Enter student name: ");

		        Name[i] = sc.nextLine();}
		    
		     int[][] score = new int[5][5]; 
		     
		        Scanner in = new Scanner(System.in);
		        
		        for(int row = 0; row< score.length; row++){ 
		              for(int col = 0 ;col< score[row].length; col++){ 
		            	  
		            	  System.out.println("Enter grade for each course for " + Name[row] +
		  						" ");
		  				//Prompting to enter course grade
		  				System.out.println("ex" + (col+1) + ": ");
		                   
		                  int scores = in.nextInt(); 
		                if (ValidateUserInput(scores)== false) {
		                	System.out.println("You shall not insert a value below 0 or bigger than 100! Try it again");
		                    scores = in.nextInt();
		                }
		                score [row][col] = scores;
		     		   
		                
		           }
		              System.out.println(); 
		              findLowest(score); 
		              findHighest(score);
		             
		              calcScore(score);
		              
		          } 
		        
		   System.out.println(Arrays.deepToString(score));

		
	}
	
	
	static boolean ValidateUserInput(int score) {
		
		
		
		while (score < 0 || score > 100) {
			 return false;
		}
		return true;
	
		
	}
	
	
	
	
    public static int findHighest(int[][] numbers) {
        int maxValue = numbers[0][0];
        for (int j = 0; j < numbers.length; j++) {
            for (int i = 0; i < numbers[j].length; i++) {
                if (numbers[j][i] > maxValue) {
                    maxValue = numbers[j][i];
                }
            }
        }
        
		System.out.println("The maxvalue is " +maxValue);
		return maxValue;
        }

	
    public static int findLowest(int[][] numbers) {
        int minValue = numbers[0][0];
        for (int j = 0; j < numbers.length; j++) {
            for (int i = 0; i < numbers[j].length; i++) {
                if (numbers[j][i] < minValue) {
                    minValue = numbers[i][j];
                }
            }
        }
        
		System.out.println("The minvalue is " +minValue);
		return minValue;
        }
    

  

	static void calcScore(int [][] numbers)
	{
		double sum = 0;
		for(int column = 0; column < numbers.length; column++) {
		    for(int row = 0; row < numbers[column].length; row++) {
		        sum= sum + numbers[column][row];
		        
		    }
		}
		double average = sum /3;
		System.out.println("The average is " + average);
	}
	
	
	static void print()
	{
		
	}
}
