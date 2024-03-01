package Resources;

public class ResourcesServices {
	
	public static String LoginResources()
	{
		String res = "/rest/auth/1/session";
		
		return res;
	}
	
	public static String getIssue(String JiraId)
	{
		String res = "/rest/api/2/issue/"+JiraId ;
		return res;
	}

}
