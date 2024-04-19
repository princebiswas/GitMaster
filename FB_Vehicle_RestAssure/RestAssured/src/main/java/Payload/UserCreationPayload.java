package Payload;

public class UserCreationPayload {
	
	

	public static String UserCreation(String UN , String Fn , String LN , String Email)

	
	{
		
		String body = "{\r\n"
				+ "  \"id\": 0,\r\n"
				+ "  \"username\": \""+UN+"\",\r\n"
				+ "  \"firstName\": \""+Fn+"\",\r\n"
				+ "  \"lastName\": \""+LN+"\",\r\n"
				+ "  \"email\": \""+Email+"\",\r\n"
				+ "  \"password\": \"12345\",\r\n"
				+ "  \"phone\": \"3245435435\",\r\n"
				+ "  \"userStatus\": 0\r\n"
				+ "}";
		
		return body;
	}
	


}
