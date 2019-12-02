package string;

public class ArrayDemo {

	public static void main(String[] args) {
		/*
		 * String s = "Hello Kenneth !";
		 * System.out.println(s.length()); for (int i = 0; i < s.length(); i++) {
		 * System.out.println("Length of array : " + s.charAt(i)); } String s1 =
		 * "Hello"; String s2 = " Kenneth"; String s3 = "!"; String s4 = s1 + s2 + s3;
		 * System.out.println("Concat Array \t : " + s4);
		 * System.out.println("Upper Case Array : " + s4.toUpperCase());
		 * System.out.println("Lower Case Array : " + s4.toLowerCase());
		 */
//		---------------------------------------------------------------------
		/**
		 * substring(s1,s2);
		 */
		String s = "Hi, welcome to course JavaCore";
		String s1 = "Using substring : " + s.substring(4, 11);
		System.out.println(s1);
		String s2 = "Using concat : " + s.concat(s1);
		System.out.println(s2);
		String s3 = "welcome";
		System.out.println("Using contains : " + s.contains(s3));
		
		
		
	}

}
/**
 * About function basic : + UpperCase() : + LowerCase() : + Concat() : +
 * Contains() : + indexOf() : +
 */