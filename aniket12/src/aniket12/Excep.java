package aniket12;

public class Excep {
public static boolean isvalidUser(String user) throws InvalidUser
{
	if(!user.equals("admin"))
			{
				throw new InvalidUser("you are Invalid");
				
			}
			return true;
}
			public static void main(String [] args)
			{
				try
				{
					isvalidUser("admingggg");
				
				}catch(InvalidUser e)
				{
					System.out.println(e.getmessage());
				}
			}
			
			
}
			
			class InvalidUser extends Exception
			{
				public InvalidUser()
				{
					
				}
				InvalidUser(String message)
				{
					System.out.println("yessss");
				}
		public String getmessage()
		{
			return "this is invalid user ";
		}
			}

