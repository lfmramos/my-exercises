public class ClosestNeighbours{
	public static void main(String[] args){

	int[] numbers = {0, 5, 1209, 6, 2, 111, 112, 33};
	
	// hint: remember Math.abs();
	int minDifference = Integer.MAX_VALUE;
	int[] neighbours = new int[2];

	for (int i = 0; i < numbers.length - 1; i++){
			int difference = Math.abs(numbers[i] - numbers[i+1]); // 5
			if (difference < minDifference){
				minDifference = difference;
				neighbours[0] = numbers[i];
				neighbours[1] = numbers[i+1];
		}
		}
	System.out.println("The two numbers with the smallest difference between them are " + neighbours[0] + " and " + neighbours[1]);
	}
}
