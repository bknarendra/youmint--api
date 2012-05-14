import java.io.*;
public class A
{
	public static void main(String args[]) 
	{
		try
		{
			DataInputStream in=new DataInputStream(System.in);
			System.out.print("\nEnter the phone no of the recipient : ");
			String phno=in.readLine();
			System.out.print("\n\nEnter the message to be sent : \t");
			String msg=in.readLine();
			SMS.send("your username goes here", "your password goes here", phno, msg);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
		