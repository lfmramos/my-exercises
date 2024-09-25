public class MissingChar{
	public static void main(String[] args){
	String word = "Robocop";
	int characterIndex = 3;

	String newWord1 = word.substring(0,3);
	String newWord2 = word.substring(4);

	System.out.println(newWord1 + newWord2);
	}
}
