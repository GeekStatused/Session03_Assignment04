import java.util.Scanner;

public class Assignment04 {

	//state of class
	double result;
	
	
	
	//constructor
	public Assignment04(double result){
		
		this.result = result;
	}
	
	
	//Method to get the calculations and get user input
	public void calculation(){
		
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Please enter your first number");
		double numInput = userInput.nextDouble();
		System.out.println("Please enter your second number");
		double numInput2 = userInput.nextDouble();
		System.out.println("Please choose what operation you want");
		System.out.println(" 1 for Addition");
		System.out.println(" 2 for Subtraction");
		System.out.println(" 3 for multiplication");
		System.out.println(" 4 for division");
		int opDecision = userInput.nextInt();
		
		switch(opDecision){
		
		case 1:
			result = numInput + numInput2;
			System.out.println("Your result is " + result);
			break;
		case 2:
			result = numInput - numInput2;
			System.out.println("Your result is "+ result);
			break;
		case 3:
			result = numInput * numInput2;
			System.out.println("Your result is "+ result);
			break;
		case 4:
			result = numInput / numInput2;
			System.out.println("Your result is "+ result);
			break;
			
			
		
		}
		
		
		
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a = 0;
		
		Assignment04 calculator = new Assignment04(a);
		
		calculator.calculation();

	}

}
