	import java.io.*;
	public class BasicCalculator
	{
	    
	    public static void main(String[] args) throws Exception
	    {
	    	BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
	    		
	    		int a;
	    		int b;
	    		
	    		System.out.println("Input your first number: ");
	    		a = Integer.parseInt(br.readLine());
	    		
	    		System.out.println("Input your second number: ");
	    		b = Integer.parseInt(br.readLine());
	    		
	    		int sum = a+b;
	    		int difference = a-b;
	    		int product = a*b;
	    		int qoutient = a/b;
	    		
	    		System.out.println( "The sum of " + a + " and " + b + " is " + sum);
	    		System.out.println( "The difference of " + a + " and " + b + " is " + difference);
	    		System.out.println( "The product of " + a + " and " + b + " is " + product);
	    		System.out.println( "The qoutient of " + a + " and " + b + " is " + qoutient);
	    		
	    }
	}