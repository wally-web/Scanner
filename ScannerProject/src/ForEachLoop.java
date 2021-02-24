import java.util.ArrayList;

public class ForEachLoop {


	public static void main(String[] args) {

		String[] cars = {"BMW M2", "Veloster N", "GTI", "Z4"};
		
		//This is a For each loop
	    for(String car : cars )		{
			System.out.println(car);
				}
		//For each loop with ArrayList
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(3);
		numbers.add(7);
		numbers.add(9);
		
		for(int a : numbers) {
			System.out.println(a);
		}
		
		
		
		//This is a for loop
		//for(int i = 0; i < cars.length; i++) {
		//System.out.println(cars[i]);
		//		}
		
		
	}

}
