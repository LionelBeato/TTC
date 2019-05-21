
public class Lab_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//step one of the lab, declarations etc...
		
		int firstInt = 6;
		int secondInt = 20;
		int thirdInt = 0;
		
		float firstFloat = 4.4f; 
		
		boolean isCold = false; 
		double firstDoub = 500_000_000;
		
		//step two of the lab
		
		int b = firstInt + secondInt;
		System.out.println(b);
		
		int s = firstInt + thirdInt;
		System.out.println(s);
		
		System.out.println((double)firstInt / secondInt);
		System.out.println(secondInt % firstInt);
		
		int c = (secondInt % firstInt) + firstInt; 
		c++;
		System.out.println(c);
		
		// step three of lab
		
		int x = 100; 
		boolean ol  = (x == 100);
		int y = 106;
		System.out.println(x > y);
		System.out.println(y > x);
		System.out.println(x >= y-6);

		int z = 92; 
		System.out.println(x < y && y < z);
		System.out.println(y < z &&  x >= z );
		System.out.println(y < z && x >= y);
		System.out.println(z > (y+x) || (x-y) > z);
		System.out.println(x < y != x > y);
		
		// step four of lab
		
		int n = 49;
		System.out.println(n/2 == n>>1);
		System.out.println(n * 2 ==n<<1);
		System.out.println(n/4 == n>>2);


		
		
		// step five of lab
		
		anotherMethod();
		
		//step seven in main
		
		playWithStrings();

	}
	
	public static void anotherMethod()
    {
		
		//step six of lab (changing ints to Integers)
		
		Integer r = 44;
		Integer v = r/2;
		String tho = "1000";
		Integer l = Integer.parseInt(tho);

		
		if (0 > r.compareTo(l)) {
			System.out.println(r+" is a pretty big value");
			System.out.println(v+" is half of "+r);
			
			}
			else {
				System.out.println(r+" is not a pretty big value");
				System.out.println(v+" is definitely small");
			}
			

			
		

    }
	
	//step seven of the lab
	
	public static void playWithStrings()
	{
		String firstName = "Lionel";
		String lastName =  "Beato";
		String fullName = firstName.concat(" "+lastName);
		System.out.println(fullName);
		System.out.println(firstName+" "+lastName);
		
		
		// - what is the total length of the string?

		System.out.println("The full length of "+fullName+" is "+fullName.length());
		
	    //- index of the first 'o'
		System.out.println("The index of the first 'o' is "+fullName.indexOf("o"));
		
		   // - which letter is at position 7?

		System.out.println(fullName.charAt(7)+" is at position 7.");
		
		   // - does the full name contain the word "son"?

		System.out.println(fullName.contains("son")+", the full name does not contain 'son'");
		
		   // - what are the last 5 letters in the full name?
		
		System.out.println("The last 5 letters in my full name are as follows: ");
		
	

		System.out.println(fullName.charAt(fullName.length()-1));
		System.out.println(fullName.charAt(fullName.length()-2));
		System.out.println(fullName.charAt(fullName.length()-3));
		System.out.println(fullName.charAt(fullName.length()-4));
		System.out.println(fullName.charAt(fullName.length()-5));
		
		   // - does the full name contain an apostrophie or dash?

		System.out.println(fullName.contains("-")+", the full name does not contain a dash! "+fullName.contains("'")+", the full name does not contain an apostrophe!");

		

//that's it, there's no more 



		
	}
}


