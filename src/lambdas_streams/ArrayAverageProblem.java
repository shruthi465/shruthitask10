package lambdas_streams;
import java.util.Scanner;
public class ArrayAverageProblem {
    public static void main(String[] args) 
    {
        System.out .println("Java Program to find the average of a list of integers"); System.out.println("Please enter length of the array:");
        Scanner scnr = new Scanner(System.in);
        int length = scnr.nextInt();
        int[] input = new int[length];
        System.out.println("Please enter numbers ");
        for (int i = 0; i < length; i++) 
        { 
            input[i] = scnr.nextInt(); 
            
        } 
        float average = average(input); 
        System.out.print("Average of "); 
        for (int i = 0; i < length; i++) 
        { 
        	 System.out.print(+input[i]);
        	 if (i<length-1)
        	 System.out.print(",");
        } 
        System.out.println(" is: "+average);
        scnr.close(); 
        
    } 
    public static float average(int[] input)
    { 
        float sum = 0f;
        for (int number : input) 
        { 
            sum = sum + number;
        } 
    return sum / input.length;
    } 
    
}