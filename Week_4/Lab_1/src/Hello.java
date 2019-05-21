
public class Hello {
	
	static int methodCount;
	static String className;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int mainInt = 1;
		float mcFloat = 845.4f;
		
		System.out.println("Method Count: "+ methodCount);
		System.out.println("Class Name: "+ className);
		System.out.println("Hello World");
		
		methodCount += mainInt;
		System.out.println("Method Count: "+ methodCount);
		
		//declared integers
		
		int x = 3;
		int y = 2;
		
		int z = x + y;
		System.out.println(z);
		System.out.println(x+y*z);
		System.out.println((x+y)*z);
		System.out.println(x+(y*z));
		
		//incrementing x by 15
		
		System.out.println(x+=15);
		
		//increment x by y
		
		System.out.println(x+=y);
		
		//print value of complex problem
		
		System.out.println(z += (x*2)-6);
		
		x = y = 13;
		z = 15;
		
		System.out.println(x == y);
		System.out.println(x <= y);
		System.out.println(x != y);
		System.out.println(x > y);
		System.out.println(z < (x+y));
		System.out.println(z > (x+2));
		
		
		
		//binary operator option 
		
		int a = 0b110010;
		int b = 0b10011;
		int c = 0b1000101;
		
		 c = a + b;
		 
		System.out.println("50 and 19: "+c);
		
		c = b>>>2;
		System.out.println("19 SHIFT RIGHT (NON CARRY) 2 is: "+c);
		System.out.println(String.format("In binary %s", Integer.toBinaryString(c)));
		
		c = (~a)>>2;
		
		System.out.println("50 COMP SHIFT RIGHT (CARRY) 2 is: " +  c);
		System.out.println(String.format("In binary %s", Integer.toBinaryString(c)));

	
		c = (~a)>>>2;
		
		System.out.println("50 COMP SHIFT RIGHT (NON CARRY) 2 is: " + c);
		System.out.println(String.format("In binary %s", Integer.toBinaryString(c)));

		
		//strings
		
		String firstName = "Johnny";
		String middle = "B.";
		String lastName = "Goode";
		String fulName = firstName+middle+lastName;
		String getName = "James";
		String getGetName = "James";
		String getGetGetName = "james";
		
		System.out.println(getName == getGetName);
        System.out.println(getName.equals(getGetGetName)); 
        
        //sentence string
        
        String sentence = "This is a mighty good sentence. Yes siree Bob, Mhmm!";
		System.out.println(sentence.contains("and"));
		
		char sth = sentence.charAt(15);
		
		System.out.println(sth);
		
		//finding instance of letter u
		
		int inst = sentence.indexOf("u");
		System.out.println(inst);
		
		//finding instance of letter c
		
		int inst2 = sentence.indexOf("c");
		System.out.println(inst2);
		
		//prints length of sentence
		
		int length = sentence.length(); 
		System.out.println(length);
		
		//check the start of sentence
		
		System.out.println(sentence.startsWith("The"));
		
		//string to number
		
		String nums = "22";
	    System.out.println(Integer.parseInt(nums));
		
		String nums1 = "89";
	    System.out.println(Integer.parseInt(nums1));
	    
		String nums2 = "93";
	    System.out.println(Integer.parseInt(nums2));
	    
	    //Wrappers practice 
	    
	    int d = 10;
	    Integer intObj = new Integer(d);
	    
	    String e = "88";	    




		
		
		
		
		

		
		
		
	}

	private static String concat(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
