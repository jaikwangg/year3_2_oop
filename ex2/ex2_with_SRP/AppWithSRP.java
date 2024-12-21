package ex2.ex2_with_SRP;

import java.util.Scanner;

public class AppWithSRP {

	public static void main(String[] args) {
		System.out.println("Welcome to the Application!");

		// get a pair of values
		PairOfInput pair = PairOfInputProcessor.read(); 

		// check whether the inputs are valid
		if (PairOfInputProcessor.isValid(pair)) {
			
            int firstInt, secondInt;
            firstInt = Integer.parseInt(pair.getFirst());
            secondInt = Integer.parseInt(pair.getSecond());

			BinaryOperation operation = getOperationFromUser();

			//do the mathematical operation
		    int result = operation.operate(firstInt, secondInt);
			System.out.println("The result is: " + result);
        }
        else {
            System.out.println("Invalid number");
        }
		
		System.out.println("End of the application!");
	}

	private static BinaryOperation getOperationFromUser() {
		Scanner inp = new Scanner(System.in);
        System.out.println("Choose an operation: 1. Add, 2. Subtract");
        int choice = inp.nextInt();

        switch (choice) {
            case 1:
                return new Addition();
            case 2:
                return new Subtraction();
            default:
                System.out.println("Invalid choice. Defaulting to addition.");
                return new Addition();
        }
    }
}
