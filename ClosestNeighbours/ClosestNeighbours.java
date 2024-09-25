public class ClosestNeighbours{
	public static void main(String[] args){

	int[] numbers = {0, 5, 1209, 6, 2, 111, 112, 33};
	
	int minDifference = Math.abs(numbers[0] - numbers[1]);
	int firstNumber = numbers[0];
	int secondNumber = numbers[1];

	// hint: remember Math.abs();
	for (int i = 0; i < (numbers.length)-1; i++){
		for (int j = i + 1; j < numbers.length; j++){
			int difference = Math.abs(numbers[i] - numbers[j]);
			if(difference < minDifference){
				minDifference = difference;
				firstNumber = numbers[i];
				secondNumber = numbers[j];
			}
		}
	}
	// print result here
	System.out.println("The two numbers with the smallest difference between them are " + firstNumber + " and " + secondNumber);
	}
}
