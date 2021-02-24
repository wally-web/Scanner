import java.util.ArrayList;
import java.util.Scanner;

public class WhileLoops {

	public static void main(String[] args) {

		String sentence = "The earth is flat!! is not it?";
		Scanner scan = new Scanner(sentence);
		ArrayList<String> words = new ArrayList<String>();
		
		while(scan.hasNext()) {
			words.add(scan.next());
		}
		
		System.out.println(words);
		
		
	}

}
