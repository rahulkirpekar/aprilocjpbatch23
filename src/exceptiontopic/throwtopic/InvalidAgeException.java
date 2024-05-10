package exceptiontopic.throwtopic;

// Exception---Checked
public class InvalidAgeException extends Exception
{
	public InvalidAgeException(String msg)
	{
		super(msg);
	}
}
