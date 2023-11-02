
public class ForLoopHomework {

	public static void main(String[] args) {
		
		
//		for ( int i=1 ; i<10; i++)
//		{
//		System.out.println(i);
//		}
//
//		
//		for (int i=1 ; i<10; i= i+2 )
//		
//		{
//		System.out.println(i);
//		}
		
		
		
		// Print Even and odd in reverse order
		
		for (int i=9; i>0; i--)
		{
			System.out.println(i);
		}
		
		
		
		for (int i=9; i>0; i= i-2)
		{
			System.out.println(i);
		}
		
		
		
		
		
		
		
		// print String into reverse order
		      //    0123456
		String s = "testingshagdkjsgdkjsdhkjshdkj";
		{
			System.out.println("lenghth is "+s.length());
		}
		
		for (int i =s.length()-1; i>=0; i--)
		{
			System.out.println(s.charAt(i));
		}
		
	}

}
