package edu.cis232;

public class FirstExample {

	public static void main(String[] args) {
		String input = "this is my starting string";
		StringBuilder sbInput = new StringBuilder(input);
		sbInput.append(". this is a second sentence.");
		System.out.println("After appending a string:\n" + sbInput);
		
		//we can replace regions of the string with replace method
		sbInput.replace(0, 7, "hello");
		System.out.println("\nAfter replacing the first 7 characters:\n" + sbInput);
		
		sbInput.delete(0, 7);
		System.out.println("\nAfter deleting the first 7 characters:\n" + sbInput);
		
		sbInput.deleteCharAt(sbInput.indexOf("."));
		System.out.println("\nAfter deleting the first .:\n" + sbInput);
		
		sbInput.setCharAt(0, 'A');
		System.out.println("\nAfter replacing index 0 with 'A':\n" + sbInput);
		
		sbInput.insert(17, " and");
		System.out.println("\nAfter inserting \" and\" at index 17:\n" + sbInput);
		
		String finalValue = sbInput.toString();
		System.out.println("\nFinal Value:\n" + finalValue);
	}

}
