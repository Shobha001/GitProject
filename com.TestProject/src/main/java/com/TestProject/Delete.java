package com.TestProject;

public class Delete {
	
	
	public static void main(String[] args) {
		
		/*
		 * int x = 5; System.out.println(x < 5 && x < 6);
		 */
		
		int day = 1;
		switch (day){
		case 1:
			System.out.println("This is saturday"); 
			break;
		case 2:
			System.out.println("This is sunday"); 
			break;
	    default:
	    	System.out.println("Weekend has come"); 
	    }
			
		
		
		int y = 20; 
		String result = (y > 20) ? "good day" : "good evening";
		System.out.println(result); 
				
		System.out.println(10 == 9); 
		boolean b = true;
		System.out.println(b);
		
		
		System.out.println(Math.random());
		System.out.println(Math.max(7, 19));
		System.out.println(Math.min(7, 19));
		System.out.println(Math.sqrt(787));
		String str = "Hello";
		String str1 = "world";
		System.out.println(str +  str1);
		
		
		
		String a = "2";
		String b1 = "5";
		String z = a + b;
		System.out.println(z);
		
		
		String txt = "We are the so-called \'Vikings\' from the north."; 
		String text = "It\'s alright.";
		String txet = "The character \\ is called backslash.";
		String name = "Shobha\nKumari";
		String name1 = "Shobha\rKumari";
		String name2 = "Shobha\fKumari";
		System.out.println(name2);
		System.out.println(name);
		System.out.println(text);
		System.out.println(txet);
		System.out.println(txt);
		System.out.println(str.length());
		System.out.println(str.charAt(5));
		System.out.println(str.codePointAt(3));
		System.out.println(str.endsWith("b"));
		System.out.println(str.compareTo("sobha"));
		System.out.println(str.concat("K"));
		System.out.println(str.substring(5));
		System.out.println("The length of the txt string is: " + str.length());
		System.out.println("The length of the txt string is: " + str.toLowerCase());
		System.out.println("The length of the txt string is: " + str.toUpperCase());
		System.out.println(str.indexOf("world"));
		
		//System.out.println(Delete.test("Hello World"));
		
		//System.out.println("result = " + result);
	}

	
	/*
	 * static boolean isHelloWorld(String str) { return str == "Hello World"; return
	 * str.equals("Helllo World");
	 * 
	 * return "Hello World".equals(str);
	 * 
	 * System.out.println(str);
	 * 
	 * 
	 * 
	 * }
	 */
	
	/*static boolean test(String str){
		
		 * if (str.equalsIgnoreCase("Hello world"))
		 * 
		 * return true;
		 * 
		 * return false;
		 
		
		return "Hello World".equals(str);*/
}

