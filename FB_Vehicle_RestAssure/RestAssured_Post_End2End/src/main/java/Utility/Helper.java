package Utility;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;

public class Helper {
	
	
	public static String ReadStaticJson(String Path) throws IOException
	{
		return new String(Files.readAllBytes(Paths.get(Path)));
	}

	
	
	public static String randomString(int limit) 
	{
		 
	    int leftLimit = 97; // letter 'a'
	    int rightLimit = 122; // letter 'z'
	    int targetStringLength = limit ;
	    Random random = new Random();
	    StringBuilder buffer = new StringBuilder(targetStringLength);
	    for (int i = 0; i < targetStringLength; i++) {
	        int randomLimitedInt = leftLimit + (int) 
	          (random.nextFloat() * (rightLimit - leftLimit + 1));
	        buffer.append((char) randomLimitedInt);
	    }
	    String generatedString = buffer.toString();

	    //System.out.println(generatedString);
		
	    return generatedString;
	    
	 
	    
	}
}
