
public class TypeCasting {

	public static void main(String[] args) {

		//Type casting, we could store byte value into int, because java is casting from small to big
		//but we cannot store int value into byte, this we have to do manually 
		
		byte a = 1;
		short b=3;
		char c;
		int d = 4;
		long e;
		float f;
		double g;
				
		// Examples
		//we cast a byte into int
		int ex = a;
		System.out.println(ex);
		
		//we cast int into byte
		int x = (int)b ;
		System.out.println(x);
		
	}

}
