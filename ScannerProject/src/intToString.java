
public class intToString {

	public static void main(String[] args) {
		
		//Convert int to a String
		int a = 10;		
		String f = Integer.toString(a);
		System.out.println(f + 10);
		
		//Convert String to an int		
		String b = "20";
		System.out.println(Integer.parseInt(b) + 10);
		
		
		//Regular expression
		String c = "his age is 20";
		c= c.replaceAll("\\D+", "");
		int d = Integer.parseInt(c);
		System.out.println(d + 5);
		
		
		 
		
	}

}
